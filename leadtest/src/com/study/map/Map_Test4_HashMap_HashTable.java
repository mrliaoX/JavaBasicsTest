package com.study.map;

import java.util.HashMap;

/*HashMap和Hashtable的区别
  共同点:
  底层都是哈希算法,都是双列集合
  区别:
  1,HashMap是线程不安全的,效率高,JDK1.2版本
  2,HashMap可以存储null键和null值
    Hashtable不可以存储null键和null值*/
public class Map_Test4_HashMap_HashTable {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(null, 23);
		hm.put("李四", null);
		System.out.println(hm);
		System.out.println("1111111111111");
		System.out.println("--------------------------");
		/*Hashtable<String, Integer> ht = new Hashtable<>();
		//ht.put(null, 23);
		ht.put("张三", null);
		System.out.println(ht);//java.lang.NullPointerException会报空指针异常，Hashtable不能存储NULL
		System.out.println("1111111111111");*/
	}

}
