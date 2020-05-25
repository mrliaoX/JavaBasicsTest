package com.study.set;

import java.util.TreeSet;

import com.study.string.Person;

public class TreeSet_Test2 {
/*treeset存储自定义对象时，得重写Compareto方法
 * 
 *  当compareTo方法返回0的时候集合中只有-个元素
    当compareTo方法返回正数的时候集合会怎么存就怎么取
    当compareTo方法返回负数的时候集合会倒序存储*/
	public static void main(String[] args) {
		demo1();
//		去person类选择comparebleto的比较方法然后再运行
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("小白",3));
		ts.add(new Person("小爱",5));
		ts.add(new Person("小葵",1));
		ts.add(new Person("娜娜子",22));
		System.out.println(ts);

	}

	private static void demo1() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("小爱",5));
		ts.add(new Person("小白",3));
		ts.add(new Person("小葵",1));
		//当没有重写Comparableto方法的时候和报错： java.lang.ClassCastException: com.study.test.Person cannot be cast to java.lang.Comparable
		System.out.println(ts);
	}

}
