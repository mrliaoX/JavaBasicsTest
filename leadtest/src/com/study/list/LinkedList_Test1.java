package com.study.list;

import java.util.LinkedList;
@SuppressWarnings({"rawtypes","unchecked"})
public class LinkedList_Test1 {
	/*LinkedList�����
	   LinkedList�����й���
		  public void addFirst(E e)��addLast(E e)
		  public E getFirst()��getLast()
		  public E removeFirst()��public E removeLast()
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
		System.out.println(lk.get(1));//�����������л�ȡ
	}

	private static void demo2() {
		LinkedList lk = new LinkedList();
		lk.add("a");
		lk.add("b");
		lk.add("c");
		lk.add("d");
		System.out.println(lk.getFirst());//��ͷ����ʼ���
		System.out.println(lk.getLast());//��β����ʼ���
		System.out.println(lk.removeFirst());//��ͷ����ʼ�Ƴ�
		System.out.println(lk);
		System.out.println(lk.removeLast());//��β����ʼ�Ƴ�
		System.out.println(lk);
	}

	private static void demo1() {
		LinkedList lk = new LinkedList();
		lk.addFirst("a");//ͷ�巨
		lk.addFirst("b");
		lk.addFirst("c");
		lk.addFirst("d");
		System.out.println(lk);
		lk.addLast("a");//β�巨
		lk.addLast("b");
		lk.addLast("c");
		lk.addLast("d");
		System.out.println(lk);
	}

}
