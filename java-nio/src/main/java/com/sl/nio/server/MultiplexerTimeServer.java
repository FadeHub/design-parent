package com.sl.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shuliangzhao
 * @Title: MultiplexerTimeServer
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/11 16:06
 */
public class MultiplexerTimeServer implements Runnable {

    private Selector selector;

    private ServerSocketChannel serverSocketChannel;
    
    private volatile boolean stop;

    public MultiplexerTimeServer(int port) {
        try {
            selector = Selector.open();
            serverSocketChannel = ServerSocketChannel.open();
            //设置为非阻塞模式
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(port),1024);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("The time server is start in port：" + port);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void stop() {
        this.stop = true;
    }

    public void run() {
        while (!stop) {
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                SelectionKey key = null;
                while (iterator.hasNext()) {
                    key = iterator.next();
                    iterator.remove();
                    try {
                        handleInput(key);
                    } catch (Exception e) {
                        if (key != null) {
                            key.cancel();
                            if (key.channel() != null) {
                                key.channel().close();
                            }
                        }
                    }
                }
            }catch (Throwable t) {
                 t.printStackTrace();
            }

        }

        //多路复用器关闭后，所有注册上面的Channel和Pipe等资源都会自动注册并关闭
        //所以不需要重复释放资源
        if (selector != null) {
            try {
                selector.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInput(SelectionKey key) throws Exception {
        if (key.isValid()) {
             if (key.isAcceptable()) {
                 ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                 SocketChannel accept = channel.accept();
                 accept.configureBlocking(false);
                 accept.register(selector,SelectionKey.OP_READ);
             }
             if (key.isReadable()) {
                 SocketChannel channel = (SocketChannel) key.channel();
                 ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                 int readBytes = channel.read(readBuffer);
                 if (readBytes > 0) {
                     readBuffer.flip();
                     byte[] bytes = new byte[readBuffer.remaining()];
                     readBuffer.get(bytes);
                     String body = new String(bytes,"UTF-8");
                     System.out.println("the time server receive order : " + body);
                     String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ?
                             new Date(System.currentTimeMillis()).toString(): "BAD ORDER";
                     doWrite(channel,currentTime);
                 } else if (readBytes < 0) {
                     key.cancel();
                     channel.close();
                 } else {
                     // 读到0字节将忽略
                 }
             }
        }
    }

    private void doWrite(SocketChannel channel, String response) throws Exception {
        if (response != null && response.trim().length() > 0) {
            byte[] bytes = response.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            channel.write(writeBuffer);
        }
    }
}
