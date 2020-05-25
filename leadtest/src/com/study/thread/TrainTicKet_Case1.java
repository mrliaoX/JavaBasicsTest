package com.study.thread;

public class TrainTicKet_Case1 {
//	需求:铁路售票,一共100张,通过四个窗口卖完.
	public static void main(String[] args) {
//		开启4个窗口售票
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();

	}

}
class Ticket extends Thread{
	private static int ticket = 100;//定义100张票
	public void run() {
		while (true) {//循环不断卖票
			synchronized (Thread.class) {
				if (ticket <= 0) {//当票为0结束卖票
					break;
				}
				try {
					Thread.sleep(10);//线程1睡,线程2睡,线程3睡,线程4睡
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.getName() + "  这是第" + ticket-- + "票");//不断卖票
			}
		}
	}
}