package com.study.reflect.ref_test;

import com.study.io_stream.Person;

public class Reflect_Test1 {
    /*��������ַ�ʽ��1��Class clazz = class.forName("����");//��ȡ�����ļ�
                      2��Class clazz = ����.class; //������̬������������
                      3��Class clazz = ����.getclass(); //�ж��Ƿ���ͬһ���ֽ������*/	
	public static void main(String[] args) throws ClassNotFoundException {
//		1��class.forName("Դ�ļ�");//�԰�����
		Class clazz1 = Class.forName("com.study.reflect.person.Person");
//		2������.class; //�������
		Class clazz2 = Person.class;
//		3������.getclass(); //�Է���
		Person p = new Person();
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz3);
		System.out.println(clazz2 == clazz3);
		

	}

}
