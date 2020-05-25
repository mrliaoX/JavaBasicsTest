package com.study.calendar;

import java.util.Calendar;

public class CalendarTest2 {
	/*成员方法
	  public void add(int field,int amount)
	  public final void set(int year,int month,int date)
    案例演示
	  Calendar类的成员方法使用*/
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//对月进行加减
		c.add(Calendar.MONTH, +1);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
                c.get(Calendar.DAY_OF_MONTH)+"日");
		//对年进行加减
		c.add(Calendar.YEAR, -1);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
                c.get(Calendar.DAY_OF_MONTH)+"日");
		//对年份进行设置
		c.set(Calendar.YEAR, 2010);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
                c.get(Calendar.DAY_OF_MONTH)+"日");
		//对年月日进行设置
		c.set(2020, 3, 20);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
                c.get(Calendar.DAY_OF_MONTH)+"日");

	}

}
