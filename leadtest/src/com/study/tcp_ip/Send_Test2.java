package com.study.tcp_ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send_Test2 {
/*
 * �Ż�udp  �����ܽ��ս��̵���Ϣ�ú��ͳ�ȥ*/
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")//����Scanner�ľ���
		Scanner sc = new Scanner(System.in);
		DatagramSocket scoket = new DatagramSocket();//�������Ͷˣ��൱�ڴ�����ͷ
		while (true) {
			String line = sc.nextLine();
			if ("quit".equals(line)) {
				break;
			}
			DatagramPacket packet = //�������ݰ����൱�ڴ�����װ��
					new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
			scoket.send(packet);
		}
		
		scoket.close();

	}

}
