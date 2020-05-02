package cn.ykstudy.netty.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author ykstudy
 * @date 2020年3月24号
 * @description 服务端初始化类
 */
public class ServerInitializer extends ChannelInitializer<SocketChannel> {
    private static final StringDecoder DECODER = new StringDecoder();
    private static final StringEncoder ENCODER = new StringEncoder();

    private static final ServerHandler SERVER_HANDLER = new ServerHandler();


    @Override
    public void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        // Add the text line codec combination first,
        // 添加帧限定符来防止粘包现象
        pipeline.addLast(new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
        // the encoder and decoder are static as these are sharable
        // 解码和编码，应和客户端一致
        pipeline.addLast(DECODER);
        pipeline.addLast(ENCODER);

        // and then business logic.
        // 业务逻辑实现类
        pipeline.addLast(SERVER_HANDLER);
    }
}
