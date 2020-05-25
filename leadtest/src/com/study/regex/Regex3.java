package com.study.regex;

public class Regex3 {
	/*Greedy数量词
		X? 一次或一次也没有
		X* 零次或多次
		X+ 一次或多次
		X{n} 怡好n次
		X{n,} 至少n次
		X{n,m} 至少n次，但是不超过m次*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		demo5();
		demo6();

	}

	private static void demo6() {//X{n,m} 至少n次，但是不超过m次
		String regex = "[abcde]{1,3}";
		System.out.println("a".matches(regex));
		System.out.println("v".matches(regex));
		System.out.println("abcd".matches(regex));
	}

	private static void demo5() {//X{n,} 至少n次
		String regex = "[abcde]{2,}";
		System.out.println("ac".matches(regex));
		System.out.println("acede".matches(regex));
		System.out.println("abcvwddx".matches(regex));
	}

	private static void demo4() {//X{n} 怡好n次（与范围内的字符相同且恰好两次，字符可以重复）
		String regex = "[abcde]{2}";
		System.out.println("a".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("ac".matches(regex));
	}

	private static void demo3() {//X+ 一次或多次必须要和范围内的字符相同顺序可以不同)
		String regex = "[abcd]+";
		System.out.println("a".matches(regex));
		System.out.println("bc".matches(regex));
		System.out.println("".matches(regex));
	}

	private static void demo2() {//X* 零次或多次必须要和范围内的字符同)
		String regex = "[123]*";
		System.out.println("1".matches(regex));
		System.out.println("12".matches(regex));
		System.out.println("123".matches(regex));
		System.out.println("".matches(regex));
	}

	private static void demo1() {//X? 一次或一次也没有(必须要和范围内的字符同)
		String regex = "[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("bc".matches(regex));
	}

}
