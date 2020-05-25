package com.study.thread.morethread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_Test1 {
//Timer是一个计时器
	@SuppressWarnings("deprecation")//消除date警告
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		//在指定时间安排指定任务
		//第一个参数,是安排的任务,第二个参数是执行的时间(年为当前年份-1900，月为0-11),第三个参数是过多长时间再重复执行
		t.schedule(new Mytimer(), new Date(120,3,28,21,29,10), 2000);
		while (true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}

	}

}
class Mytimer extends TimerTask{

	@Override
	public void run() {
		System.out.println("起床了，么么哒");
		
	}
	
}