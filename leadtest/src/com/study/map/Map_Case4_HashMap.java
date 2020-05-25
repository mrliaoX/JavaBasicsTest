package com.study.map;

import java.util.HashMap;

public class Map_Case4_HashMap {
/*	 案例演示
	  需求：统计字符串中每个字符出现的次数*/
	public static void main(String[] args) {
		String s = "aaabbbcccddddddddd";
		char[] arr = s.toCharArray();          //将字符串转换成数组
		HashMap<Character,Integer> hm = new HashMap<>();//创建HashMap集合接收数组中的元素
		/*for (char c : arr) {   //遍历数组将数组元素存入集合
			if(!hm.containsKey(c)) {//判断元素是否存在，不存在就把键和值都存入
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);  //元素存在就把值加一
			}
		}*/
		for (char c : arr) {//遍历数组将数组元素存入集合
			Integer i = !hm.containsKey(c)?hm.put(c, 1):hm.put(c, hm.get(c)+1);
			System.out.println(i);
		}
		
		for (Character key : hm.keySet()) {//遍历集合获取所有键hm.keySet为获取所有键
			System.out.println(key+" "+hm.get(key));
		}
		

	}

}
