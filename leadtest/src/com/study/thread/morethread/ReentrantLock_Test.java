package com.study.thread.morethread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_Test {

	public static void main(String[] args) {
		final Print3 p = new Print3();
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
		
		new Thread() {
			public void run() {
				while (true) {
						try {
						p.print3();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		}.start();

	}

}
class Print3{
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	private int flag = 1;
	public void print1() throws InterruptedException {
		r.lock();
		  if (flag != 1) {
			  c1.await();
		  }
		  System.out.println("��");
		  System.out.println("��");
		  System.out.println("��");
		  System.out.println("��");
		  System.out.println();
		  flag = 2;
		  c2.signal();
		r.unlock();
	}
	public void print2() throws InterruptedException {
		r.lock();
		  if (flag != 2) {
			  c2.await();
		  }
		  System.out.println("ȥ");
		  System.out.println("��");
		  System.out.println("��");
		  System.out.println("ү");
		  System.out.println(); 
		  flag = 3;
		  c3.signal();
		r.unlock();
	}
	public void print3() throws InterruptedException {
		r.lock();
		  if (flag != 3) {
			 c3.await();
		  }
		  System.out.println("ʲ");
		  System.out.println("ô");
		  System.out.println("��");
		  System.out.println("��");
		  System.out.println();
		  flag = 1;
		  c1.signal();
		r.unlock();
	}
	
}