package com.study.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.study.string.Person;

public class Generic_Case1 {
	 
	 /*������ʾ
	  ArrayList�洢�ַ������������Ͱ�*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	//ͨ��ArrayList�洢�Զ������Ͷ��󣨷��ͣ�
	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>() ;
		//�������϶���
		list.add(new Person("С��",5));
		list.add(new Person("С��",3));
		Iterator<Person> it = list.iterator() ;//��ȡ������
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	//ͨ��ArrayList�洢�ַ������Ͷ��󣨷��ͣ�
	private static void demo1() {
		ArrayList<String> list = new ArrayList<>() ;
		//�������϶���
		list.add("a") ;
		list.add ("b") ;
		list.add("c") ;
		list.add("d") ;
		Iterator<String> it = list.iterator() ;
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
