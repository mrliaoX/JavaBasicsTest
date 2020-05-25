package com.study.regex;

public class RegexCheck {
  /*需求:校验gq号码。
		1:要求必须是5-15位数字
		2:0不能开头
		3:必须都是数字
    校验gg
		1、明确返回值类型boolean
		2、明确参数列表String gg*/
	public static void main(String[] args) {
		String regex = "[1-9]\\d{4,14}";
        System.out.println("123456".matches(regex));
        System.out.println("0290933748".matches(regex));
        System.out.println("acv222333".matches(regex));
	}

}
