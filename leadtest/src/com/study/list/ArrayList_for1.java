package com.study.list;

import java.util.ArrayList;

import com.study.string.Person;

public class ArrayList_for1 {
	 /*��ǿfor����
	  �������Collection���ϵı���
   ��ʽ��
  
		for(Ԫ���������� ���� : �������Collection����) {
			ʹ�ñ������ɣ��ñ�������Ԫ��
		}
   ������ʾ
	  ���飬���ϴ洢Ԫ������ǿfor����
   �ô�
	  �򻯱���*/
	//��ǿforѭ���ײ�����Iterator������
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	//ǿ��forѭ��  �Զ���������
	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("���",5));
		list.add(new Person("����",5));
		list.add(new Person("С��",5));
	    for (Person person : list) {
			System.out.println(person);
		}
	}

	private static void demo1() {
		//ǿ��forѭ��  �������
		int[] arr = {1,2,3,4,5};
		for (int i : arr) {  //��������arr i��ʾָ���Ԫ��
			System.out.println(i);
		}
		//ǿ��forѭ��  ���ϱ���
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
