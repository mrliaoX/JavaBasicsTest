package com.study.string;

public class String_Test2 {
/*	
 * String�����Ĺ��췽��
 * 
 * * public String():�չ���
	* public String(byte[] bytes):���ֽ�����ת���ַ���
	* public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
	* public String(char[] value):���ַ�����ת���ַ���
	* public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
	* public String(String original):���ַ�������ֵת���ַ���
*/
	public static void main(String[] args) {
        demo1();
		demo2();	
        demo3();
        demo4();
        demo5();
        
	}

	private static void demo5() {//public String(String original):���ַ�������ֵת���ַ���
		String i = "a";            //����������
        String s5 = new String(i);
        System.out.println(s5);
	}

	private static void demo4() {//public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
		char[] d = {'a','b','c','d','e','f'};//������demo2ֻ���������ǰ��ַ�ת��demo2�ǰ��ֽ�ת��
		String s4 = new String(d,2,3);
		System.out.println(s4);
	}

	private static void demo3() {//public String(char[] value):���ַ�����ת���ַ���
		char[] c = {'a','b','c','d'};//�����൱�ڰѵ����ַ����ɴ���������abcd
        String s3 = new String(c);
        System.out.println(s3);
	}

	private static void demo2() {  //public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
		byte[] b = {65,66,67,68,69,70};//int index��ʾ�ӵڼ�������ʼ��int length��ʾҪת�������ַ���
		String s2 = new String(b,3,3);//�ӵ�������ʼת�����ת����������Ҳ��DEF
		System.out.println(s2);
	}

	private static void demo1() { //public String(byte[] bytes):���ֽ�����ת���ַ���
		byte[] a = {68,69,70};      //���ΪDEF ��Ϊ�ַ�������GBK�е�68��ӦD 69��ӦE 79��ӦF
		String s1 = new String(a);
		System.out.println(s1);
	}
	

}
