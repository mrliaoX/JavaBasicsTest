package com.study.thread;

public class TrainTicKet_Case1 {
//	����:��·��Ʊ,һ��100��,ͨ���ĸ���������.
	public static void main(String[] args) {
//		����4��������Ʊ
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();

	}

}
class Ticket extends Thread{
	private static int ticket = 100;//����100��Ʊ
	public void run() {
		while (true) {//ѭ��������Ʊ
			synchronized (Thread.class) {
				if (ticket <= 0) {//��ƱΪ0������Ʊ
					break;
				}
				try {
					Thread.sleep(10);//�߳�1˯,�߳�2˯,�߳�3˯,�߳�4˯
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.getName() + "  ���ǵ�" + ticket-- + "Ʊ");//������Ʊ
			}
		}
	}
}