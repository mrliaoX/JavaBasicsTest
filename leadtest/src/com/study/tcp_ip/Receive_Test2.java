package com.study.tcp_ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive_Test2 {

	public static void main(String[] args) throws Exception {
//		因为要不断的接收索引不关闭socket，现实也是不关闭的
		DatagramSocket socket = new DatagramSocket(6666);   //创建Socket相当于创建码头 6666是端口号
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);/*创建packet相当于创建
		                                                                    集装箱(数据接收包)*/
        while (true) {
        	socket.receive(packet);            //接收数据
        	byte[] arr = packet.getData();    //获取数据
        	int len = packet.getLength();     //获取有效的字节个数
        	String ip = packet.getAddress().getHostAddress();		//获取ip地址
        	int port = packet.getPort();							//获取端口号
        	System.out.println(ip+":"+ port + ":" + new String(arr,0,len));
		}            
		
		

	}

}
