package com.study.list;

import java.util.ArrayList;

import com.study.string.Person;

public class ArrayListArray {
	/*  ������ʾ
	  ����Ƕ��֮ArrayListǶ��ArrayList
	  ������
	  ѧ��Ϊ�󼯺��·�Ϊ�༶���༶��������*/

	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> list = new ArrayList<>();//ѧ�Ƽ��ϰ����༶���༶���ϰ�������
		ArrayList<Person> first = new ArrayList<>();//��һ���༶����
		first.add(new Person("���",1));
		first.add(new Person("����",2));
		first.add(new Person("����",3));
		ArrayList<Person> second = new ArrayList<>();//�ڶ����༶����
		second.add(new Person("���",1));
		second.add(new Person("����",2));
		second.add(new Person("����",3));
		
		list.add(first);//����һ���༶��ӵ�ѧ��
		list.add(second);//���ڶ����༶��ӵ�ѧ��
		//Ƕ�ױ�����ÿ����
		for (ArrayList< Person> al: list) {//����ѧ�Ƽ����еİ༶
			for (Person person : al) {//�����༶�����еĸ���
				System.out.println(person);
			}
		}

	}

}
