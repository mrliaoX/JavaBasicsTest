package com.study.thread.morethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executors_Test2 {
	/*内置线程池的使用概述
	* JDK5新增了一个Executors工厂类来产生线程池，有如下几个方法
		* public static ExecutorService newFixedThreadPool(int nThreads)
		* public static ExecutorService newSingleThreadExecutor()
		* 这些方法的返回值是ExecutorService对象，该对象表示一个线程池，可以执行Runnable对象或者Callable对象代表的线程。它提供了如下方法
		* Future<?> submit(Runnable task)
		* <T> Future<T> submit(Callable<T> task)
	* 使用步骤：
		* 创建线程池对象
		* 创建Runnable实例
		* 提交Runnable实例
		* 关闭线程池
	*  案例演示
		* 提交的是Runnable*/
//	Callable可以返回执行结果，是个泛型，和Future、FutureTask配合可以用来获取异步执行的结果
	/*在前面的文章中我们讲述了创建线程的2种方式，一种是直接继承Thread，另外一种就是实现Runnable接口。
	这2种方式都有一个缺陷就是：在执行完任务之后无法获取执行结果。
	如果需要获取执行结果，就必须通过共享变量或者使用线程通信的方式来达到效果，这样使用起来就比较麻烦。
	而自从Java 1.5开始，就提供了Callable和Future，通过它们可以在任务执行完毕之后得到任务执行结果。*/
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
