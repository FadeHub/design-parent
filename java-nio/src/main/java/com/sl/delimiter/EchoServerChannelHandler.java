package com.sl.delimiter;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author shuliangzhao
 * @Title: EchoServerChannelHandler
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/21 20:59
 */
public class EchoServerChannelHandler extends ChannelInitializer<SocketChannel> {

    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();
        ByteBuf byteBuf = Unpooled.copiedBuffer("\t".getBytes());
        pipeline.addLast(new DelimiterBasedFrameDecoder(1024,byteBuf));
        pipeline.addLast(new StringDecoder());
        pipeline.addLast(new StringEncoder());
        pipeline.addLast(new EchoServerHandler());
    }
}
