package com.study.thread;

public class Thread_Setname01 {
//	获取名字和设置名字
  /** 1.获取名字
	* 通过getName()方法获取线程对象的名字
    * 2.设置名字
	* 通过构造函数可以传入String类型的名字*/
	public static void main(String[] args) {
	//1 通过构造函数设置名字
		new Thread("小米") {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName()+"  "+"通过构造函数设置名字");
				}
			}
		}.start();
//	2 通过setName()设置名字
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(this.getName()+"  "+"通过setName()设置名字");
				}
			}
		};
		t.setName("华为");
		t.start();
	}

}
