package com.study.tcp_ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send_Test1 {
	/*1.����Send
	 * ����DatagramSocket, ����˿ں�
	 * ����DatagramPacket, ָ������, ����, ��ַ, �˿�
	 * ʹ��DatagramSocket����DatagramPacket
	 * �ر�DatagramSocket
	 * @throws SocketException 
	 * @throws UnknownHostException */
	public static void main(String[] args) throws Exception {
		String str = "����Ūɶ��";
		DatagramSocket scoket = new DatagramSocket();//�������Ͷˣ��൱�ڴ�����ͷ
		DatagramPacket packet = //�������ݰ����൱�ڴ�����װ��
				new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
		scoket.send(packet);
		scoket.close();

	}

}
