package com.study.map;

import java.util.LinkedHashMap;

public class Map_Case2_LinkedHashMap {
/*	������ʾ
	  LinkedHashMap���ص�
		  �ײ�������ʵ�ֵĿ��Ա�֤��ô�����ôȡ*/
	public static void main(String[] args) {
		LinkedHashMap<Student,String> lhmp = new LinkedHashMap<>();
		lhmp.put(new Student("������",20), "��");
		lhmp.put(new Student("����",19), "��");
		lhmp.put(new Student("������",18), "��");
		lhmp.put(new Student("ʱ��",17), "��");
		System.out.println(lhmp);

	}

}
