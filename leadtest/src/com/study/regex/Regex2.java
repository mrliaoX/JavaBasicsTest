package com.study.regex;

public class Regex2 {
	/*预定义字符类
		  .任何字符。
		  \d数字: [0-9]
		  \w回单词字符: [a-zA-Z_ 0-9]*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();

	}

	private static void demo3() {//w回单词字符: [a-zA-Z_ 0-9]接受任意单个单词字符或数字
		String regex = "\\w";
		System.out.println("%".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("0".matches(regex));
	}

	private static void demo2() {//接收任意单个数字
		String regex = "\\d";
		System.out.println("0".matches(regex));
		System.out.println("32".matches(regex));
	}

	private static void demo1() { // .任何字符接收任意单个字符
		String regex = ".";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("!".matches(regex));
	}

}
