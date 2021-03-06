package com.sl.dnetty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author shuliangzhao
 * @Title: TimeClient
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/13 21:13
 */
public class TimeClient {

    static class MyThread implements Runnable{

        public void run() {
            try {
                connect(8080, "localhost") ;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void connect(int port, String host) throws Exception {
            // 配置客户端NIO线程组
            EventLoopGroup group = new NioEventLoopGroup();
            try {
                Bootstrap b = new Bootstrap();
                b.group(group).channel(NioSocketChannel.class)
                        .option(ChannelOption.TCP_NODELAY, true)
                        .handler(new ChannelInitializer<SocketChannel>() {
                            @Override
                            public void initChannel(SocketChannel ch)
                                    throws Exception {
                                ch.pipeline().addLast(new TimeClientHandler());
                            }
                        });

                // 发起异步连接操作
                ChannelFuture f = b.connect(host, port).sync();

                // 当代客户端链路关闭
                f.channel().closeFuture().sync();
            } finally {
                // 优雅退出，释放NIO线程组
                group.shutdownGracefully();
            }
        }

    }


    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
      for (int i = 0;i<3;i++) {
          new Thread(new MyThread()).start();
      }
    }
}
