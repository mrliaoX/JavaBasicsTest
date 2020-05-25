package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.study.string.Student;
@SuppressWarnings({"unchecked","rawtypes"})
public class CollectionIterator {
	/*����������
	  �����������洢Ԫ��,�洢��Ԫ����Ҫ�鿴,��ô����Ҫ����(����)*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Student("С��",1));
		c.add(new Student("������",1));
		c.add(new Student("С��",1));
		Iterator it  = c.iterator();//��ȡ������
		while(it.hasNext()) {//�жϼ����Ƿ���Ԫ�أ��оͷ���true
			//System.out.println(it.next());//ָ����һ��Ԫ��
			Student s = (Student)it.next();//����ת�� ��ΪҪ����getName age����
			System.out.println(s.getName()+"  "+s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Iterator it  = c.iterator();//��ȡ������
		//boolean b = it.hasNext();//�жϼ����Ƿ���Ԫ�أ��оͷ���true
		while(it.hasNext()) {
			System.out.println(it.next());//ָ����һ��Ԫ��
		}
	}

}
