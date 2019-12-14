package com.sl.enetty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author shuliangzhao
 * @Title: ChildChannelHandler
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/13 21:02
 */
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new LineBasedFrameDecoder(1024));
        socketChannel.pipeline().addLast(new StringEncoder());
        socketChannel.pipeline().addLast(new TimeServerHandler());
    }
}
