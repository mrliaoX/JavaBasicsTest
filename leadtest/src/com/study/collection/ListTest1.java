package com.study.collection;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings({"rawtypes","unchecked"})
public class ListTest1 {
	/*List���ϵ����й��ܸ���
	  void add(int index,E element)
	  E remove(int index)
	  E get(int index)
	  E set(int index,E element)*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();

	}

	private static void demo4() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.set(0, "z");//E set(int index,E element) ͨ�������滻ָ��λ�õ�Ԫ��
		System.out.println(list);
	}

	private static void demo3() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.get(2));// E get(int index) ͨ����������ȡָ��Ԫ��
		for(int i = 0;i < list.size();i++) { //ͨ��get�����������ϣ�list���еģ�
			System.out.println(list.get(i));
		}
	}

	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.remove(0); //E remove(int index) ͨ������ɾ��Ԫ��
		System.out.println(list);
	}

	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(2, "f"); // void add(int index,E element)ָ��λ�����Ԫ��
		System.out.println(list);
	}

}
