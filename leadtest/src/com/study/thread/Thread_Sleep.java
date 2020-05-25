package com.study.thread;

public class Thread_Sleep {
//	休眠线程
	/*sleep是相当与暂停此次执行 赞同多久得看sleep里设置的时间
	 * Thread.sleep(毫秒,纳秒), 控制当前线程休眠若干毫秒1秒= 1000毫秒 1秒 = 1000 * 1000 * 1000纳秒 1000000000*/
	public static void main(String[] args) {
		new Thread("小明") {
			public void run() {
				for (int i = 0; i < 50; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(this.getName()+" "+"sleep测试");
				}
			}
		}.start();
		new Thread("小红") {
			public void run() {
				for (int i = 0; i < 50; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(this.getName()+" "+"纳尼");
				}
			}
		}.start();

	}

}
