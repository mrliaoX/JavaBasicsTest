package com.study.calendar;

import java.util.Calendar;

public class CalendarTest1 {
	/*Calendar类的概述
	  Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
    成员方法
	  public static Calendar getInstance()
	  public int get(int field)*/
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));//用字段来获取年份
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//获取一个月中第第几天
		//获取月中的第几天，是按照周末是第一天，周六是最后一天的格式来排序的
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+
		                    c.get(Calendar.DAY_OF_MONTH)+"日"+ getweek(c.get(Calendar.DAY_OF_WEEK)));
		
	}
	/*将星期存储于表中进行查询
	 * 返回值String
	 * 参数 int week*/
	public static String getweek(int week) {
		String[] arr = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		return arr[week];
	}

}
