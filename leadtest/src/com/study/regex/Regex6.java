package com.study.regex;

public class Regex6 {
/*正则表达式的分组功能
捕获组可以通过从左到右计算其开括号来编号。例如，在表达式 ((A)(B(C))) 中，存在四个这样的组： 

		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		组零始终代表整个表达式。*/
	public static void main(String[] args) {
		demo1();
		String regex2 = "(..)\\1";/*组中的词出现一次相当于ABAB*/
		System.out.println("哈皮哈皮".matches(regex2));
		System.out.println("平平安安".matches(regex2));
		System.out.println("渐渐康康".matches(regex2));

	}

	private static void demo1() {
		String regex = "(.)\\1(.)\\2";  /*\\1表示第一组再出现一次，\\2表示第二组再出现一次
		                                  相当于AABB*/
		System.out.println("你好你好".matches(regex));
		System.out.println("妮妮妮妮".matches(regex));
		System.out.println("红红火火".matches(regex));
	}

}
