package com.study.string;

public class String_Test4 {
	/** int length():获取字符串的长度。
	* char charAt(int index):获取指定索引位置的字符
	* int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
	* int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
	* int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
	* int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
	* lastIndexOf
	* String substring(int start):从指定位置开始截取字符串,默认到末尾。
	* String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。*/
	public static void main(String[] args) {
         demo1();
         demo2();
         String s1 = "abcdef";
         String a = s1.substring(1);//String substring(int start):从指定位置开始截取字符串,默认到末尾。
         System.out.println(a);//输出结果是bcdef
         String b = s1.substring(1, 4);//String substring(int start,int end):从指定位置开始到指定位置结束截取字符串
         System.out.println(b);//输出结果是bcd
           
	}

	private static void demo1() {
		String s1 = "abcd";
         System.out.println(s1.length()); //int length():获取字符串的长度。
         
         char a = s1.charAt(2);// char charAt(int index):获取指定索引位置的字符
         System.out.println(a);
	}

	private static void demo2() {
		String s2 = "abcbsxa";
		
           int b1 = s2.indexOf('a');//int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引
           System.out.println(b1);
           
           int b2 = s2.indexOf("bc");//int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
           System.out.println(b2);
           
           int b3 = s2.indexOf('a', 4);//int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
           System.out.println(b3);
           
           int b4 = s2.indexOf("bc", 1);//int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
           System.out.println(b4);
	}

}
