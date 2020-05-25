package com.study.date;

import java.util.Date;

public class DateTest1 {
	/*Date类的概述
	  类 Date 表示特定的瞬间，精确到毫秒。 
    构造方法
	  public Date()
	  public Date(long date)
    成员方法
	  public long getTime()
	  public void setTime(long time)*/

	public static void main(String[] args) {
		demo1();
		demo2();

	}

	private static void demo2() {
		Date d = new Date();
		System.out.println(d.getTime());//获取当前时间毫秒值为单位
		System.out.println(System.currentTimeMillis());//返回当前时间毫秒值为单位
	}

	private static void demo1() {
		Date d = new Date();
		System.out.println(d);
		Date d2 = new Date(0);
		System.out.println(d2);
	}

}
