package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_for2 {
	  /*��ͨforѭ��,����ɾ��,��������Ҫ--
	  ������,����ɾ��,���Ǳ���ʹ�õ����������remove����,�������ֲ����޸��쳣
	  ��ǿforѭ������ɾ��*/
	public static void main(String[] args) {
  	    demo1();
		demo2();
//		demo3();

	}
	//��ǿfor����ɾ��ֻ�ܱ�����ɾ���ᷢ��ConcurrentModificationException������ת���쳣��
	/*private static void demo3() {
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("a");
		list3.add("b");
		list3.add("c");
		list3.add("d");
		for (String string : list3) {
			if ("b".equals(string)) {
				list3.remove("b");
			}
		}
		System.out.println(list3);
	}*/
	//������ѭ��ɾ��
	private static void demo2() {
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		//������ѭ��
		Iterator<String> it1 = list2.iterator();
		while(it1.hasNext()) {
			if("b".equals(it1.next())) {
				it1.remove();
			}
		}
		for(Iterator<String> it2 = list2.iterator(); it2.hasNext();) {
			if("c".equals(it2.next())) {
				it2.remove();
			}
		}
		System.out.println(list2);
	}
	//��ͨforѭ��ɾ��
	private static ArrayList<String> demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//��ͨforѭ��ɾ��
		for(int i = 0;i<list.size();i++) {
			if("b".equals(list.get(i))) {
				list.remove(i);  //��ͨforѭ��,����ɾ��,��������Ҫ--
			}
		}
		System.out.println(list);
		return list;
	}

}
