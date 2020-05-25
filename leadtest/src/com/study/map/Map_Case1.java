package com.study.map;

import java.util.HashMap;

public class Map_Case1 {
	/*案例演示
	  HashMap集合键是Student值是String的案例*/
	public static void main(String[] args) {
		//Hashmap是无序的存入和输出是无序的。
		HashMap<Student,String> hmap = new HashMap<>();
		hmap.put(new Student("小朋友",10),"南京");
		hmap.put(new Student("你是否有",9),"杭州");
		hmap.put(new Student("很多的",8),"上海");
		hmap.put(new Student("问号",7),"西安");
		hmap.put(new Student("？？？",6),"深圳");
		System.out.println(hmap);

	}

}
