package com.study.algorithm;

public class StringBuffer_1 {
	/*StringBuffer的构造方法
	    public StringBuffer();   无参构造方法
	    public StringBuffer(int capacity); 指定容量的字符串缓冲区对象
	    public StringBuffer(String str);  指定字符串内容的缓冲区对象*/
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//public StringBuffer();   无参构造方法
//		StringBuffer的容量为16字节。
		System.out.println(sb.length());//输出结果为0  容器中的字符个数 实际值
		System.out.println(sb.capacity());//输出结果为16  容器的容量    理想值
		
		StringBuffer sb2 = new StringBuffer(10); /*设定StringBuffer的容量值为10字节  
		                                           public StringBuffer(int capacity); 指定容量的字符串缓冲区对象*/
		System.out.println(sb2.length());//输出结果为0
		System.out.println(sb2.capacity());//输出结果为10
		
		StringBuffer sb3 = new StringBuffer("wocao");// public StringBuffer(String str);  指定字符串内容的缓冲区对象*/
		System.out.println(sb3.length());   //输出结果为5
		System.out.println(sb3.capacity()); //输出结果为21  字符串的length+初始容量
	}
}
