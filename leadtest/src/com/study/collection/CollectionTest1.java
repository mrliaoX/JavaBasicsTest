package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.study.string.Student;
@SuppressWarnings({"rawtypes","unchecked"})

public class CollectionTest1 {
	/*基本功能演示
	boolean add(E e)
	boolean remove(Object o)
	void clear()
	boolean contains(Object o)
	boolean isEmpty()
	int size()
    collection集合是接口类型的不能实例化*/
	public static void main(String[] args) {
		demo1();
		demo2();
		/*ArrayList的父类的父类（爷爷）重写了tostring方法，所以在打印引用对象的引用时，
		输出结果不是object类中toString的结果*/
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add("a");        //添加
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		c.add("f");
		c.remove("a");     //移除指定元素
		c.remove("c");
		System.out.println(c);
		System.out.println(c.size());//获取集合元素个数
		c.clear();         //清空
		System.out.println(c.contains("b")); //判断集合内是否存在指定元素
		System.out.println(c.isEmpty());     //判断集合是否为空
		System.out.println(c);
	}

	private static void demo1() {
		Collection c = new ArrayList();    /*父类引用指向子类对象
		                                   ArrayList()方法是有序的，有索引的，可以重复存储
		                                   add方法如果一直是list集合一直都返回true
		                                   如果是set集合当存储重复的时候返回false*/
		boolean b1 = c.add("abc");         
		boolean b2 = c.add("222");	
		boolean b3 = c.add(new Student("张小",23));
		boolean b4 = c.add(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(c.add("abc"));
	}

}
