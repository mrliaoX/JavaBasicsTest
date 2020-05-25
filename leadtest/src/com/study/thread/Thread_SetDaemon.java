package com.study.thread;

public class Thread_SetDaemon {
//	守护线程 守护线程 守护着非守护线程 当非守护线程停止时 ，守护线程也跟着停止
//	setDaemon(), 设置一个线程为守护线程, 该线程不会单独执行, 当其他非守护线程都执行结束后, 自动退出
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...守护线程");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(getName() + "...非守护线程");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.setDaemon(true);//将t1设置为守护线程
		t1.start();
		t2.start();

	}

}
