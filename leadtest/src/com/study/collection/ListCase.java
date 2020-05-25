package com.study.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.study.string.Student;

@SuppressWarnings({"rawtypes","unchecked"})
public class ListCase {
	
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	/*������ʾ
	  ��������һ�����ϣ����ʣ������ж�������û��"world"���Ԫ�أ�
	        ����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�*/
	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("world");
		list.add("d");
		ListIterator lit = list.listIterator();    /*��ΪIterator��û��add���������list�е�add
		                                            �ͻᷢ��һ�߱���һ������Ԫ�صĿ���
		                                            ����ConcurrentModificationException�쳣��*/
		while(lit.hasNext()) {//��ȡ������
			if("world".equals(lit.next())) {            //�жϼ������Ƿ��ж�Ӧ��Ԫ��
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}
	/*������ʾ
	  ͨ��size()��get()�������ʹ�ñ�����
	  �洢�Զ�����Ϣ��ͨ��Size get���������õ���Ϣ*/
	private static void demo1() {
		List list = new ArrayList();
		list.add(new Student("С��",5));
		list.add(new Student("С��",5));
		list.add(new Student("С��",5));
		for(int i = 0;i<list.size();i++) {
			Student s = (Student) list.get(i);
			System.out.println(s.getName()+" "+s.getAge());
		}
	}

}
