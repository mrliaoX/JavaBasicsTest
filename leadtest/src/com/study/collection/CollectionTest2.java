package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.study.string.Student;

@SuppressWarnings({"unchecked","rawtypes"})
public class CollectionTest2 {
	 /* 集合的遍历
	     其实就是依次获取集合中的每一个元素。
      案例演示
	     把集合转成数组，可以实现集合的遍历
	     toArray()*/
	public static void main(String[] args) {
		demo1();
		demo2();
		
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("小新",5));
		c.add(new Student("妮妮",5));
		c.add(new Student("风间",5));
		c.add(new Student("阿呆",5));
		
		Object[] arr = c.toArray();         /*  当自定义的类型存入集合中会类型转换成Object类型
		                                       想要调用getName这类的方法必须向下转型*/
		for (int i = 0; i < arr.length; i++) {
			Student s = (Student)arr[i];//向下转型
			System.out.println(s.getName()+"  "+s.getAge());
//			System.out.println(arr[i]);
		}
	}

	private static void demo1() {//把集合转成数组
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
