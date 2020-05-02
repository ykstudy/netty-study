package cn.ykstudy.nio.channel;

import cn.ykstudy.nio.constant.StrConstant;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author: yangk
 * @create: 2020/4/4 10:20
 * @program:
 * @description: 使用FileChannel将数据写入到文件
 **/
public class FileChannelStudy01 {
    public static void main(String[] args) throws Exception {
        String str = "hello world";
        //创建一个输出流
        FileOutputStream fos = new FileOutputStream(StrConstant.FILE_CHANNEL_PATH_HELLO);
        //通过fos获取对应的FileChannel
        //这个filechannel真实类型是FileChannelImpl
        FileChannel fileChannel = fos.getChannel();
        //创建一个缓冲区ByteBuffer
        ByteBuffer byteBUffer = ByteBuffer.allocate(1024);
        //将str放入byteBuffer
        byteBUffer.put(str.getBytes());
        //对byteBuffer进行flip
        byteBUffer.flip();
        //将byteBuffer数据写入到fileChannel
        fileChannel.write(byteBUffer);
        fos.close();
    }
}
