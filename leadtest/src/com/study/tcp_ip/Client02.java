package com.study.tcp_ip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client02 {
	/*  1.�ͻ���
		* ����Socket���ӷ����(ָ��ip��ַ,�˿ں�)ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
		* ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ����������IO��
		* ���������Զ�ȡ����������д��������
		* ���������д�����ݵ�����˵�������*/
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1",12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		System.out.println(br.readLine());
		ps.println("���");
		System.out.println(br.readLine());
		ps.println("�Բۣ���ô��������");
		socket.close();

	}

}
