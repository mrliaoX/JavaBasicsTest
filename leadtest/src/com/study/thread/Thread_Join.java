package com.study.thread;

public class Thread_Join {
//	�����߳�
  /** join(), ��ǰ�߳���ͣ, �ȴ�ָ�����߳�ִ�н�����, ��ǰ�߳��ټ��� �൱����ͣ���
	* join(int), ���Եȴ�ָ���ĺ���֮�����*/
	public static void main(String[] args) {
		final Thread t1 = new Thread() {//�����ڲ�����ʹ�þֲ�������Ҫ��final����
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...aaaaaaaaaaaaaaaaaaaaaa");
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
				for(int i = 0; i < 50; i++) {
					if(i == 2) {
						try {
							//t1.join();						//���,����
							t1.join(30);						//����,�й̶���ʱ��,���˹̶�ʱ��,��������ִ��
							Thread.sleep(10);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					System.out.println(getName() + "...bb");
				
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
