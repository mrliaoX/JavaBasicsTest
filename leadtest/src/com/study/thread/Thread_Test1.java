package com.study.thread;

public class Thread_Test1 {
//	���̳߳���ʵ�ֵķ�ʽ1
	 /*�̳�Thread
		* ������̳�Thread
		* ��дrun����
		* �����߳�Ҫ������д��run������
		* �����̶߳���
		* �������߳�, �ڲ����Զ�ִ��run����*/
	
	/*�ӽ�����Կ���jvm�Ƕ��߳�ִ�еģ����߳�ִ�в�����˵����߳�ͬʱִ�У�����һ���߳�ִ��һ��ʱ��
	 * Ȼ������������һ���߳�ȥִ�У��������˵��ڶ���߳�֮��ִ�С�Ҳ�в���
	 * ������ָ���������ϵ��߳�ͬʱ��ִ�У������ҪCPU�ж�ˣ���˿��ƶ��߳�
	 * �߳̾���ִ��·��������߳���ɵ�һƬ�Ͻ��̣������൱�ڴ���£��߳��൱����°��ŵ�ÿһ������*/
	public static void main(String[] args) {
		MyTread t = new MyTread();//�����̶߳���
		t.start();//�������߳�, �ڲ����Զ�ִ��run����
		for (int i = 0; i < 100; i++) {
			System.out.println("main�߳�����");
		}

	}

}
class MyTread extends Thread{//������̳�Thread
	public void run() {         //��дrun����
		for(int i = 0; i< 100; i++) {     //�����߳�Ҫ������д��run������
			System.out.println("�Բ�");
		}
	}
	
}