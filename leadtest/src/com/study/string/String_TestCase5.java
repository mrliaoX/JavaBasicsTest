package com.study.string;

public class String_TestCase5 {
	/*������ʾ
	* ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)*/
	public static void main(String[] args) {
		String s = "iloveYOU";
		String a = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(a);
	}

}
