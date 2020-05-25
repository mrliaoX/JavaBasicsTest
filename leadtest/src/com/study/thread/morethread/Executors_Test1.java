package com.study.thread.morethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_Test1 {
	/*�̳߳ظ���
	* ��������һ�����̳߳ɱ��ǱȽϸߵģ���Ϊ���漰��Ҫ�����ϵͳ���н�����
	  ��ʹ���̳߳ؿ��Ժܺõ�������ܣ������ǵ�������Ҫ�������������ں̵ܶ��߳�ʱ��
	  ��Ӧ�ÿ���ʹ���̳߳ء��̳߳����ÿһ���̴߳�������󣬲�����������
	  �����ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
	  ��JDK5֮ǰ�����Ǳ����ֶ�ʵ���Լ����̳߳أ���JDK5��ʼ��Java����֧���̳߳�*/
	
	/**
	 * public static ExecutorService newFixedThreadPool(int nThreads)
	 * public static ExecutorService newSingleThreadExecutor()
	 */
	public static void main(String[] args) {
		//�����߳��� ��СΪ2
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		pool.shutdown();

	}

}
