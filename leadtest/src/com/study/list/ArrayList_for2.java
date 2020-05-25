package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_for2 {
	  /*普通for循环,可以删除,但是索引要--
	  迭代器,可以删除,但是必须使用迭代器自身的remove方法,否则会出现并发修改异常
	  增强for循环不能删除*/
	public static void main(String[] args) {
  	    demo1();
		demo2();
//		demo3();

	}
	//增强for不能删除只能遍历，删除会发生ConcurrentModificationException（类型转换异常）
	/*private static void demo3() {
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("a");
		list3.add("b");
		list3.add("c");
		list3.add("d");
		for (String string : list3) {
			if ("b".equals(string)) {
				list3.remove("b");
			}
		}
		System.out.println(list3);
	}*/
	//迭代器循环删除
	private static void demo2() {
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		//迭代器循环
		Iterator<String> it1 = list2.iterator();
		while(it1.hasNext()) {
			if("b".equals(it1.next())) {
				it1.remove();
			}
		}
		for(Iterator<String> it2 = list2.iterator(); it2.hasNext();) {
			if("c".equals(it2.next())) {
				it2.remove();
			}
		}
		System.out.println(list2);
	}
	//普通for循环删除
	private static ArrayList<String> demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//普通for循环删除
		for(int i = 0;i<list.size();i++) {
			if("b".equals(list.get(i))) {
				list.remove(i);  //普通for循环,可以删除,但是索引要--
			}
		}
		System.out.println(list);
		return list;
	}

}
