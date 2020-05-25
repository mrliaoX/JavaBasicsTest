package com.study.dateformat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatCase {
	/*案例演示
	  需求：算一下你来到这个世界多少天?
	  分析：
	      1定义两个字符串一个时出生时间，一个时未来时间
	      2将字符串格式化转换成时间对象
	      3获取两个时间对象毫秒值并计算时间差
	      4换算成天数
	      5输出*/

	public static void main(String[] args) throws ParseException {
		//1 定义两个字符串一个时出生时间，一个时未来时间
		String s = "1995年9月9日";
		String st = "2020年9月9日";
		//2 将字符串格式化转换成时间对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d = sdf.parse(s); //转换成时间对象
		Date dt = sdf.parse(st);
		// 3 获取两个时间对象毫秒值并计算时间差
		long time = dt.getTime()- d.getTime();
		// 4 换算成天数
		long day = time/1000/60/60/24/365;
		// 5 输出
		System.out.println(day);

	}

}
