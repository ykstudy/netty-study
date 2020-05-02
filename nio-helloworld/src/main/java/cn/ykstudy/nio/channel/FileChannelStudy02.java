package cn.ykstudy.nio.channel;

import cn.ykstudy.nio.constant.StrConstant;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author: yangk
 * @create: 2020/4/4 22:58
 * @program:
 * @description: 使用FileChannel将数据从文件读出
 **/
public class FileChannelStudy02 {
    public static void main(String[] args) throws Exception {
        //创建文件的输入流
        File file = new File(StrConstant.FILE_CHANNEL_PATH_HELLO);
        FileInputStream fileInputStream = new FileInputStream(file);
        //通过fileInputStream获取对应的FileChannel -> 实际类型FileChannelImpl
        FileChannel fileChannel = fileInputStream.getChannel();
        //创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
        //将通道的数据读入到byteBuffer
        fileChannel.read(byteBuffer);
        //将byteBuffer的字节数据转成String
        System.out.println(new String(byteBuffer.array()));
        //关闭输入流
        fileInputStream.close();

    }
}
