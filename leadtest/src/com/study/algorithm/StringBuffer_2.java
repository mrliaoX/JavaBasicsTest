package com.study.algorithm;

public class StringBuffer_2 {
/*StringBuffer����ӹ���
		public StringBuffer append(String str) :
		   ���԰���������������ӵ��ַ�������������,�������ַ�������������
		public StringBuffer insert(int offset, String str) :
		   ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
	StringBuf fer���ַ���������,��new��ʱ�����ڶ��ڴ洴����һ������,�ײ���- -������Ϊ16���ַ�
	��������ӵķ���ʱ,���������´�������,�ڲ�����ԭ����������ַ�*/
	public static void main(String[] args) {
		demo2();
		demo1();
		
	}

	private static void demo2() {/*public StringBuffer append(String str) :
		                  ���԰���������������ӵ��ַ�������������,�������ַ�������������*/
		StringBuffer sb1 = new StringBuffer();	
		System.out.println(sb1.append("wahaha"));//������wahaha
	}

	private static void demo1() {/*public StringBuffer insert(int offset, String str) :
		         ��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������*/
		StringBuffer sb2 = new StringBuffer("wahaha");
		StringBuffer a = sb2.insert(1, "niuniu");//��1��λ�ò���niuniu
		System.out.println(a);//������wniuniuahaha
	}

}
