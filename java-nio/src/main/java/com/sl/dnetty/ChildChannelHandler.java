package com.sl.dnetty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @author shuliangzhao
 * @Title: ChildChannelHandler
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/13 21:02
 */
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new TimeServerHandler());
    }
}
