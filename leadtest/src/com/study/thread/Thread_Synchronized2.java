package com.study.thread;

public class Thread_Synchronized2 {
//	同步方法
//	使用synchronized关键字修饰一个方法, 该方法中所有的代码都是同步的
	public static void main(String[] args) {
		Printer p = new Printer();
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
				    p.print1();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
				    p.print2();
				}
			}
		}.start();


	}

}
class Printer {
	public synchronized void print1() {
		System.out.print("欲");
		System.out.print("买");
		System.out.print("桂");
		System.out.print("花");
		System.out.print("同");
		System.out.print("载");
		System.out.print("酒");
		System.out.print("\r\n");
	}
	//非静态的同步方法的锁对象是神马?
	//答:非静态的同步方法的锁对象是this
	//静态的同步方法的锁对象是什么?
	//是该类的字节码对象
	public void print2() {
		//synchronized(new Demo()) {			//锁对象不能用匿名对象,因为匿名对象不是同一个对象
		synchronized(this) {		
			System.out.print("终");
			System.out.print("不");
			System.out.print("是");
			System.out.print("少");
			System.out.print("年");
			System.out.print("游");
			System.out.println();
		}
	} 
}