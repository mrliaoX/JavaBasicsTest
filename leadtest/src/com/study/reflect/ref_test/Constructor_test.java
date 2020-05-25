package com.study.reflect.ref_test;

import java.lang.reflect.Constructor;

import com.study.reflect.person.Person;


/*
 * 通过反射获取有参构造并使用 
 * */
public class Constructor_test {
//	constructor是关键字不能用做包名
	
	 /*Class类的newInstance()方法是使用该类无参的构造函数创建对象, 如果一个类没有无参的构造函数,
	 就不能这样创建了,可以调用Class类的getConstructor
     (String.class,int.class)方法获取一个指定的构造函数然后再调用Constructor类的newInstance*/
	public static void main(String[] args) throws Exception {
//		反射中用有参构造来创建对象
		Class clazz = Class.forName("com.study.reflect.person.Person");
		/*Person p = (Person) clazz.newInstance();
		System.out.println(p);//构造函数无法访问类的成员com.study.reflect.person.person
		                        个人带有修饰语“private”*/
		//有参构造创建对象
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p =  (Person) c.newInstance("小明",22);
		System.out.println(p);
	}

}
