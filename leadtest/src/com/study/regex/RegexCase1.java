package com.study.regex;

public class RegexCase1 {
/*	
    替换
	需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
	将字符串还原成:“我要学编程”。*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	private static void demo2() {
		String s = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String s2 = s.replaceAll("\\.+", "");
		String s3 = s2.replaceAll("(.)\\1+", "$1");
		System.out.println(s3);
	}	
	/*切割
	需求：请按照叠词切割： "sdqqfgkkkhjppppkl";*/
	private static void demo1() {
		String s = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";//  \\1+让组合中的字符出现一次或多次
		String[] s2 = s.split(regex);
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i]+" ");
		}
	}

}
