package com.study.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarCase {
	 /*案例演示
		* 需求：键盘录入任意一个年份，判断该年是闰年还是平年
		* 分析：
		*     1 Scanner录入输入的字符串
		*     2 将字符串转换成日期对象即int型
		*     3 使用calendar类方法设置日期
		*     4 判断输入日期二月是否有29，有就返回true
		*     5 输出*/
	public static void main(String[] args) {
		//1 创建Scanner录入输入的字符串
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个年份");
		String line = s.nextLine();//录入字符串
		//2 将字符串转换成日期对象即int型
		int year = Integer.parseInt(line);
		//5 输出
		boolean b = getYear(year);//布尔类型的值接受判断的结果
		System.out.println(b);
		s.close();

	}

	private static boolean getYear(int year) {
		//3 创建calendar类调用calendar中的方法设置日期
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);//设置日期
		c.add(Calendar.DAY_OF_MONTH, -1);//定位到二月最后一天，即3月1日-1日
		//4 判断输入日期二月是否有29，有就返回true
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
