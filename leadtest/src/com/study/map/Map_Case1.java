package com.study.map;

import java.util.HashMap;

public class Map_Case1 {
	/*������ʾ
	  HashMap���ϼ���Studentֵ��String�İ���*/
	public static void main(String[] args) {
		//Hashmap������Ĵ�������������ġ�
		HashMap<Student,String> hmap = new HashMap<>();
		hmap.put(new Student("С����",10),"�Ͼ�");
		hmap.put(new Student("���Ƿ���",9),"����");
		hmap.put(new Student("�ܶ��",8),"�Ϻ�");
		hmap.put(new Student("�ʺ�",7),"����");
		hmap.put(new Student("������",6),"����");
		System.out.println(hmap);

	}

}
