package com.study.reflect.ref_test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflect_test {
	/**
	 * @param args
	 * ArrayList<Integer>��һ��������������������һ���ַ������ݣ����ʵ���أ�
	 * ����ֻ�ڱ�������Ч,�������ڻᱻ������,����Ӵ�������ȡ�ֽ����������ַ���
	 * @throws ClassNotFoundException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(222);
		
		Class clazz = Class.forName("java.util.ArrayList");//��ȡ�ֽ������
		Method m = clazz.getMethod("add", Object.class);//��ȡ��ӷ���
		m.invoke(list, "abc");//����invoke��������list����ַ���
		
		System.out.println(list);
		

	}

}
