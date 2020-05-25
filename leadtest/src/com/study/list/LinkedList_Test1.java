package com.study.list;

import java.util.LinkedList;
@SuppressWarnings({"rawtypes","unchecked"})
public class LinkedList_Test1 {
	/*LinkedList类概述
	   LinkedList类特有功能
		  public void addFirst(E e)及addLast(E e)
		  public E getFirst()及getLast()
		  public E removeFirst()及public E removeLast()
		  public E get(int index);*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();

	}

	private static void demo3() {
		LinkedList lk = new LinkedList();
		lk.add("a");
		lk.add("b");
		lk.add("c");
		lk.add("d");
		System.out.println(lk.get(1));//按照索引进行获取
	}

	private static void demo2() {
		LinkedList lk = new LinkedList();
		lk.add("a");
		lk.add("b");
		lk.add("c");
		lk.add("d");
		System.out.println(lk.getFirst());//从头部开始获得
		System.out.println(lk.getLast());//从尾部开始获得
		System.out.println(lk.removeFirst());//从头部开始移除
		System.out.println(lk);
		System.out.println(lk.removeLast());//从尾部开始移除
		System.out.println(lk);
	}

	private static void demo1() {
		LinkedList lk = new LinkedList();
		lk.addFirst("a");//头插法
		lk.addFirst("b");
		lk.addFirst("c");
		lk.addFirst("d");
		System.out.println(lk);
		lk.addLast("a");//尾插法
		lk.addLast("b");
		lk.addLast("c");
		lk.addLast("d");
		System.out.println(lk);
	}

}
