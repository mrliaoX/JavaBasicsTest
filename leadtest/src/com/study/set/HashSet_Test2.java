package com.study.set;

import java.util.HashSet;

import com.study.string.Student;

public class HashSet_Test2 {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("小白",3));
		hs.add(new Student("小白",3));
		hs.add(new Student("小爱",5));
		hs.add(new Student("小爱",5));
		hs.add(new Student("小爱",5));
		hs.add(new Student("小白",3));
		System.out.println(hs.size());  /*打印hs里面的元素为6个说明set集合存了重复的
		                                 原因是在Student类中没有重写equals方法和Hashcode方法*/
        System.out.println(hs);//在Student重写equals和Hashset方法后就可以存储不重复元素
	}

}
