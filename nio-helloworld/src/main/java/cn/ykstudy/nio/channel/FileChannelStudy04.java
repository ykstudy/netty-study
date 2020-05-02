package cn.ykstudy.nio.channel;

import cn.ykstudy.nio.constant.StrConstant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author: yangk
 * @create: 2020/4/5 15:30
 * @program:
 * @description: FileChannel使用transferFrom方法拷贝文件
 **/
public class FileChannelStudy04 {
    public static void main(String[] args) throws Exception {
        //创建相关的流
        FileInputStream fileInputStream = new FileInputStream(StrConstant.FILE_CHANNEL_PATH_THREE);
        FileOutputStream fileOutputStream = new FileOutputStream(StrConstant.FILE_CHANNEL_PATH_FOUR);
        //获取各个流对应的fileChannel
        FileChannel fileChannelIn = fileInputStream.getChannel();
        FileChannel fileChannelOut = fileOutputStream.getChannel();
        //使用transferForm完成拷贝
        fileChannelOut.transferFrom(fileChannelIn, 0, fileChannelIn.size());
        //关闭相关通道和流
        fileChannelIn.close();
        fileChannelOut.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
