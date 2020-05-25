package com.study.set;

import java.util.HashSet;
import java.util.Scanner;

public class Set_Case2 {
	 //使用Scanner从键盘读取一行输入,去掉其中重复字符， 打印出不同的那些字符
	   /*分析：
	    * 1、创建Scanner录入字符
	    * 2、将字符转换成数组，遍历数组存储进集合
	    * 3、遍历Hashset*/
	public static void main(String[] args) {
		//创建Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符：");
		//创建Hashset来存储不重复元素
		HashSet<Character> hs = new HashSet<>();
		//接收录入的字符
		String line = sc.nextLine();
		//将接收的字符转换成字符数组
		char[] arr = line.toCharArray();
		//遍历数组将每个字符存入hashset集合
		for (char c : arr) {
			hs.add(c);
		}
		//遍历集合打印数集合中的元素
		for(Character ct : hs) {
			System.out.println(ct);
		}
		sc.close();

	}

}
