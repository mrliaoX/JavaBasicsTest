package com.study.algorithm;

public class StringBuffer_1 {
	/*StringBuffer�Ĺ��췽��
	    public StringBuffer();   �޲ι��췽��
	    public StringBuffer(int capacity); ָ���������ַ�������������
	    public StringBuffer(String str);  ָ���ַ������ݵĻ���������*/
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//public StringBuffer();   �޲ι��췽��
//		StringBuffer������Ϊ16�ֽڡ�
		System.out.println(sb.length());//������Ϊ0  �����е��ַ����� ʵ��ֵ
		System.out.println(sb.capacity());//������Ϊ16  ����������    ����ֵ
		
		StringBuffer sb2 = new StringBuffer(10); /*�趨StringBuffer������ֵΪ10�ֽ�  
		                                           public StringBuffer(int capacity); ָ���������ַ�������������*/
		System.out.println(sb2.length());//������Ϊ0
		System.out.println(sb2.capacity());//������Ϊ10
		
		StringBuffer sb3 = new StringBuffer("wocao");// public StringBuffer(String str);  ָ���ַ������ݵĻ���������*/
		System.out.println(sb3.length());   //������Ϊ5
		System.out.println(sb3.capacity()); //������Ϊ21  �ַ�����length+��ʼ����
	}
}
