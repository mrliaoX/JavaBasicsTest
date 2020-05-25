package com.study.string;

public class String_Test5 {
/*	String的转换功能：
	* byte[] getBytes():把字符串转换为字节数组。
	* char[] toCharArray():把字符串转换为字符数组。
	* static String valueOf(char[] chs):把字符数组转成字符串。
	* static String valueOf(int i):把int类型的数据转成字符串。
		* 注意：String类的valueOf方法可以把任意类型的数据转成字符串

	* String toLowerCase():把字符串转成小写。(了解)
	* String toUpperCase():把字符串转成大写。
	* String concat(String str):把字符串拼接。*/
	
	//GBK码表：一个中文代表两个字节，第一个字节肯定是负数，第二个字节有可能是负的
	public static void main(String[] args) {
	    demo1();
		demo2();
		demo3();
		demo4();
		
	}

	private static void demo4() {
		String s1 = "abcdEFG";
		String s2 = "ABCDefg";
		String a1 = s1.toLowerCase();//String toLowerCase():把字符串转成小写输出就结果：abcdefg
		String a2 = s2.toUpperCase();//String toUpperCase():把字符串转成大写输出结果：ABCDEFG
		System.out.println("toLowerCase()全转换成小写："+a1+" toUpperCase()全转换成大写："+a2);
	    
		System.out.println(s1+s2);  
		System.out.println(s1.concat(s2));/*输出的结果是一致的，但是+号的功能比concat的功能
	                                        ;原因是+号可以用任意字符串和任意字符向拼接concat调用的和传入的
	                                       只能是字符串*/
	}

	private static void demo3() {  /*static String valueOf(char[] chs):把字符数组转成字符串。
		                             static String valueOf(int i):把int类型的数据转成字符串。
		                             注意：String类的valueOf方法可以把任意类型的数据转成字符串*/
		char[] arr = {'a','b','c'};
	    String s = String.valueOf(arr);//因为valueOf是静态方法所以直接用String . 调用。底层是用String类构造方法完成的
        System.out.println(s);//输出结果是abc
        String s2 = String.valueOf(10); //把int 类型的10 转换成字符的10，看上去一样但是实际意义不一样
        System.out.println(s2+10);//输出结果是1010
	}

	private static void demo2() {//char[] toCharArray():把字符串转换为字符数组。
		String s2 = "abc";        //第二种遍历字符串打印字符串的方法，第一种是用charAt方法
		char[] a1 = s2.toCharArray();
		for(int i = 0;i < s2.length();i++) {
			System.out.print(a1[i]+" ");
		}
	}

	private static void demo1() {//byte[] getBytes():把字符串转换为字节数组。
		String s1 = "abc";
		byte[] a = s1.getBytes();
		for(int i= 0;i<s1.length();i++)
		System.out.println(a[i]); //输出结果是97，98，99
	}

}
