package com.study.thread.morethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executors_Test2 {
	/*�����̳߳ص�ʹ�ø���
	* JDK5������һ��Executors�������������̳߳أ������¼�������
		* public static ExecutorService newFixedThreadPool(int nThreads)
		* public static ExecutorService newSingleThreadExecutor()
		* ��Щ�����ķ���ֵ��ExecutorService���󣬸ö����ʾһ���̳߳أ�����ִ��Runnable�������Callable���������̡߳����ṩ�����·���
		* Future<?> submit(Runnable task)
		* <T> Future<T> submit(Callable<T> task)
	* ʹ�ò��裺
		* �����̳߳ض���
		* ����Runnableʵ��
		* �ύRunnableʵ��
		* �ر��̳߳�
	*  ������ʾ
		* �ύ����Runnable*/
//	Callable���Է���ִ�н�����Ǹ����ͣ���Future��FutureTask��Ͽ���������ȡ�첽ִ�еĽ��
	/*��ǰ������������ǽ����˴����̵߳�2�ַ�ʽ��һ����ֱ�Ӽ̳�Thread������һ�־���ʵ��Runnable�ӿڡ�
	��2�ַ�ʽ����һ��ȱ�ݾ��ǣ���ִ��������֮���޷���ȡִ�н����
	�����Ҫ��ȡִ�н�����ͱ���ͨ�������������ʹ���߳�ͨ�ŵķ�ʽ���ﵽЧ��������ʹ�������ͱȽ��鷳��
	���Դ�Java 1.5��ʼ�����ṩ��Callable��Future��ͨ�����ǿ���������ִ�����֮��õ�����ִ�н����*/
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Future<Integer> f1 = pool.submit(new MyCallable(10));
		Future<Integer> f2 = pool.submit(new MyCallable(80));
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		pool.shutdown();

	}

}
class MyCallable implements Callable<Integer>{
	
	private int num;

	public MyCallable(int num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum +=i;//sum = sum + i
		}
		return sum;
	}
	
}
