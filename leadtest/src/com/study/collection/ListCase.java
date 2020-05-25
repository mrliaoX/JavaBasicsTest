package com.study.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.study.string.Student;

@SuppressWarnings({"rawtypes","unchecked"})
public class ListCase {
	
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	/*案例演示
	  需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，
	        如果有，我就添加一个"javaee"元素，请写代码实现。*/
	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("world");
		list.add("d");
		ListIterator lit = list.listIterator();    /*因为Iterator中没有add方法如果用list中的add
		                                            就会发生一边遍历一边增加元素的可能
		                                            即（ConcurrentModificationException异常）*/
		while(lit.hasNext()) {//获取迭代器
			if("world".equals(lit.next())) {            //判断集合里是否有对应的元素
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}
	/*案例演示
	  通过size()和get()方法结合使用遍历。
	  存储自定义信息，通过Size get方法表里拿到信息*/
	private static void demo1() {
		List list = new ArrayList();
		list.add(new Student("小新",5));
		list.add(new Student("小白",5));
		list.add(new Student("小葵",5));
		for(int i = 0;i<list.size();i++) {
			Student s = (Student) list.get(i);
			System.out.println(s.getName()+" "+s.getAge());
		}
	}

}
