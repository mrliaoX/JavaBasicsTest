package com.study.regex;

public class Regex6 {
/*������ʽ�ķ��鹦��
���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺 

		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		����ʼ�մ����������ʽ��*/
	public static void main(String[] args) {
		demo1();
		String regex2 = "(..)\\1";/*���еĴʳ���һ���൱��ABAB*/
		System.out.println("��Ƥ��Ƥ".matches(regex2));
		System.out.println("ƽƽ����".matches(regex2));
		System.out.println("��������".matches(regex2));

	}

	private static void demo1() {
		String regex = "(.)\\1(.)\\2";  /*\\1��ʾ��һ���ٳ���һ�Σ�\\2��ʾ�ڶ����ٳ���һ��
		                                  �൱��AABB*/
		System.out.println("������".matches(regex));
		System.out.println("��������".matches(regex));
		System.out.println("�����".matches(regex));
	}

}
