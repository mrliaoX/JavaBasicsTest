package com.study.string;

public class String_TestCase3 {
	 /*A:String���滻���ܼ�������ʾ
		* String replace(char old,char new)
		* String replace(String old,String new)
	* B:String��ȥ���ַ������ո񼰰�����ʾ
		* String trim()
	* C:String�İ��ֵ�˳��Ƚ������ַ�����������ʾ
		* int compareTo(String str)(��ʱ��������)
		* int compareToIgnoreCase(String str)(�˽�)
		*/
	public static void main(String[] args) {
		demo1();
        demo2();
	}

	private static void demo2() {/*String��ȥ���ַ������ո񼰰�����ʾ
		                           String trim()*/
		String s = "  hahaxi xihehe  ";
        String a = s.trim();
        System.out.println(a);
	}

	private static void demo1() { /*String���滻���ܼ�������ʾ
	                                 String replace(char old,char new)
		                             String replace(String old,String new)*/
		String s = "Chinanb";
		String a1 = s.replace('h','v' );
		System.out.println(a1);
		String a2 = s.replace("in", "vv");
		System.out.println(a2);
	}

}
