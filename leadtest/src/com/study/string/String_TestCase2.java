package com.study.string;

import java.util.Scanner;

public class String_TestCase2 {
	
	public static void main(String[] args) {
		demo1();
		demo2();
	}
	/** ����ͳ�ƴ���С�����ֵĴ���
	* ����Ĵ󴮺�С�������Լ������������
	* ��baimaoheimaozhuadaolaoshudecaishihaomao���ҵ�mao���ִ���*/
	/*������1��ȡ����һ�γ���m��ͷ���������û�з���-1 2������ҵ�m��ͷ��ȡ�����ϵ�ֵ����С�ַ����ĳ��ȡ�
	 * ��ȡ�󴮣�����ȡ��Ĵ󴮸�ֵ����
	3 ��������mao���ֵĴ������mao���ֵĴ���*/
	private static void demo2() {
		String s = "baimaoheimaozhuadaolaoshudecaishihaomao"; //������ַ���
		String s1 = "mao";//����С�ַ���
		int num = 0;   //������

//		����һ��
		for(int i= 0;i<s.length();i++) {
			int a1 = s.indexOf(s1);//��ȡ����
//			char a2 = s.charAt(s.indexOf('m'));//��ȡ��һ��m�ַ�������a2
			if(a1!=-1) {
				s = s.substring(a1+(s1.length()-1));   //��ȡsʣ����ַ���
				num++;                   //��¼mao���ִ���
			}else {
				break;
			}
			
		}
		System.out.println(num);
//		��������
		int index =0;
		while((index = s.indexOf(s1))!= -1) {
			num++;//����������
			s = s.substring(index + s.length());
		}
		System.out.println(num);
	}
	/** ���󣺰��ַ�����ת
	* ����������¼��"abc"		
	* ��������"cba"*/
	/*��������Ҫһ��Scanner���ܼ���¼��Ȼ��洢��line��,����ת�������飬
	����һ��for��������������*/
	private static void demo1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		sc.close();
		String s = "";
		for(int i = arr.length-1;i >= 0 ;i--) {
			s = s+arr[i];
		}
        System.out.println(s);
	}
	
	

}
