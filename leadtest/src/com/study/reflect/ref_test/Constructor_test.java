package com.study.reflect.ref_test;

import java.lang.reflect.Constructor;

import com.study.reflect.person.Person;


/*
 * ͨ�������ȡ�вι��첢ʹ�� 
 * */
public class Constructor_test {
//	constructor�ǹؼ��ֲ�����������
	
	 /*Class���newInstance()������ʹ�ø����޲εĹ��캯����������, ���һ����û���޲εĹ��캯��,
	 �Ͳ�������������,���Ե���Class���getConstructor
     (String.class,int.class)������ȡһ��ָ���Ĺ��캯��Ȼ���ٵ���Constructor���newInstance*/
	public static void main(String[] args) throws Exception {
//		���������вι�������������
		Class clazz = Class.forName("com.study.reflect.person.Person");
		/*Person p = (Person) clazz.newInstance();
		System.out.println(p);//���캯���޷�������ĳ�Աcom.study.reflect.person.person
		                        ���˴��������private��*/
		//�вι��촴������
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p =  (Person) c.newInstance("С��",22);
		System.out.println(p);
	}

}
