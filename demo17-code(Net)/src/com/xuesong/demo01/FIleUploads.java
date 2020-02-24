package com.xuesong.demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FIleUploads {
    public static void main(String[] args) throws IOException {
        //创建一个本地输入流
        FileInputStream fis = new FileInputStream("D:\\Java\\fileTest\\client\\1.jpg");
        //创建一个客户端Socket对象，构造方法绑定ip 端口
        Socket socket = new Socket("127.0.0.1",9999);
        //使用socket中的getOutputStream获取网络字节输出os 对象
        OutputStream os = socket.getOutputStream();
        //使用本地字节输入流fis方法的read读取本地文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            //使用网络输出流os的write方法 读取的文件上传到服务器
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes))!=-1){
            //使用网络输出流is的read方法 读取服务器返回的信息
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        socket.close();

    }
}
