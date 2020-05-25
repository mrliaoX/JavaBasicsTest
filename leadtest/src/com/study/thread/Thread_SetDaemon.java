package com.study.thread;

public class Thread_SetDaemon {
//	�ػ��߳� �ػ��߳� �ػ��ŷ��ػ��߳� �����ػ��߳�ֹͣʱ ���ػ��߳�Ҳ����ֹͣ
//	setDaemon(), ����һ���߳�Ϊ�ػ��߳�, ���̲߳��ᵥ��ִ��, ���������ػ��̶߳�ִ�н�����, �Զ��˳�
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...�ػ��߳�");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(getName() + "...���ػ��߳�");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.setDaemon(true);//��t1����Ϊ�ػ��߳�
		t1.start();
		t2.start();

	}

}
