package cn.ykstudy.nio.channel;

import cn.ykstudy.nio.constant.StrConstant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author: yangk
 * @create: 2020/4/5 0:20
 * @program:
 * @description: 使用FileChannel将数据写从文件写入到另一个文件
 **/
public class FileChannelStudy03 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(StrConstant.FILE_CHANNEL_PATH_ONE);
        FileChannel fileChannelIn = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream(StrConstant.FILE_CHANNEL_PATH_TWO);
        FileChannel fileChannelOut = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //循环读取
        while (true) {
            byteBuffer.clear();
            int read = fileChannelIn.read(byteBuffer);
            if(-1 == read) {
                break;
            }
            //将buffer中的数据写入到fileChannelOut中
            byteBuffer.flip();
            fileChannelOut.write(byteBuffer);
        }
        //关闭相应的流
        fileInputStream.close();
        fileOutputStream.close();
    }
}
