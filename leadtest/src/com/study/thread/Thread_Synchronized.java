package com.study.thread;

public class Thread_Synchronized {
//	同步代码块
	
/*	* 当多线程并发, 有多段代码同时执行时, 我们希望某一段代码执行的过程中CPU不要切换到其他线程工作. 这时就需要同步.
	* 如果两段代码是同步的, 那么同一时间只能执行一段, 在一段代码没执行结束之前, 不会执行另外一段代码.*/
	
	/*同步代码块
	* 使用synchronized关键字加上一个锁对象来定义一段代码, 这就叫同步代码块
	* 多个同步代码块如果使用相同的锁对象, 那么他们就是同步的*/
	public static void main(String[] args) {			

		new Thread() {
			public void run() {
				for(int i = 0; i<100;i++) {
					Print.print1();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for(int i = 0; i<100;i++) {
					Print.print2();
				}
			}
		}.start();

	}

}
class Print{
	public static void print1() {
		synchronized (Print.class) {///同步代码块,锁机制,锁对象可以是任意的,一般习惯于用字节码就是.class
			System.out.print("蜡");
			System.out.print("笔");
			System.out.print("小");
			System.out.print("新");
			System.out.println("\r\n");
		}
	}
	public static void print2() {
		synchronized (Print.class) {
			System.out.print("我");
			System.out.print("的");
			System.out.print("天");
			System.out.print("啊");
			System.out.println();
		}
		
	}
}