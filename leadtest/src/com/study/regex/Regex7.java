package com.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {
	/*  Pattern p = Pattern.compile("a*b");
	    Matcher m = p.matcher("aaaaab");
	    boolean b = m.matches();*/
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b"); //��ȡ������ʽ
	    Matcher m = p.matcher("aaaaab");     //��ȡƥ����
	    boolean b = m.matches();             //���Ƿ���ƥ�䣬ƥ��ͷ���true
	    System.out.println(b);

	}

}
