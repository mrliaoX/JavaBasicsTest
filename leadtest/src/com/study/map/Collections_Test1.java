package com.study.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collections_Test1 {
	/*Collections��Ա����
			public static <T> void sort(List<T> list)
			public static <T> int binarySearch(List<?> list,T key)
			public static <T> T max(Collection<?> coll)
			public static void reverse(List<?> list)
			public static void shuffle(List<?> list)*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		demo5();

	}

	private static void demo5() {//����Ԫ���������
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("d");
		Collections.shuffle(list);
		System.out.println(list);
	}

	private static void demo4() {//����Ԫ�ط�ת
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("e");
		list.add("c");
		list.add("d");
		Collections.reverse(list);//ֻ������Arraylist,LinkedList����ļ���
		System.out.println(list);
	}

	private static void demo3() {//��ѯ���ֵ
		TreeSet<String> list = new TreeSet<>();
		list.add("a");
		list.add("b");
		list.add("e");
		list.add("c");
		list.add("d");
		
		System.out.println(Collections.max(list));
	}

	private static void demo2() {//��������
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(13);
		list.add(15);
		System.out.println(Collections.binarySearch(list, 11));
		System.out.println(Collections.binarySearch(list, 19));//������ҵ��������ھͷ���-1����ߣ������һλ��-2���ұߣ�
	}

	private static void demo1() {//sort(List<T> list)����:��̬����ֱ�ӵ���
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("f");
		al.add("b");
		al.add("c");
		al.add("d");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
