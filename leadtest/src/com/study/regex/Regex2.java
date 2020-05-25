package com.study.regex;

public class Regex2 {
	/*Ԥ�����ַ���
		  .�κ��ַ���
		  \d����: [0-9]
		  \w�ص����ַ�: [a-zA-Z_ 0-9]*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();

	}

	private static void demo3() {//w�ص����ַ�: [a-zA-Z_ 0-9]�������ⵥ�������ַ�������
		String regex = "\\w";
		System.out.println("%".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("0".matches(regex));
	}

	private static void demo2() {//�������ⵥ������
		String regex = "\\d";
		System.out.println("0".matches(regex));
		System.out.println("32".matches(regex));
	}

	private static void demo1() { // .�κ��ַ��������ⵥ���ַ�
		String regex = ".";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("!".matches(regex));
	}

}
