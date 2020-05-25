package com.study.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test3 {
	/*Map集合的遍历之键值对对象找键和值
	键值对对象找键和值思路：entry
	  获取所有键值对对象的集合
	  遍历键值对对象的集合，获取到每一个键值对对象
	  根据键值对对象找键和值*/
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		 map.put("一", 18);
		 map.put("二", 17);
		 map.put("三", 19);
		 map.put("四", 18);
		 //Map.Entry：是map内接口，将键和值封装成Entry对象，并存储再set中
		Set<Map.Entry<String,Integer>> entryset =map.entrySet();
		//获取每迭代器
		Iterator<Map.Entry<String,Integer>> it = entryset.iterator();
		while(it.hasNext()) {//判断是否有元素
			Map.Entry<String, Integer> me = it.next();//获取每一个对象
			String key = me.getKey();//获取每一个对象中的键
			Integer value = me.getValue();//获取每一个对象中的值
			System.out.println(key+"="+value);
		}
		System.out.println("---------------------");
		//强for的entry方法
		for(Map.Entry<String, Integer> me:map.entrySet()) {//遍历获取每一个对象
			System.out.println(me.getKey()+"="+me.getValue());//打印每个对象中的键和值
		}

	}

}
