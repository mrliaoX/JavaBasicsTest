package com.study.set.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Case2 {
//从键盘接收一 个字符串，程序对其中所有字符进行排序,例如键盘输入: helloitcast程序打印:acehillostt
	/*分析：
	 *    1、创建Scaner	录入字符串
	 *    2、将接收录入的字符串转成数组
	 *    3、创建TreeSet集合，传入比较器，排序，保留重复
	 *       比较器：匿名内部类comparator重写比较方法按照字典比较保留重复
	 *    4、遍历数组将数组中的元素传入TreeSet集合中排序
	 *    5、遍历集合打印集合元素*/
	public static void main(String[] args) {
		//1、创建Scaner	录入字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符");
		String line = sc.nextLine();
		//1、创建Scaner	录入字符串
		char[] arr = line.toCharArray();
		/*创建TreeSet集合，传入比较器，排序，保留重复
		 *       比较器：匿名内部类comparator重写比较方法按照字典比较保留重复*/
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {//比较器：匿名内部类comparator重写比较方法按照字典比较保留重复
				int num = c1.compareTo(c2);
				return num ==0 ? 1:num;
			}
		});
		//遍历数组将数组中的元素传入TreeSet集合中排序
		for (Character c : arr) {
			ts.add(c);
		}
		//遍历集合打印集合元素
		for (Character c : ts) {
			System.out.print(c);
		}
		sc.close();

	}

}
