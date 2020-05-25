package com.study.set.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Case3 {
//程序启动后， 可以从键盘输入接收多个整数，直到输入quit时结束输入。 把所有输入的整数倒序排列打印.
	/*分析：
	 *    1、创建Scanner录入字符串
	 *    2、创建TreeSet集合传入比较器
	 *    3、无限循环判断字符串是否室quit是就结束，不是就将字符串传唤成Integer
	 *    4、遍历TreeSet*/
	public static void main(String[] args) {
		//创建Scanner录入字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符");
		//建TreeSet集合传入比较器
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {//比较器：匿名内部类comparator重写比较方法按照字典比较保留重复
				int num = i2.compareTo(i1);//与int num = i2-i1;含义一样
				return num == 0 ? 1 :num;
			}
		});
		//无限循环判断字符串是否室quit是就结束，不是就将字符串传唤成Integer
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
			Integer i = Integer.parseInt(line);
			ts.add(i);
			/*try {
				
				
			} catch (Exception e) {
				System.out.println("请输入整数");
			}*/
			
		}//遍历TreeSet
		for (Integer integer : ts) {
			System.out.println(integer);
		}


	}

}
