package com.study.thread;

public class Thread_Synchronized2 {
//	ͬ������
//	ʹ��synchronized�ؼ�������һ������, �÷��������еĴ��붼��ͬ����
	public static void main(String[] args) {
		Printer p = new Printer();
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
				    p.print1();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
				    p.print2();
				}
			}
		}.start();


	}

}
class Printer {
	public synchronized void print1() {
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.print("ͬ");
		System.out.print("��");
		System.out.print("��");
		System.out.print("\r\n");
	}
	//�Ǿ�̬��ͬ��������������������?
	//��:�Ǿ�̬��ͬ����������������this
	//��̬��ͬ����������������ʲô?
	//�Ǹ�����ֽ������
	public void print2() {
		//synchronized(new Demo()) {			//������������������,��Ϊ����������ͬһ������
		synchronized(this) {		
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println();
		}
	} 
}