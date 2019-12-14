package com.sl.delimiter;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author shuliangzhao
 * @Title: EchoClientCHannelHandler
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/21 21:21
 */
public class EchoClientChannelHandler extends ChannelInitializer<SocketChannel> {
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();
        /*
         * 这个地方的 必须和服务端对应上。否则无法正常解码和编码
         */
        ByteBuf delimiter = Unpooled.copiedBuffer("\t".getBytes());
        pipeline.addLast(new DelimiterBasedFrameDecoder(1024,delimiter));
        pipeline.addLast( new StringDecoder());
        pipeline.addLast( new StringEncoder());

        // 客户端的逻辑
        pipeline.addLast( new EchoClientHandler());
    }
}
