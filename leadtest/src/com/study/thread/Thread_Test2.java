package com.study.thread;

public class Thread_Test2 {
//	���̳߳���ʵ�ֵķ�ʽ2
   /* ʵ��Runnable
	* ������ʵ��Runnable�ӿ�
	* ʵ��run����
	* �����߳�Ҫ������д��run������
	* �����Զ����Runnable���������
	* ����Thread����, ����Runnable
	* ����start()�������߳�, �ڲ����Զ�����Runnable��run()����*/
	
	/*�̳�Thread
	* �ô���:����ֱ��ʹ��Thread���еķ���,�����
	* �׶���:����Ѿ����˸���,�Ͳ��������ַ���*/
/*	ʵ��Runnable�ӿ�
	* �ô���:��ʹ�Լ�������߳������˸���Ҳû��ϵ,��Ϊ���˸���Ҳ����ʵ�ֽӿ�,���ҽӿ��ǿ��Զ�ʵ�ֵ�
	* �׶���:����ֱ��ʹ��Thread�еķ�����Ҫ�Ȼ�ȡ���̶߳����,���ܵõ�Thread�ķ���,���븴��*/
	
	/** a.�̳�Thread : ����������д��Thread���run(), ������start()ʱ, ֱ���������run()����
	* b.ʵ��Runnable : ���캯���д�����Runnable������, ��Ա������ס����, 
        start()����run()����ʱ�ڲ��жϳ�Ա����Runnable�������Ƿ�Ϊ��, 
	    ��Ϊ�ձ���ʱ������Runnable��run(),����ʱִ�е��������run()����*/
	public static void main(String[] args) {
		Myrunnable m = new Myrunnable();//�����Զ����Runnable���������
		Thread t = new Thread(m);//����Thread����, ����Runnable
		t.start();//����start()�������߳�, �ڲ����Զ�����Runnable��run()����
		for (int i = 0; i < 100; i++) {
			System.out.println("main�߳�ִ����");
		}

	}

}
class Myrunnable implements Runnable{//ʵ��Runnable ������ʵ��Runnable�ӿ�

	@Override
	public void run() {//ʵ��run����
		for(int i = 0;i < 100 ;i++) {//�����߳�Ҫ������д��run������
			System.out.println("����ruannableҲִ����");
		}
		
	}
	
}