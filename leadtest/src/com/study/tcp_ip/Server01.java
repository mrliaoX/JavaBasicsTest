package com.study.tcp_ip;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		os.write("那这样小新好惨啊".getBytes());
		byte[] arr = new byte[1024];
		int len = is.read(arr);
		System.out.println(new String(arr,0,len));
		
		socket.close();

	}

}
