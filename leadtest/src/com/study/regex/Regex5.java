package com.study.regex;

public class Regex5 {
   /* ������ʽ���滻����
    * String��Ĺ���:public String replaceAll(String regex,String replacement)*/
	public static void main(String[] args) {
		/*public String replaceAll(String regex,String replacement)�൱�ڰ�XXX��XXX�滻
		                                                           ���Ǳ�����String���͵�*/
        String s = "wahahaalibaba���Բ��Բ���123";
        String regex = "\\d";
        String regex2 = "\\w";
        String regex3 = "[����]";
        String s2 = s.replaceAll(regex, "");
        System.out.println(s2);
        String s3 = s.replaceAll(regex2, "");
        System.out.println(s3);
        String s4 = s.replaceAll(regex3, "");
        System.out.println(s4);
        
	}

}
