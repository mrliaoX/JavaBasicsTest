package com.study.thread;

public class CurrentThread_Test1 {

	public static void main(String[] args) {
		
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+" "+"通过获取当前线程对象获取名字");
				}
			}
		}.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+" "+"在runnable中通过获取当前线程对象获取名字");
				}
				
			}
		}).start();
		Thread.currentThread().setName("阿里巴巴");//获取主函数线程的引用,并改名字
		System.out.println(Thread.currentThread().getName());//获取主函数线程的引用,并获取名字

	}

}
