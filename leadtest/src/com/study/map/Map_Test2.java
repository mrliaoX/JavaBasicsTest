package com.study.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test2 {
	/* Map集合的遍历之键找值
	 键找值思路：
		  获取所有键的集合
		  遍历键的集合，获取到每一个键
		  根据键找值*/
	public static void main(String[] args) {
		 Map<String,Integer> map = new HashMap<>();
		 map.put("一", 18);
		 map.put("二", 17);
		 map.put("三", 19);
		 map.put("四", 18);
		 /*map遍历的第一种方法，获取所有健存入set集合，通过
		   set集合获取迭代器，再通过迭代器遍历key和set*/
		 Set<String> keySet = map.keySet(); //keySet是获取所以的值
		 Iterator<String> it = keySet.iterator();//获取迭代器
		 while (it.hasNext()) {//判读那是否存在元素
			String key = it.next();//获取每一个键
			Integer value = map.get(key);//获取每个见对应的值
			System.out.println(key+"="+value);//打印键和键值
		}
		 System.out.println("-------------------");
		 //强for遍历
		 for(String key : map.keySet()) {
			 System.out.println(key+"="+map.get(key));
		 }

	}

}
