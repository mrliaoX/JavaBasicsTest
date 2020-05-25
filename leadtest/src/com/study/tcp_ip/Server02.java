package com.study.tcp_ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
   /*  2.服务端
	* 创建ServerSocket(需要指定端口号)
	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	* 输入流可以读取客户端输出流写出的数据
	* 输出流可以写出数据到客户端的输入流*/
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		
		while (true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						ps.println("欢迎光临");
						System.out.println(br.readLine());
						ps.println("抱歉卖完了");
						System.out.println(br.readLine());
						socket.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
