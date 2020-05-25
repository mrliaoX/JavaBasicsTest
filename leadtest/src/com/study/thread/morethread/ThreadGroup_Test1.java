package com.study.thread.morethread;

public class ThreadGroup_Test1 {
   /*�߳������
	* Java��ʹ��ThreadGroup����ʾ�߳��飬�����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п��ơ�
	* Ĭ������£����е��̶߳��������߳��顣
		* public final ThreadGroup getThreadGroup()//ͨ���̶߳����ȡ�������ڵ���
		* public final String getName()//ͨ���߳�������ȡ���������
	* ����Ҳ���Ը��߳����÷���
		* 1,ThreadGroup(String name) �����߳�����󲢸��丳ֵ����
		* 2,�����̶߳���
		* 3,Thread(ThreadGroup?group, Runnable?target, String?name) 
		* 4,������������ȼ������ػ��߳�
	*  ������ʾ
		* �߳����ʹ��,Ĭ�������߳���*/
	public static void main(String[] args) {
		demo1();
//		1,ThreadGroup(String name) �����߳�����󲢸��丳ֵ����
		ThreadGroup tg = new ThreadGroup("���߳�");
//		2,�����̶߳���
		MyRunnable mr = new MyRunnable();
//		3,Thread(ThreadGroup?group, Runnable?target, String?name) 
		Thread t1 = new Thread(tg,mr,"����");
		Thread t2 = new Thread(tg,mr,"����");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
//		4,������������ȼ������ػ��߳�
		tg.setDaemon(true);

	}

	private static void demo1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr,"С��");
		Thread t2 = new Thread(mr,"С��");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());  //Ĭ�ϵ��߳�Ϊ���߳�
		System.out.println(tg2.getName());
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+"  "+ i);
		}
		
	}
	
}