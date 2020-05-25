package com.study.pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PmCase {
	/*���󣺰�һ���ַ����е��ֻ������ȡ����*/
	public static void main(String[] args) {
		String s = "����13123456789���ݵĵ绰��15673237766���ĵ绰18812345678";
        String regex = "1[358]\\d{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()) {
        	System.out.println(m.group());
        }
        
	}

}
