package cn.ykstudy.netty.client;


import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author ykstudy
 * @date 2020年3月24号
 * @description 客户端逻辑处理类
 */
@Sharable
public class ClientHandler extends SimpleChannelInboundHandler<String> {

    //打印读取到的数据
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) {
        System.err.println(msg);
    }

    //异常数据捕获
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
