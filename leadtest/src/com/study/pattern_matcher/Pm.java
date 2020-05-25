package com.study.pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pm {
	/*  Pattern p = Pattern.compile("a*b");
	    Matcher m = p.matcher("aaaaab");
	    boolean b = m.matches();*/
	public static void main(String[] args) {
		 Pattern p = Pattern.compile("a*b");  //获取正则表达式
		 Matcher m = p.matcher("aaaaab");      //获取匹配器(匹配内容)
		 boolean b = m.matches();              //查看内容是否匹配，匹配返回true
		 System.out.println(b);

	}

}
