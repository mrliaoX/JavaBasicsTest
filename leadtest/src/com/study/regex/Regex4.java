package com.study.regex;

import java.util.Arrays;

public class Regex4 {

	public static void main(String[] args) {
		demo1();
		demo2();

	}
	/*@param args
	������ʾ
	����:��������һ���ַ���:��91 27 46 38 50������д����ʵ��������������:��27 38 46 50 91��
	   100
	   80
	����:
	  1,���ַ����и���ַ�������
	  2,���ַ���ת�������ֲ�����洢��һ���ȳ��ȵ�int������
	  3,����
	  4,�������Ľ��������ƴ�ӳ�һ���ַ���*/
	private static void demo2() {
		
		String s = "91 27 46 38 50";
		//1,���ַ����и���ַ�������
		String[] arr = s.split(" ");
		//2����һ��int���͵ĺ� arr����һ��������
		int[] arr2 = new int[arr.length];
		//���ַ���ת�������ֲ�����洢��һ���ȳ��ȵ�int������
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		//3,����
		Arrays.sort(arr2);
		/*����һ�����Ƽ�ʹ����ΪStrÿһ�ζ����µ��ַ������Ǿõľͱ����������������ܶ�����
		 * String str = "";
		for (int i = 0; i < arr2.length; i++) {
			if(i == arr2.length-1) {
				str = str + arr2[i];
			}else {
				str = str + arr2[i]+" ";
			}
		}
		System.out.println(str);*/
		
		/*��������ʹ��StringBulider����� StringBulider�ֵ�append����ÿ�ζ�����ƨ���ϼ���ֵ
		 *  ���Բ���������*/
		StringBuilder sb = new StringBuilder();//4,�������Ľ��������ƴ�ӳ�һ���ַ���*/
		for (int i = 0; i < arr2.length; i++) {
			if(i == arr2.length-1) {
				sb.append(arr2[i]);
			}else {
				sb.append(arr2[i]+" ");
			}
		}
		System.out.println(sb);
	}
	/*	������ʽ�ķָ��
	 *      spilt����
			string��Ĺ���: pub11c str1ng[] ap11t(String regex)
		������ʾ
			��������ʽ�ķ��ƹ���*/
	private static void demo1() {
		String s = "����С��.С��.С��.������";
		String[] arr = s.split("\\.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
