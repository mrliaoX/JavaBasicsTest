package com.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {
	/*  Pattern p = Pattern.compile("a*b");
	    Matcher m = p.matcher("aaaaab");
	    boolean b = m.matches();*/
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b"); //获取正则表达式
	    Matcher m = p.matcher("aaaaab");     //获取匹配器
	    boolean b = m.matches();             //看是否能匹配，匹配就返回true
	    System.out.println(b);

	}

}
