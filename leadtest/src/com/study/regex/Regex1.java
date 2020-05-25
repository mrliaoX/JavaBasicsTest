package com.study.regex;

public class Regex1 {
	 /*字符类
		[abc]a.b或c(简单类)
		[^abc] 任何字符，除了a. b或c(否定)
		[a-zA-z] a到z或A到Z两头的字母包括在内(范围)
		[0-9] 0到9的字符都包括*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		
	}

	private static void demo4() {//[0-9] 0到9的字符都包括
		String regex = "[3-7]";
		System.out.println("5".matches(regex));
		System.out.println("0".matches(regex));
		System.out.println("5,6".matches(regex));
	}

	private static void demo3() {//[a-zA-z] a到z或A到Z两头的字母包括在内(范围)
		String regex = "[a-sB-E]";
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("D".matches(regex));
	}

	private static void demo2() {//[^abc] 任何字符，除了a. b或c(否定)
		String regex = "[^abcd]";
        System.out.println("a".matches(regex));
        System.out.println("f".matches(regex));
        System.out.println("fg".matches(regex));
	}

	private static void demo1() {//[abc]a.b或c(简单类)验证单字符
		String regex = "[abc]";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("f".matches(regex));
	}

}
