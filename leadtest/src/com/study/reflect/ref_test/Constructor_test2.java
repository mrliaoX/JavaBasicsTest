package com.study.reflect.ref_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.study.reflect.person.Person;


/*
 * ͨ�������ȡ��Ա����
 * */
public class Constructor_test2 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.study.reflect.person.Person");
		
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("����",18);
		
		Field f = clazz.getDeclaredField("name");//���������ȡ�ֶ�˽�е�Ҳ���Ի�ȡ
		f.setAccessible(true);//ȥ��˽��Ȩ��
		f.set(p, "С��");//�޸�����
		System.out.println(p);
		

	}

}
