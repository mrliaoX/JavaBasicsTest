package com.study.pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pm {
	/*  Pattern p = Pattern.compile("a*b");
	    Matcher m = p.matcher("aaaaab");
	    boolean b = m.matches();*/
	public static void main(String[] args) {
		 Pattern p = Pattern.compile("a*b");  //��ȡ������ʽ
		 Matcher m = p.matcher("aaaaab");      //��ȡƥ����(ƥ������)
		 boolean b = m.matches();              //�鿴�����Ƿ�ƥ�䣬ƥ�䷵��true
		 System.out.println(b);

	}

}
