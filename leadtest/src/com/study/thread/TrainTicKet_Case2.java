package com.study.thread;

public class TrainTicKet_Case2 {
//	��վ��Ʊ��������ʵ��Runnable�ӿ�
	public static void main(String[] args) {
		//����ticket����
		Ticket1 t1 = new Ticket1();
		//t1����thread ����start�����߳�
		//��Ϊticket����ʵ��runnable�ӿ������ģ���runnable�ӿ�û�п����߳����Ե�ͨ��thread������
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();

	}

}
class Ticket1 implements Runnable{

	private int ticket = 500;//����500��Ʊ
	@Override
	public void run() {
		while (true) {//����ѭ�����ϵ���Ʊ
			synchronized (this) {//��ͬ����������ִ�е�һ��ʱ���ﶼ��һ���̣߳��൱��һ������һ��ʱ�䶼����Ʊ
				if (ticket <= 0) {//���Ʊ��Ϊ0���˳�
					break;
				}
				try {
					Thread.sleep(10); //��sleep�����൱��ģ������Ʊ����ִ��ʱ������������ִ�У��൱���õ�ǰ����˯��һ��ʱ��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "  ���ǵ�" + ticket-- + "��Ʊ");
			}
			
		}
		
	}
	
}