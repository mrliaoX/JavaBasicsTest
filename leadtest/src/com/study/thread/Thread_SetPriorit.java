package com.study.thread;

public class Thread_SetPriorit {
//	设置线程的优先级,让优先级高的线程先进行
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...优先级低");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println(getName() + "...优先级高");
				}
			}
		};
		t2.setPriority(10);//将t2的有先级设置最高
		t1.setPriority(1);//将t1的优先级设置最低
		t1.start();
		t2.start();

	}

}
