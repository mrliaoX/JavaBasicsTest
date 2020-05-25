package com.study.string;

public class String_Test3 {
	/* boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
	   boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
	   boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
	   boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
	   boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
	   boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
	    demo4();
		demo5();
		
	}

	private static void demo5() {//boolean isEmpty():�ж��ַ����Ƿ�Ϊ��
		String s1 = "abcde";
		String s2 = "";
//		String s3 = null;
		System.out.println(s1.isEmpty());//������Ϊfalse
		System.out.println(s2.isEmpty());//������Ϊtrue
//		System.out.println(s3.isEmpty());
		/*""��null������""���ַ���������ͬʱҲ��String���󣬼�Ȼ�Ƕ���Ϳ��Ե���String����
		null�ǿճ��������ܵ����κη���������ؿ�ָ���쳣�ı���*/
	}

	private static void demo4() {/*boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
		   boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β*/
		String s1 = "abcd";
		System.out.println(s1.startsWith("a"));//������Ϊtrue
		System.out.println(s1.startsWith("f"));//������Ϊfalse
		System.out.println(s1.endsWith("d"));//������Ϊtrue
		System.out.println(s1.endsWith("c"));//������Ϊfalse
	}

	private static void demo3() {//boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ������ִ�Сд
		String s1 = "abcde";
		String s2 = "abc";
		String s3 = "Abc";
		System.out.println(s1.contains(s2));//������Ϊtrue
		System.out.println(s1.contains(s3));//������Ϊfalse
	}

	private static void demo2() {//boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		System.out.println(s1.equalsIgnoreCase(s2)); //������Ϊtrue
		System.out.println(s1.equalsIgnoreCase(s3));//������Ϊtrue
	}

	private static void demo1() {//boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "Abc";
		System.out.println(s1.equals(s2));//������Ϊtrue
		System.out.println(s1.equals(s3));//������Ϊfalse
	}

}
