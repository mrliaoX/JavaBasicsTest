package com.study.algorithm;

public class StringBuffer_5 {
    /*StringBuffer�Ľ�ȡ����
	    public String substring(int start) :
		��ָ��λ�ý�ȡ��ĩβ
		public string substring(int start,int end) :
		��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ��,����������λ��
		ע������
		ע��:����ֵ���Ͳ�����stringBuffer����*/
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefg");	
		System.out.println(sb.substring(1)); //��ָ��λ�ý�ȡ��ĩβ
		System.out.println(sb.substring(2, 6));/*��ְ��ָ��λ�ÿ�ʼ������λ�ã�
		                                        ������ʼλ��,����������λ��*/

	}

}
