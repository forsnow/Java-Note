package com.xuesong.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);
        OutputStream ops = socket.getOutputStream();
        ops.write("I send you a message!!!!".getBytes());
        InputStream ips = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = ips.read(bytes);
        System.out.println(new String(bytes,0,read));
        socket.close();
    }
}
