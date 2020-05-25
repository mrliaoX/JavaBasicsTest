package com.study.thread;

public class Thread_Test1 {
//	多线程程序实现的方式1
	 /*继承Thread
		* 定义类继承Thread
		* 重写run方法
		* 把新线程要做的事写在run方法中
		* 创建线程对象
		* 开启新线程, 内部会自动执行run方法*/
	
	/*从结果可以看出jvm是多线程执行的，多线程执行并不是说多个线程同时执行，而是一个线程执行一段时间
	 * 然后立刻跳到另一个线程去执行，这样不端的在多个线程之间执行。也叫并发
	 * 并行是指有两个以上的线程同时在执行，这个需要CPU有多核，多核控制多线程
	 * 线程就是执行路径，多个线程组成的一片较进程，进程相当于大电缆，线程相当与电缆包着的每一个电线*/
	public static void main(String[] args) {
		MyTread t = new MyTread();//创建线程对象
		t.start();//开启新线程, 内部会自动执行run方法
		for (int i = 0; i < 100; i++) {
			System.out.println("main线程运行");
		}

	}

}
class MyTread extends Thread{//定义类继承Thread
	public void run() {         //重写run方法
		for(int i = 0; i< 100; i++) {     //把新线程要做的事写在run方法中
			System.out.println("卧槽");
		}
	}
	
}