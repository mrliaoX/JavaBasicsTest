package com.study.thread;

public class InnoName_Thread01 {
//	�����ڲ���ʵ���̵߳����ַ�ʽ
	/*1 �̳�Thread��
	  2 ʵ��Runnable�ӿ�*/
	public static void main(String[] args) {
//		1 �̳�Thread��
		new Thread(){//1,new ��(){}�̳������
			public void run() {//2,��дrun����
				for(int i = 1;i< 100;i++) {
					System.out.println("�����ڲ���̳�Thread");//3,��Ҫִ�еĴ���,д��run������
				}
			} 
		}.start();
		new Thread(new Runnable() {//1,new �ӿ�(){}ʵ������ӿ�
			@Override
			public void run() {//2,��дrun����
				for(int i= 0;i <100;i++) {//3,��Ҫִ�еĴ���,д��run������
					System.out.println("runnable������");
				}
				
			}
			
		}).start(); 

	}

}
