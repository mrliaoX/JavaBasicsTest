package com.study.thread;

public class Thread_Setname01 {
//	��ȡ���ֺ���������
  /** 1.��ȡ����
	* ͨ��getName()������ȡ�̶߳��������
    * 2.��������
	* ͨ�����캯�����Դ���String���͵�����*/
	public static void main(String[] args) {
	//1 ͨ�����캯����������
		new Thread("С��") {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName()+"  "+"ͨ�����캯����������");
				}
			}
		}.start();
//	2 ͨ��setName()��������
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName()+"  "+"ͨ��setName()��������");
				}
			}
		};
		t.setName("��Ϊ");
		t.start();
	}

}
