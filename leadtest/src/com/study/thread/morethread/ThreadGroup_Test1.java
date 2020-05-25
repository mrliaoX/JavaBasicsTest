package com.study.thread.morethread;

public class ThreadGroup_Test1 {
   /*线程组概述
	* Java中使用ThreadGroup来表示线程组，它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
	* 默认情况下，所有的线程都属于主线程组。
		* public final ThreadGroup getThreadGroup()//通过线程对象获取他所属于的组
		* public final String getName()//通过线程组对象获取他组的名字
	* 我们也可以给线程设置分组
		* 1,ThreadGroup(String name) 创建线程组对象并给其赋值名字
		* 2,创建线程对象
		* 3,Thread(ThreadGroup?group, Runnable?target, String?name) 
		* 4,设置整组的优先级或者守护线程
	*  案例演示
		* 线程组的使用,默认是主线程组*/
	public static void main(String[] args) {
		demo1();
//		1,ThreadGroup(String name) 创建线程组对象并给其赋值名字
		ThreadGroup tg = new ThreadGroup("新线程");
//		2,创建线程对象
		MyRunnable mr = new MyRunnable();
//		3,Thread(ThreadGroup?group, Runnable?target, String?name) 
		Thread t1 = new Thread(tg,mr,"张三");
		Thread t2 = new Thread(tg,mr,"李四");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
//		4,设置整组的优先级或者守护线程
		tg.setDaemon(true);

	}

	private static void demo1() {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr,"小白");
		Thread t2 = new Thread(mr,"小黑");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());  //默认的线程为主线程
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