package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"unchecked","rawtypes"})
public class Collection_AddAll {
	/*案例演示
	  带All的功能演示
		boolean addAll(Collection c)
		boolean removeAll(Collection c)
		boolean containsAll(Collection c)
		boolean retainAll(Collection c)*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();

	}

	private static void demo4() {  //取交集如果调用的集合不变为true，改变为false
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("f");
		boolean b = c1.retainAll(c2); //取交集
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo3() {  //判断A中是否包含B中所以的元素
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
//		c2.add("f");
		boolean b = c1.containsAll(c2); //判断传入的元素是否包含在c1内
		System.out.println(b);
	}

	private static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("f");
		
		boolean b = c1.removeAll(c2);   //删除交集，没有交集返回false
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		System.out.println(c1.addAll(c2));//将C2中的元素添加到C1中
		System.out.println(c1);
		c1.add(c2);
		System.out.println(c1); //将C2集合添加到C1中取
	}

}
