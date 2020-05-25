package com.study.set;

import java.util.HashSet;
import java.util.Random;

public class Set_Case1 {
	/* 案例演示
	 需求: 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
	 分析:1、使用Random产生1到20的随机数
	      2、只需要取10个用while来控制数量
	      3、用hashset来存储不重复
	      4、遍历hashset*/
	public static void main(String[] args) {
		//创建random类
		Random r = new Random();
		//创建hashset来存储不重复的数字
		HashSet<Integer> hs = new HashSet<>();
		//while控制存储的元素只有10个
		while(hs.size()<10) {
			hs.add(r.nextInt(21));//r.nextInt(21)产生0到20的随机数
		}
		//遍历Hashset
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
	}

}
