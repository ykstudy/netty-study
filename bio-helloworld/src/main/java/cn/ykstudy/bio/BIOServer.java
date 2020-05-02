package cn.ykstudy.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: yangk
 * @create: 2020/3/28 23:09
 * @program:
 * @description:
 **/
//@Slf4j
public class BIOServer {
    public static void main(String[] args) {
        //线程池机制
        //思路
        //1. 创建一个线程池
        //2. 如果有客户端连接，就创建一个线程，与之通讯（单独写一个方法）
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        //创建ServerSocket
        try (ServerSocket serverSocket = new ServerSocket(6666)) {
            System.out.println("服务器启动了");
            final boolean[] b = {true};
            while (b[0]) {
                // 监听，等待客户端连接
                //会阻塞
                System.out.println("等待连接...");
                final Socket socket = serverSocket.accept();
                System.out.println("连接到一个客户端");
                //创建一个线程，与之通讯（单独写一个方法）
                newCachedThreadPool.execute(() -> {
                    //可以和客户端通讯
                    Long clientId = handler(socket);
                    if (0L != clientId) {
                        b[0] = false;
                    }
                });
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    //编写一个handler方法，和客户端通讯
    public static Long handler(Socket socket) {
        System.out.println("线程信息 id=" + Thread.currentThread().getId() +
                ", 名字=" + Thread.currentThread().getName());
        byte[] bytes = new byte[1024];
        //通过socket，获取输入流
        try (InputStream inputStream = socket.getInputStream()) {
            //循环读取客户端发送的数据
            while (true) {
                System.out.println("线程信息 id=" + Thread.currentThread().getId() +
                        ", 名字=" + Thread.currentThread().getName());
                //会阻塞
                System.out.println("read...");
                int read = inputStream.read(bytes);
                if (read != -1) {
                    //输出客户端发送的数据
                    System.out.println(new String(bytes, 0, read));
                } else {
                    break;
                }
            }
            socket.close();
            return Thread.currentThread().getId();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0L;
        }
    }
}
