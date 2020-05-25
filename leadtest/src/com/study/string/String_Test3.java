package com.study.string;

public class String_Test3 {
	/* boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
	   boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
	   boolean contains(String str):判断大字符串中是否包含小字符串
	   boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
	   boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
	   boolean isEmpty():判断字符串是否为空。*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
	    demo4();
		demo5();
		
	}

	private static void demo5() {//boolean isEmpty():判断字符串是否为空
		String s1 = "abcde";
		String s2 = "";
//		String s3 = null;
		System.out.println(s1.isEmpty());//输出结果为false
		System.out.println(s2.isEmpty());//输出结果为true
//		System.out.println(s3.isEmpty());
		/*""和null的区别：""是字符串常量，同时也是String对象，既然是对象就可以调用String方法
		null是空常量，不能调用任何方法，会出县空指针异常的报错*/
	}

	private static void demo4() {/*boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
		   boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾*/
		String s1 = "abcd";
		System.out.println(s1.startsWith("a"));//输出结果为true
		System.out.println(s1.startsWith("f"));//输出结果为false
		System.out.println(s1.endsWith("d"));//输出结果为true
		System.out.println(s1.endsWith("c"));//输出结果为false
	}

	private static void demo3() {//boolean contains(String str):判断大字符串中是否包含小字符串区分大小写
		String s1 = "abcde";
		String s2 = "abc";
		String s3 = "Abc";
		System.out.println(s1.contains(s2));//输出结果为true
		System.out.println(s1.contains(s3));//输出结果为false
	}

	private static void demo2() {//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		System.out.println(s1.equalsIgnoreCase(s2)); //输出结果为true
		System.out.println(s1.equalsIgnoreCase(s3));//输出结果为true
	}

	private static void demo1() {//boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		System.out.println(s1.equals(s2));//输出结果为true
		System.out.println(s1.equals(s3));//输出结果为false
	}

}
