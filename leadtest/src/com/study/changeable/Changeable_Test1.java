package com.study.changeable;

public class Changeable_Test1 {
	/* 可变参数概述
		  定义方法的时候不知道该定义多少个参数
	 格式
		  修饰符 返回值类型 方法名(数据类型…  变量名){}
	 注意事项：
		  这里的变量其实是一个数组
		  如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个*/

	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
		print(1,2,3,4,5);
	}
	public static void print(int...arr) {//可变字符其实是一个参数
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
