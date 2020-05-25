package com.study.string;

public class String_TestCase3 {
	 /*A:String的替换功能及案例演示
		* String replace(char old,char new)
		* String replace(String old,String new)
	* B:String的去除字符串两空格及案例演示
		* String trim()
	* C:String的按字典顺序比较两个字符串及案例演示
		* int compareTo(String str)(暂时不用掌握)
		* int compareToIgnoreCase(String str)(了解)
		*/
	public static void main(String[] args) {
		demo1();
        demo2();
	}

	private static void demo2() {/*String的去除字符串两空格及案例演示
		                           String trim()*/
		String s = "  hahaxi xihehe  ";
        String a = s.trim();
        System.out.println(a);
	}

	private static void demo1() { /*String的替换功能及案例演示
	                                 String replace(char old,char new)
		                             String replace(String old,String new)*/
		String s = "Chinanb";
		String a1 = s.replace('h','v' );
		System.out.println(a1);
		String a2 = s.replace("in", "vv");
		System.out.println(a2);
	}

}
