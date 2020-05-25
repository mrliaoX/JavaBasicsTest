package com.study.thread;

public class Dielock_Thread {
	/** 多线程同步的时候, 如果同步代码嵌套, 使用相同锁, 就有可能出现死锁
	* 尽量不要嵌套使用*/
	 /*A:回顾以前说过的线程安全问题
		* 看源码：Vector,StringBuffer,Hashtable,Collections.synchroinzed(xxx)
		* Vector是线程安全的,ArrayList是线程不安全的
		* StringBuffer是线程安全的,StringBuilder是线程不安全的
		* Hashtable是线程安全的,HashMap是线程不安全的*/
	private static String s1 = "筷子左";
	private static String s2 = "筷子右";
	public static void main(String[] args) {
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s1) {
						System.out.println(getName() + "...获取" + s1 + "等待" + s2);
						synchronized(s2) {
							System.out.println(getName() + "...拿到" + s2 + "开吃");
						}
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					synchronized(s2) {
						System.out.println(getName() + "...获取" + s2 + "等待" + s1);
						synchronized(s1) {
							System.out.println(getName() + "...拿到" + s1 + "开吃");
						}
					}
				}
			}
		}.start();

	}

}
