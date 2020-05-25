package com.study.tcp_ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send_Test1 {
	/*1.发送Send
	 * 创建DatagramSocket, 随机端口号
	 * 创建DatagramPacket, 指定数据, 长度, 地址, 端口
	 * 使用DatagramSocket发送DatagramPacket
	 * 关闭DatagramSocket
	 * @throws SocketException 
	 * @throws UnknownHostException */
	public static void main(String[] args) throws Exception {
		String str = "你在弄啥类";
		DatagramSocket scoket = new DatagramSocket();//创建发送端，相当于创建码头
		DatagramPacket packet = //创建数据包，相当于创建集装箱
				new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
		scoket.send(packet);
		scoket.close();

	}

}
