package com.study.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Map_Test1 {
/*	Map集合的功能概述
	  a:添加功能
		* V put(K key,V value):添加元素。
			* 如果键是第一次存储，就直接存储元素，返回null
			* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
	  b:删除功能
		* void clear():移除所有的键值对元素
		* V remove(Object key)：根据键删除键值对元素，并把值返回
	  c:判断功能
		* boolean containsKey(Object key)：判断集合是否包含指定的键
		* boolean containsValue(Object value):判断集合是否包含指定的值
		* boolean isEmpty()：判断集合是否为空
	  d:获取功能
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):根据键获取值
		* Set<K> keySet():获取集合中所有键的集合
		* Collection<V> values():获取集合中所有值的集合
	  e:长度功能
		* int size()：返回集合中的键值对的个数*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		Map<String,Integer> m = new HashMap<>();
		m.put("小明", 18);
		m.put("小红", 18);
		m.put("小熊", 19);
		Collection<Integer> c = m.values();
		System.out.println(c);
		System.out.println(m.size());
		
	}

	private static void demo3() {//判断功能
		Map<String,Integer> m = new HashMap<>();
		m.put("小明", 18);
		m.put("小红", 18);
		m.put("小熊", 19);
		
		System.out.println(m.containsKey("小熊"));
		
		System.out.println(m.containsValue(18));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.containsKey("李四"));
	}

	private static void demo2() {//删除功能
		Map<String,Integer> m = new HashMap<>();
		m.put("小明", 18);
		m.put("小红", 18);
		m.put("小熊", 19);
		m.remove("小红");
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

	private static void demo1() {//添加功能
		Map<String,Integer> m = new HashMap<>();
		m.put("小明", 18);
		m.put("小红", 18);
		m.put("小熊", 19);
		System.out.println(m);
		System.out.println(m.size());
	}

}
