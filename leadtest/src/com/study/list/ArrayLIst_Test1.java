package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"rawtypes","unchecked"})
public class ArrayLIst_Test1 {
	/*需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
	  思路：创建新集合方式*/

			/**
			 *  A:案例演示
			 * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
			 * 思路：创建新集合方式
			 * 分析
			 * 1 创建新集合传入集合（老的集合）获取迭代器
			 * 2 遍历老的集合
			 * 3 判断老集合于老集合是否重复
			 * 4 添加不重复的元素
			 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		
		ArrayList al = getSingle(list); //用新集合取接受就集合
		System.out.println(al);

	}
	public static ArrayList getSingle(ArrayList list) {
		ArrayList al = new ArrayList();
		Iterator it = list.iterator(); //获取迭代器
		while(it.hasNext()) {   //遍历集合
			Object ob = it.next();
			if (!al.contains(ob)) {  //判断是否重复
				al.add(ob);          //添加不重复的元素
			}
		}
		return al;
		
	}

}
