package com.study.reflect.ref_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.study.reflect.person.Person;


/*
 * 通过反射获取成员变量
 * */
public class Constructor_test2 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.study.reflect.person.Person");
		
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",18);
		
		Field f = clazz.getDeclaredField("name");//暴力反射获取字段私有的也可以获取
		f.setAccessible(true);//去除私有权限
		f.set(p, "小白");//修改名字
		System.out.println(p);
		

	}

}
