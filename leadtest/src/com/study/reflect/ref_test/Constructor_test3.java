package com.study.reflect.ref_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.study.reflect.person.Person;

public class Constructor_test3 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.study.reflect.person.Person");//��ȡ�����ļ�
		Constructor c = clazz.getConstructor(String.class,int.class);	//��ȡ�вι���
		Person p = (Person) c.newInstance("����",23);						//ͨ���вι��촴������
		
		Method m = clazz.getMethod("eat");								//��ȡeat����
		m.invoke(p);
		
		Method m2 = clazz.getMethod("eat", int.class);					//��ȡ�вε�eat����
		m2.invoke(p, 10);

	}

}
