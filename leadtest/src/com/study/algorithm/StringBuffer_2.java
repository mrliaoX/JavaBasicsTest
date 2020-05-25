package com.study.algorithm;

public class StringBuffer_2 {
/*StringBuffer的添加共能
		public StringBuffer append(String str) :
		   可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
		public StringBuffer insert(int offset, String str) :
		   在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
	StringBuf fer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是- -个长度为16的字符
	当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符*/
	public static void main(String[] args) {
		demo2();
		demo1();
		
	}

	private static void demo2() {/*public StringBuffer append(String str) :
		                  可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身*/
		StringBuffer sb1 = new StringBuffer();	
		System.out.println(sb1.append("wahaha"));//输出结果wahaha
	}

	private static void demo1() {/*public StringBuffer insert(int offset, String str) :
		         在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身*/
		StringBuffer sb2 = new StringBuffer("wahaha");
		StringBuffer a = sb2.insert(1, "niuniu");//在1的位置插入niuniu
		System.out.println(a);//输出结果wniuniuahaha
	}

}
