package com.study.regex;

public class Regex1 {
	 /*�ַ���
		[abc]a.b��c(����)
		[^abc] �κ��ַ�������a. b��c(��)
		[a-zA-z] a��z��A��Z��ͷ����ĸ��������(��Χ)
		[0-9] 0��9���ַ�������*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		
	}

	private static void demo4() {//[0-9] 0��9���ַ�������
		String regex = "[3-7]";
		System.out.println("5".matches(regex));
		System.out.println("0".matches(regex));
		System.out.println("5,6".matches(regex));
	}

	private static void demo3() {//[a-zA-z] a��z��A��Z��ͷ����ĸ��������(��Χ)
		String regex = "[a-sB-E]";
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("D".matches(regex));
	}

	private static void demo2() {//[^abc] �κ��ַ�������a. b��c(��)
		String regex = "[^abcd]";
        System.out.println("a".matches(regex));
        System.out.println("f".matches(regex));
        System.out.println("fg".matches(regex));
	}

	private static void demo1() {//[abc]a.b��c(����)��֤���ַ�
		String regex = "[abc]";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("f".matches(regex));
	}

}
