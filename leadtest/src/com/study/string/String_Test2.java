package com.study.string;

public class String_Test2 {
/*	
 * String常见的构造方法
 * 
 * * public String():空构造
	* public String(byte[] bytes):把字节数组转成字符串
	* public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
	* public String(char[] value):把字符数组转成字符串
	* public String(char[] value,int index,int count):把字符数组的一部分转成字符串
	* public String(String original):把字符串常量值转成字符串
*/
	public static void main(String[] args) {
        demo1();
		demo2();	
        demo3();
        demo4();
        demo5();
        
	}

	private static void demo5() {//public String(String original):把字符串常量值转成字符串
		String i = "a";            //输出结果不变
        String s5 = new String(i);
        System.out.println(s5);
	}

	private static void demo4() {//public String(char[] value,int index,int count):把字符数组的一部分转成字符串
		char[] d = {'a','b','c','d','e','f'};//类似于demo2只不过这里是把字符转换demo2是把字节转换
		String s4 = new String(d,2,3);
		System.out.println(s4);
	}

	private static void demo3() {//public String(char[] value):把字符数组转成字符串
		char[] c = {'a','b','c','d'};//就是相当于把单个字符串成串；输出结果abcd
        String s3 = new String(c);
        System.out.println(s3);
	}

	private static void demo2() {  //public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
		byte[] b = {65,66,67,68,69,70};//int index表示从第几个数开始，int length表示要转几个成字符串
		String s2 = new String(b,3,3);//从第三个开始转，向后转三个输出结果也是DEF
		System.out.println(s2);
	}

	private static void demo1() { //public String(byte[] bytes):把字节数组转成字符串
		byte[] a = {68,69,70};      //输出为DEF 因为字符集编码GBK中的68对应D 69对应E 79对应F
		String s1 = new String(a);
		System.out.println(s1);
	}
	

}
