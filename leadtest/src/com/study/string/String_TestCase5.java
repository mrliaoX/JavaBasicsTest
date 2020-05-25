package com.study.string;

public class String_TestCase5 {
	/*案例演示
	* 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)*/
	public static void main(String[] args) {
		String s = "iloveYOU";
		String a = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(a);
	}

}
