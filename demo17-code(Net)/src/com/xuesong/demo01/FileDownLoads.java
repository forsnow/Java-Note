package com.xuesong.demo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileDownLoads {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
       while (true){
           new Thread(new Runnable() {
               @Override
               public void run() {
                  try{
                      Socket socket = serverSocket.accept();
                      InputStream is = socket.getInputStream();

                      File file = new File("D:\\Java\\fileTest\\server\\download");
                      if (!file.exists()){
                          file.mkdir();
                      }
                      String name = "xuesong"+System.currentTimeMillis()+ new Random().nextInt(999)+".jpg";
                      FileOutputStream fos  = new FileOutputStream(file+"\\"+name);
                      byte[] bytes = new byte[1024];
                      int len = 0;
                      while ((len = is.read(bytes))!=-1){
                          fos.write(bytes,0,len);
                      }
                      OutputStream os = socket.getOutputStream();
                      os.write("我下载好啦！！！！".getBytes());
                      is.close();
                      socket.close();
                      os.close();
                  }catch (IOException e){
                      System.out.println(e);
                  }
               }
           }).start();
       }

    }
}
