package com.study.reflect.ref_test;

import com.study.io_stream.Person;

public class Reflect_Test1 {
    /*反射的三种方式，1、Class clazz = class.forName("类名");//读取配置文件
                      2、Class clazz = 类名.class; //当作静态方法的锁对象
                      3、Class clazz = 类名.getclass(); //判断是否是同一个字节码对象*/	
	public static void main(String[] args) throws ClassNotFoundException {
//		1、class.forName("源文件");//对包进行
		Class clazz1 = Class.forName("com.study.reflect.person.Person");
//		2、类名.class; //对类进行
		Class clazz2 = Person.class;
//		3、类名.getclass(); //对方法
		Person p = new Person();
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz3);
		System.out.println(clazz2 == clazz3);
		

	}

}
