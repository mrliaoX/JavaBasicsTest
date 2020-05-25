package com.study.regex;

public class Regex5 {
   /* 正则表达式的替换功能
    * String类的功能:public String replaceAll(String regex,String replacement)*/
	public static void main(String[] args) {
		/*public String replaceAll(String regex,String replacement)相当于把XXX用XXX替换
		                                                           但是必须是String类型的*/
        String s = "wahahaalibaba测试测试测试123";
        String regex = "\\d";
        String regex2 = "\\w";
        String regex3 = "[测试]";
        String s2 = s.replaceAll(regex, "");
        System.out.println(s2);
        String s3 = s.replaceAll(regex2, "");
        System.out.println(s3);
        String s4 = s.replaceAll(regex3, "");
        System.out.println(s4);
        
	}

}
