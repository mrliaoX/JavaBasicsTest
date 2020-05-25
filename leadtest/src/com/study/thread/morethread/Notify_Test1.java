package com.study.thread.morethread;

public class Notify_Test1 {
  /** 1.什么时候需要通信
	* 多个线程并发执行时, 在默认情况下CPU是随机切换线程的
	* 如果我们希望他们有规律的执行, 就可以使用通信, 例如每个线程执行一次打印
      2.怎么通信
	* 如果希望线程等待, 就调用wait()
	* 如果希望唤醒等待的线程, 就调用notify();
	* 这两个方法必须在同步代码中执行, 并且使用同步锁对象来调用*/
	/*唤醒案例
	 * 需求	两个线程间的通信
	 * 设置一个唤醒机制，通过同步锁来实现输出语句
	 * 通过多线程调用该机制*/
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
	private int flag = 1;//定义一个标记线程的名字，作用是用于唤醒线程
	
	public void print1() throws InterruptedException {
		synchronized (this) {
			if (flag != 1) {
				this.wait();
			}
			System.out.print("日");
			System.out.print("照");
			System.out.print("香");
			System.out.print("炉");
			System.out.print("生");
			System.out.print("紫");
			System.out.println("烟");
			flag = 2;
			this.notify();
		}
		
		
	}
	public void print2() throws InterruptedException {
		synchronized (this) {
			if (flag != 2) {
				this.wait();
			}
			System.out.print("遥");
			System.out.print("看");
			System.out.print("瀑");
			System.out.print("布");
			System.out.print("挂");
			System.out.print("前");
			System.out.println("川");
			System.out.println();
			flag = 1;
			this.notify();
		}
		
		
		
	}
}