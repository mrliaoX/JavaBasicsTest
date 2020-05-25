package com.study.list;

import java.util.ArrayList;

import com.study.string.Person;

public class ArrayList_for1 {
	 /*增强for概述
	  简化数组和Collection集合的遍历
   格式：
  
		for(元素数据类型 变量 : 数组或者Collection集合) {
			使用变量即可，该变量就是元素
		}
   案例演示
	  数组，集合存储元素用增强for遍历
   好处
	  简化遍历*/
	//增强for循环底层依赖Iterator迭代器
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	//强化for循环  自定义对象遍历
	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("风间",5));
		list.add(new Person("啊呆",5));
		list.add(new Person("小爱",5));
	    for (Person person : list) {
			System.out.println(person);
		}
	}

	private static void demo1() {
		//强化for循环  数组遍历
		int[] arr = {1,2,3,4,5};
		for (int i : arr) {  //遍历数组arr i表示指向的元素
			System.out.println(i);
		}
		//强化for循环  集合遍历
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
