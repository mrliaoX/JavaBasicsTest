package com.study.thread;

public class Thread_Sleep {
//	�����߳�
	/*sleep���൱����ͣ�˴�ִ�� ��ͬ��õÿ�sleep�����õ�ʱ��
	 * Thread.sleep(����,����), ���Ƶ�ǰ�߳��������ɺ���1��= 1000���� 1�� = 1000 * 1000 * 1000���� 1000000000*/
	public static void main(String[] args) {
		new Thread("С��") {
			public void run() {
				for (int i = 0; i < 50; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(this.getName()+" "+"sleep����");
				}
			}
		}.start();
		new Thread("С��") {
			public void run() {
				for (int i = 0; i < 50; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(this.getName()+" "+"����");
				}
			}
		}.start();

	}

}
