package com.study.string;

import java.util.Scanner;

public class String_TestCase2 {
	
	public static void main(String[] args) {
		demo1();
		demo2();
	}
	/** 需求：统计大串中小串出现的次数
	* 这里的大串和小串可以自己根据情况给出
	* 在baimaoheimaozhuadaolaoshudecaishihaomao中找到mao出现次数*/
	/*分析：1获取到第一次出现m开头的索引如果没有返回-1 2如果有找到m开头获取索引上的值加上小字符串的长度。
	 * 截取大串，将截取后的大串赋值给大串
	3 计数器记mao出现的次数输出mao出现的次数*/
	private static void demo2() {
		String s = "baimaoheimaozhuadaolaoshudecaishihaomao"; //定义大字符串
		String s1 = "mao";//定义小字符串
		int num = 0;   //计数器

//		方法一：
		for(int i= 0;i<s.length();i++) {
			int a1 = s.indexOf(s1);//获取索引
//			char a2 = s.charAt(s.indexOf('m'));//获取第一个m字符并赋给a2
			if(a1!=-1) {
				s = s.substring(a1+(s1.length()-1));   //截取s剩余的字符串
				num++;                   //记录mao出现次数
			}else {
				break;
			}
			
		}
		System.out.println(num);
//		方法二：
		int index =0;
		while((index = s.indexOf(s1))!= -1) {
			num++;//计数器自增
			s = s.substring(index + s.length());
		}
		System.out.println(num);
	}
	/** 需求：把字符串反转
	* 举例：键盘录入"abc"		
	* 输出结果："cba"*/
	/*分析：需要一个Scanner接受键盘录入然后存储再line中,把它转换成数组，
	再用一个for倒序遍历数组输出*/
	private static void demo1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一组字符串:");
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		sc.close();
		String s = "";
		for(int i = arr.length-1;i >= 0 ;i--) {
			s = s+arr[i];
		}
        System.out.println(s);
	}
	
	

}
