package com.study.tcp_ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive_Test1 {
	/*����Receive
	 * ����DatagramSocket, ָ���˿ں�
	 * ����DatagramPacket, ָ������, ����
	 * ʹ��DatagramSocket����DatagramPacket
	 * �ر�DatagramSocket
	 * ��DatagramPacket�л�ȡ����*/
	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket(6666);   //����Socket�൱�ڴ�����ͷ 6666�Ƕ˿ں�
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);/*����packet�൱�ڴ���
		                                                                    ��װ��(���ݽ��հ�)*/
        socket.receive(packet);            //��������
		byte[] arr = packet.getData();    //��ȡ����
		int len = packet.getLength();     //��ȡ��Ч���ֽڸ���
		System.out.println(new String(arr,0,len));
        socket.close();	

	}

}
