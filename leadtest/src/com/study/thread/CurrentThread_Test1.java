package com.study.thread;

public class CurrentThread_Test1 {

	public static void main(String[] args) {
		
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+" "+"ͨ����ȡ��ǰ�̶߳����ȡ����");
				}
			}
		}.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+" "+"��runnable��ͨ����ȡ��ǰ�̶߳����ȡ����");
				}
				
			}
		}).start();
		Thread.currentThread().setName("����Ͱ�");//��ȡ�������̵߳�����,��������
		System.out.println(Thread.currentThread().getName());//��ȡ�������̵߳�����,����ȡ����

	}

}
