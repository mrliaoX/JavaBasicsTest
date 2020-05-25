package com.study.map;

import java.util.LinkedHashMap;

public class Map_Case2_LinkedHashMap {
/*	案例演示
	  LinkedHashMap的特点
		  底层是链表实现的可以保证怎么存就怎么取*/
	public static void main(String[] args) {
		LinkedHashMap<Student,String> lhmp = new LinkedHashMap<>();
		lhmp.put(new Student("渐渐的",20), "北");
		lhmp.put(new Student("忘记",19), "上");
		lhmp.put(new Student("忘记了",18), "广");
		lhmp.put(new Student("时间",17), "深");
		System.out.println(lhmp);

	}

}
