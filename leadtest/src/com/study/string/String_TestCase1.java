package com.study.string;

public class String_TestCase1 {
	/** 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
	* ABCDEabcd123456!@#$%^*/
	public static void main(String[] args) {
        demo1();
        
	}
	private static void demo1() {
		String s1 = "ABCDEabcd123456!@#$%^";
        int big = 0;
        int small= 0;
        int other = 0;
        int num = 0;
        for(int i = 0;i<s1.length();i++) {
        	char a1 = s1.charAt(i);
        	if ('A'<= a1 &&'Z'>=a1) {
				big++;
			}else if('a'<= a1 && 'z'>=a1){
				small++;
			}else if('0'<= a1 && '9'>=a1){
				num++;
			}else {
				other++;
			}
        }
        System.out.println("大写字母："+big+" 小写字母："+small+" 数字："+num+" 字符："+other);
        return ;
	}
        
}
