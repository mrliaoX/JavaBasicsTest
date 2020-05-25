package com.study.reflect.ref_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.study.reflect.person.Person;

public class Constructor_test3 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.study.reflect.person.Person");//读取配置文件
		Constructor c = clazz.getConstructor(String.class,int.class);	//获取有参构造
		Person p = (Person) c.newInstance("张三",23);						//通过有参构造创建对象
		
		Method m = clazz.getMethod("eat");								//获取eat方法
		m.invoke(p);
		
		Method m2 = clazz.getMethod("eat", int.class);					//获取有参的eat方法
		m2.invoke(p, 10);

	}

}
