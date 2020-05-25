package com.study.thread.morethread;

public class Notify_Test1 {
  /** 1.ʲôʱ����Ҫͨ��
	* ����̲߳���ִ��ʱ, ��Ĭ�������CPU������л��̵߳�
	* �������ϣ�������й��ɵ�ִ��, �Ϳ���ʹ��ͨ��, ����ÿ���߳�ִ��һ�δ�ӡ
      2.��ôͨ��
	* ���ϣ���̵߳ȴ�, �͵���wait()
	* ���ϣ�����ѵȴ����߳�, �͵���notify();
	* ����������������ͬ��������ִ��, ����ʹ��ͬ��������������*/
	/*���Ѱ���
	 * ����	�����̼߳��ͨ��
	 * ����һ�����ѻ��ƣ�ͨ��ͬ������ʵ��������
	 * ͨ�����̵߳��øû���*/
	public static void main(String[] args) {
		Printer p = new Printer();
		new Thread() {
			public void run() {
				while (true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		}.start();
		new Thread() {
			public void run() {
				while (true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		}.start();

	}

}
class Printer{
	private int flag = 1;//����һ������̵߳����֣����������ڻ����߳�
	
	public void print1() throws InterruptedException {
		synchronized (this) {
			if (flag != 1) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("¯");
			System.out.print("��");
			System.out.print("��");
			System.out.println("��");
			flag = 2;
			this.notify();
		}
		
		
	}
	public void print2() throws InterruptedException {
		synchronized (this) {
			if (flag != 2) {
				this.wait();
			}
			System.out.print("ң");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("ǰ");
			System.out.println("��");
			System.out.println();
			flag = 1;
			this.notify();
		}
		
		
		
	}
}