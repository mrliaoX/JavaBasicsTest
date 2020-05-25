package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.study.string.Student;
@SuppressWarnings({"rawtypes","unchecked"})

public class CollectionTest1 {
	/*����������ʾ
	boolean add(E e)
	boolean remove(Object o)
	void clear()
	boolean contains(Object o)
	boolean isEmpty()
	int size()
    collection�����ǽӿ����͵Ĳ���ʵ����*/
	public static void main(String[] args) {
		demo1();
		demo2();
		/*ArrayList�ĸ���ĸ��ࣨүү����д��tostring�����������ڴ�ӡ���ö��������ʱ��
		����������object����toString�Ľ��*/
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add("a");        //���
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		c.add("f");
		c.remove("a");     //�Ƴ�ָ��Ԫ��
		c.remove("c");
		System.out.println(c);
		System.out.println(c.size());//��ȡ����Ԫ�ظ���
		c.clear();         //���
		System.out.println(c.contains("b")); //�жϼ������Ƿ����ָ��Ԫ��
		System.out.println(c.isEmpty());     //�жϼ����Ƿ�Ϊ��
		System.out.println(c);
	}

	private static void demo1() {
		Collection c = new ArrayList();    /*��������ָ���������
		                                   ArrayList()����������ģ��������ģ������ظ��洢
		                                   add�������һֱ��list����һֱ������true
		                                   �����set���ϵ��洢�ظ���ʱ�򷵻�false*/
		boolean b1 = c.add("abc");         
		boolean b2 = c.add("222");	
		boolean b3 = c.add(new Student("��С",23));
		boolean b4 = c.add(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(c.add("abc"));
	}

}
