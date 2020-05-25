package com.study.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Map_Case3_TreeMap {
	/*案例演示
	  TreeMap集合键是Student值是String的案例*/
	public static void main(String[] args) {
//		demo1();
		TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {//添加比较器

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());	//按照姓名比较
				return num ==0 ? s1.getAge()-s2.getAge():num; //再按照年龄比较
			}
			
		});
		tm.put(new Student("小米",10), "武汉");
		tm.put(new Student("华为",14), "深圳");
		tm.put(new Student("魅族",17), "珠海");
		tm.put(new Student("一加",8), "西雅图");
		tm.put(new Student("小米",11), "深圳");
		System.out.println(tm);

	}

	private static void demo1() {
		TreeMap<Student,String> tm = new TreeMap<>();
		tm.put(new Student("小米",10), "武汉");
		tm.put(new Student("华为",14), "深圳");
		tm.put(new Student("魅族",17), "珠海");
		tm.put(new Student("一加",8), "西雅图");
		System.out.println(tm);//会报错：不能将Student强制转换为java.lang.Comparable，
		                          /*因为TreeMap是无序的，所以不知道谁先输出
		                          所以需要加一个比较器comparable*/
		/*java.lang.ClassCastException: 
		com.study.map.Student cannot be cast to java.lang.Comparable*/
	}

}
