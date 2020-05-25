package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.study.string.Student;
@SuppressWarnings({"unchecked","rawtypes"})
public class CollectionIterator {
	/*迭代器概述
	  集合是用来存储元素,存储的元素需要查看,那么就需要迭代(遍历)*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("小葵",1));
		c.add(new Student("娜娜子",1));
		c.add(new Student("小白",1));
		Iterator it  = c.iterator();//获取迭代器
		while(it.hasNext()) {//判断集合是否有元素，有就返回true
			//System.out.println(it.next());//指向下一个元素
			Student s = (Student)it.next();//向下转型 因为要调用getName age方法
			System.out.println(s.getName()+"  "+s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Iterator it  = c.iterator();//获取迭代器
		//boolean b = it.hasNext();//判断集合是否有元素，有就返回true
		while(it.hasNext()) {
			System.out.println(it.next());//指向下一个元素
		}
	}

}
