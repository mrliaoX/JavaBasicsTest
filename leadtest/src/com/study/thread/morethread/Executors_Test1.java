package com.study.thread.morethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_Test1 {
	/*线程池概述
	* 程序启动一个新线程成本是比较高的，因为它涉及到要与操作系统进行交互。
	  而使用线程池可以很好的提高性能，尤其是当程序中要创建大量生存期很短的线程时，
	  更应该考虑使用线程池。线程池里的每一个线程代码结束后，并不会死亡，
	  而是再次回到线程池中成为空闲状态，等待下一个对象来使用。
	  在JDK5之前，我们必须手动实现自己的线程池，从JDK5开始，Java内置支持线程池*/
	
	/**
	 * public static ExecutorService newFixedThreadPool(int nThreads)
	 * public static ExecutorService newSingleThreadExecutor()
	 */
	public static void main(String[] args) {
		//创建线程组 大小为2
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		pool.shutdown();

	}

}
