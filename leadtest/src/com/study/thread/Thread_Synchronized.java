package com.study.thread;

public class Thread_Synchronized {
//	ͬ�������
	
/*	* �����̲߳���, �ж�δ���ͬʱִ��ʱ, ����ϣ��ĳһ�δ���ִ�еĹ�����CPU��Ҫ�л��������̹߳���. ��ʱ����Ҫͬ��.
	* ������δ�����ͬ����, ��ôͬһʱ��ֻ��ִ��һ��, ��һ�δ���ûִ�н���֮ǰ, ����ִ������һ�δ���.*/
	
	/*ͬ�������
	* ʹ��synchronized�ؼ��ּ���һ��������������һ�δ���, ��ͽ�ͬ�������
	* ���ͬ����������ʹ����ͬ��������, ��ô���Ǿ���ͬ����*/
	public static void main(String[] args) {			

		new Thread() {
			public void run() {
				for(int i = 0; i<100;i++) {
					Print.print1();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for(int i = 0; i<100;i++) {
					Print.print2();
				}
			}
		}.start();

	}

}
class Print{
	public static void print1() {
		synchronized (Print.class) {///ͬ�������,������,����������������,һ��ϰ�������ֽ������.class
			System.out.print("��");
			System.out.print("��");
			System.out.print("С");
			System.out.print("��");
			System.out.println("\r\n");
		}
	}
	public static void print2() {
		synchronized (Print.class) {
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println();
		}
		
	}
}