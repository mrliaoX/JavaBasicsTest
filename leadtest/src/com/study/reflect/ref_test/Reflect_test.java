package com.study.reflect.ref_test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflect_test {
	/**
	 * @param args
	 * ArrayList<Integer>的一个对象，在这个集合中添加一个字符串数据，如何实现呢？
	 * 泛型只在编译期有效,在运行期会被擦除掉,所以哟个反射获取字节码对象添加字符串
	 * @throws ClassNotFoundException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(222);
		
		Class clazz = Class.forName("java.util.ArrayList");//获取字节码对象
		Method m = clazz.getMethod("add", Object.class);//获取添加方法
		m.invoke(list, "abc");//调用invoke方法，向list添加字符串
		
		System.out.println(list);
		

	}

}
