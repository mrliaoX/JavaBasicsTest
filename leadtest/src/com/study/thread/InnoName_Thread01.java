package com.study.thread;

public class InnoName_Thread01 {
//	匿名内部类实现线程的两种方式
	/*1 继承Thread类
	  2 实现Runnable接口*/
	public static void main(String[] args) {
//		1 继承Thread类
		new Thread(){//1,new 类(){}继承这个类
			public void run() {//2,重写run方法
				for(int i = 1;i< 100;i++) {
					System.out.println("匿名内部类继承Thread");//3,将要执行的代码,写在run方法中
				}
			} 
		}.start();
		new Thread(new Runnable() {//1,new 接口(){}实现这个接口
			@Override
			public void run() {//2,重写run方法
				for(int i= 0;i <100;i++) {//3,将要执行的代码,写在run方法中
					System.out.println("runnable的匿名");
				}
				
			}
			
		}).start(); 

	}

}
