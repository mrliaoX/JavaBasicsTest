package com.study.regex;

public class RegexCheck {
  /*����:У��gq���롣
		1:Ҫ�������5-15λ����
		2:0���ܿ�ͷ
		3:���붼������
    У��gg
		1����ȷ����ֵ����boolean
		2����ȷ�����б�String gg*/
	public static void main(String[] args) {
		String regex = "[1-9]\\d{4,14}";
        System.out.println("123456".matches(regex));
        System.out.println("0290933748".matches(regex));
        System.out.println("acv222333".matches(regex));
	}

}
