package com.study.string;

public class String_Test4 {
	/** int length():��ȡ�ַ����ĳ��ȡ�
	* char charAt(int index):��ȡָ������λ�õ��ַ�
	* int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
	* int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
	* int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
	* int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
	* lastIndexOf
	* String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
	* String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����*/
	public static void main(String[] args) {
         demo1();
         demo2();
         String s1 = "abcdef";
         String a = s1.substring(1);//String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
         System.out.println(a);//��������bcdef
         String b = s1.substring(1, 4);//String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���
         System.out.println(b);//��������bcd
           
	}

	private static void demo1() {
		String s1 = "abcd";
         System.out.println(s1.length()); //int length():��ȡ�ַ����ĳ��ȡ�
         
         char a = s1.charAt(2);// char charAt(int index):��ȡָ������λ�õ��ַ�
         System.out.println(a);
	}

	private static void demo2() {
		String s2 = "abcbsxa";
		
           int b1 = s2.indexOf('a');//int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
           System.out.println(b1);
           
           int b2 = s2.indexOf("bc");//int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
           System.out.println(b2);
           
           int b3 = s2.indexOf('a', 4);//int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
           System.out.println(b3);
           
           int b4 = s2.indexOf("bc", 1);//int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
           System.out.println(b4);
	}

}
