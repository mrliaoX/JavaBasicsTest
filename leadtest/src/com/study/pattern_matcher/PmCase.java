package com.study.pattern_matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PmCase {
	/*需求：把一个字符串中的手机号码获取出来*/
	public static void main(String[] args) {
		String s = "阿呆13123456789妮妮的电话：15673237766风间的电话18812345678";
        String regex = "1[358]\\d{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()) {
        	System.out.println(m.group());
        }
        
	}

}
