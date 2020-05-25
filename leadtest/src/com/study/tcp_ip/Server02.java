package com.study.tcp_ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
   /*  2.�����
	* ����ServerSocket(��Ҫָ���˿ں�)
	* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
	* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
	* ���������Զ�ȡ�ͻ��������д��������
	* ���������д�����ݵ��ͻ��˵�������*/
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		
		while (true) {
			final Socket socket = server.accept();
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						ps.println("��ӭ����");
						System.out.println(br.readLine());
						ps.println("��Ǹ������");
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
