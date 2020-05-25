package com.study.arrays;

public class Arrays2 {
	/*int -- String 有4种方法
	  1、和""进行拼接
	  2、public static String valueOf(int i)
	  3、 int -- Integer -- string (Integer类的tostring方法())
	  4、public static String tostring(int i) (Integer类的静态方法)

	 String -- int 两种方法
	   1、String -- Integer -- int
	   2、public static int parseInt (String s)
	   基本数据类型包装类有八种，其中七种都有parseXxx的方法,
	   可以将这七种的字符串表现形式转换成基本数据类型*/

	public static void main(String[] args) {
		demo1();
	    demo2();

	}

	private static void demo2() {
		String i = "100";
	    Integer i2 = new Integer(i);
	    int a = i2.intValue();
	    System.out.println(a);
	}

	private static void demo1() {
		int i = 100;
		String s1 = i+"";
		String s2 = String.valueOf(i);
		
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		String s4 = Integer.toString(i);
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	    System.out.println(s4);
	}

}
