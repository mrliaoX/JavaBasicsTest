package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.study.string.Student;

@SuppressWarnings({"unchecked","rawtypes"})
public class CollectionTest2 {
	 /* ���ϵı���
	     ��ʵ�������λ�ȡ�����е�ÿһ��Ԫ�ء�
      ������ʾ
	     �Ѽ���ת�����飬����ʵ�ּ��ϵı���
	     toArray()*/
	public static void main(String[] args) {
		demo1();
		demo2();
		
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("С��",5));
		c.add(new Student("����",5));
		c.add(new Student("���",5));
		c.add(new Student("����",5));
		
		Object[] arr = c.toArray();         /*  ���Զ�������ʹ��뼯���л�����ת����Object����
		                                       ��Ҫ����getName����ķ�����������ת��*/
		for (int i = 0; i < arr.length; i++) {
			Student s = (Student)arr[i];//����ת��
			System.out.println(s.getName()+"  "+s.getAge());
//			System.out.println(arr[i]);
		}
	}

	private static void demo1() {//�Ѽ���ת������
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
