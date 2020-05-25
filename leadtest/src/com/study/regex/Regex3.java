package com.study.regex;

public class Regex3 {
	/*Greedy������
		X? һ�λ�һ��Ҳû��
		X* ��λ���
		X+ һ�λ���
		X{n} ����n��
		X{n,} ����n��
		X{n,m} ����n�Σ����ǲ�����m��*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		demo5();
		demo6();

	}

	private static void demo6() {//X{n,m} ����n�Σ����ǲ�����m��
		String regex = "[abcde]{1,3}";
		System.out.println("a".matches(regex));
		System.out.println("v".matches(regex));
		System.out.println("abcd".matches(regex));
	}

	private static void demo5() {//X{n,} ����n��
		String regex = "[abcde]{2,}";
		System.out.println("ac".matches(regex));
		System.out.println("acede".matches(regex));
		System.out.println("abcvwddx".matches(regex));
	}

	private static void demo4() {//X{n} ����n�Σ��뷶Χ�ڵ��ַ���ͬ��ǡ�����Σ��ַ������ظ���
		String regex = "[abcde]{2}";
		System.out.println("a".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("ac".matches(regex));
	}

	private static void demo3() {//X+ һ�λ��α���Ҫ�ͷ�Χ�ڵ��ַ���ͬ˳����Բ�ͬ)
		String regex = "[abcd]+";
		System.out.println("a".matches(regex));
		System.out.println("bc".matches(regex));
		System.out.println("".matches(regex));
	}

	private static void demo2() {//X* ��λ��α���Ҫ�ͷ�Χ�ڵ��ַ�ͬ)
		String regex = "[123]*";
		System.out.println("1".matches(regex));
		System.out.println("12".matches(regex));
		System.out.println("123".matches(regex));
		System.out.println("".matches(regex));
	}

	private static void demo1() {//X? һ�λ�һ��Ҳû��(����Ҫ�ͷ�Χ�ڵ��ַ�ͬ)
		String regex = "[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("bc".matches(regex));
	}

}
