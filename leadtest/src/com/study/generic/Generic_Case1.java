package com.study.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.study.string.Person;

public class Generic_Case1 {
	 
	 /*案例演示
	  ArrayList存储字符串并遍历泛型版*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	//通过ArrayList存储自定义类型对象（范型）
	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>() ;
		//创建集合对象
		list.add(new Person("小新",5));
		list.add(new Person("小白",3));
		Iterator<Person> it = list.iterator() ;//获取迭代器
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	//通过ArrayList存储字符串类型对象（范型）
	private static void demo1() {
		ArrayList<String> list = new ArrayList<>() ;
		//创建集合对象
		list.add("a") ;
		list.add ("b") ;
		list.add("c") ;
		list.add("d") ;
		Iterator<String> it = list.iterator() ;
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
