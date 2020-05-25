package com.study.dateformat;

//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormaTest1 {
	/*DateFormat类的概述
	  DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
	  是抽象类，所以使用其子类SimpleDateFormat
    SimpleDateFormat构造方法
	  public SimpleDateFormat()
	  public SimpleDateFormat(String pattern)
    成员方法
	  public final String format(Date date)
	  public Date parse(String source)*/
	public static void main(String[] args) throws ParseException {
//		demo1();
//		demo2();
//		demo3();
		String s = "2020-4-7";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d = sdf.parse(s);//将时间字符串转换成日期对象
		System.out.println(d);
		
	}

	private static void demo3() {
		Date d = new Date();//获取当前时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//DIY格式化日期
        SimpleDateFormat sdf1 = new SimpleDateFormat("y年M月d日 H:m:s");
        System.out.println(sdf.format(d));//输出DIY格式化日期
        System.out.println(sdf1.format(d));
	}

	private static void demo2() {
		Date d = new Date();//获取当前时间对象
        SimpleDateFormat sdf = new SimpleDateFormat();//创建日期格式化对象
        System.out.println(sdf.format(d));//输出格式化后的时间
	}

	private static void demo1() {
		/*DateFormat df = DateFormat.getDateInstance();*//*由于dateformat是抽象类所以没能实例化
		                                               所以通过dateformat.getdateInstance方法调用*/
	    
	}

}
