package com.study.thread;

public class TrainTicKet_Case2 {
//	火车站卖票的例子用实现Runnable接口
	public static void main(String[] args) {
		//创建ticket对象
		Ticket1 t1 = new Ticket1();
		//t1传入thread 调用start开启线程
		//因为ticket是用实现runnable接口来做的，而runnable接口没有开启线程所以得通过thread来开启
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();

	}

}
class Ticket1 implements Runnable{

	private int ticket = 500;//定义500张票
	@Override
	public void run() {
		while (true) {//定义循环不断的卖票
			synchronized (this) {//加同步作用是在执行的一段时间里都是一个线程，相当于一个窗口一段时间都在卖票
				if (ticket <= 0) {//如果票数为0就退出
					break;
				}
				try {
					Thread.sleep(10); //加sleep作用相当于模拟在卖票程序执行时会有其他程序执行，相当于让当前程序睡眠一段时间
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "  这是第" + ticket-- + "张票");
			}
			
		}
		
	}
	
}