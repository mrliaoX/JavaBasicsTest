package com.study.tcp_ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive_Test2 {

	public static void main(String[] args) throws Exception {
//		��ΪҪ���ϵĽ����������ر�socket����ʵҲ�ǲ��رյ�
		DatagramSocket socket = new DatagramSocket(6666);   //����Socket�൱�ڴ�����ͷ 6666�Ƕ˿ں�
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);/*����packet�൱�ڴ���
		                                                                    ��װ��(���ݽ��հ�)*/
        while (true) {
        	socket.receive(packet);            //��������
        	byte[] arr = packet.getData();    //��ȡ����
        	int len = packet.getLength();     //��ȡ��Ч���ֽڸ���
        	String ip = packet.getAddress().getHostAddress();		//��ȡip��ַ
        	int port = packet.getPort();							//��ȡ�˿ں�
        	System.out.println(ip+":"+ port + ":" + new String(arr,0,len));
		}            
		
		

	}

}
