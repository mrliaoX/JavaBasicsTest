package com.study.arrays;

public class Arrays2 {
	/*int -- String ��4�ַ���
	  1����""����ƴ��
	  2��public static String valueOf(int i)
	  3�� int -- Integer -- string (Integer���tostring����())
	  4��public static String tostring(int i) (Integer��ľ�̬����)

	 String -- int ���ַ���
	   1��String -- Integer -- int
	   2��public static int parseInt (String s)
	   �����������Ͱ�װ���а��֣��������ֶ���parseXxx�ķ���,
	   ���Խ������ֵ��ַ���������ʽת���ɻ�����������*/

	public static void main(String[] args) {
		demo1();
	    demo2();

	}

	private static void demo2() {
		String i = "100";
	    Integer i2 = new Integer(i);
	    int a = i2.intValue();
	    System.out.println(a);
	}

	private static void demo1() {
		int i = 100;
		String s1 = i+"";
		String s2 = String.valueOf(i);
		
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		String s4 = Integer.toString(i);
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	    System.out.println(s4);
	}

}
