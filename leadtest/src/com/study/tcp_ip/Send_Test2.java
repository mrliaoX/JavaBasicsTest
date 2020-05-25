package com.study.tcp_ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send_Test2 {
/*
 * 优化udp  让他能接收接盘的信息让后发送出去*/
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")//消除Scanner的警告
		Scanner sc = new Scanner(System.in);
		DatagramSocket scoket = new DatagramSocket();//创建发送端，相当于创建码头
		while (true) {
			String line = sc.nextLine();
			if ("quit".equals(line)) {
				break;
			}
			DatagramPacket packet = //创建数据包，相当于创建集装箱
					new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
			scoket.send(packet);
		}
		
		scoket.close();

	}

}
