package com.study.regex;

public class RegexCase1 {
/*	
    �滻
	��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
	���ַ�����ԭ��:����Ҫѧ��̡���*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	private static void demo2() {
		String s = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String s2 = s.replaceAll("\\.+", "");
		String s3 = s2.replaceAll("(.)\\1+", "$1");
		System.out.println(s3);
	}	
	/*�и�
	�����밴�յ����и "sdqqfgkkkhjppppkl";*/
	private static void demo1() {
		String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";//  \\1+������е��ַ�����һ�λ���
		String[] s2 = s.split(regex);
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]+" ");
		}
	}

}
