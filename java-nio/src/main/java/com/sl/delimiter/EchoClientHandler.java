package com.sl.delimiter;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author shuliangzhao
 * @Title: EchoClientHandler
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/21 21:22
 */
public class EchoClientHandler extends ChannelInboundHandlerAdapter {

    private byte[] req;

    private int counter;

    public EchoClientHandler() {
        req = ("There are moments in life when you miss\t" +
        "someone so much that you just want to pick\t"    +
        "them from your dreams and hug them for real!\t"    +
        "Dream what you want to dream;go where you want\t"    +
        "to go be what you want to be,because you have only\t"   +
        "one life and one chance to do all the things you want to do\t").getBytes();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ByteBuf message = Unpooled.buffer(req.length);
        message.writeBytes(req);
        ctx.writeAndFlush(message);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String body = (String) msg;
        System.out.println("client reciver is :" + body + "this is counter:" + ++counter);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
