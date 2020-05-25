package com.study.tcp_ip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client02 {
	/*  1.客户端
		* 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
		* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
		* 输入流可以读取服务端输出流写出的数据
		* 输出流可以写出数据到服务端的输入流*/
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1",12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		System.out.println(br.readLine());
		ps.println("你好");
		System.out.println(br.readLine());
		ps.println("卧槽，那么好卖的吗");
		socket.close();

	}

}
