package com.study.thread;

public class Thread_SetPriorit {
//	�����̵߳����ȼ�,�����ȼ��ߵ��߳��Ƚ���
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...���ȼ���");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...���ȼ���");
				}
			}
		};
		t2.setPriority(10);//��t2�����ȼ��������
		t1.setPriority(1);//��t1�����ȼ��������
		t1.start();
		t2.start();

	}

}
