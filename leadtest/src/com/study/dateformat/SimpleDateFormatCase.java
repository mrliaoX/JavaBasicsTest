package com.study.dateformat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatCase {
	/*������ʾ
	  ������һ��������������������?
	  ������
	      1���������ַ���һ��ʱ����ʱ�䣬һ��ʱδ��ʱ��
	      2���ַ�����ʽ��ת����ʱ�����
	      3��ȡ����ʱ��������ֵ������ʱ���
	      4���������
	      5���*/

	public static void main(String[] args) throws ParseException {
		//1 ���������ַ���һ��ʱ����ʱ�䣬һ��ʱδ��ʱ��
		String s = "1995��9��9��";
		String st = "2020��9��9��";
		//2 ���ַ�����ʽ��ת����ʱ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d = sdf.parse(s); //ת����ʱ�����
		Date dt = sdf.parse(st);
		// 3 ��ȡ����ʱ��������ֵ������ʱ���
		long time = dt.getTime()- d.getTime();
		// 4 ���������
		long day = time/1000/60/60/24/365;
		// 5 ���
		System.out.println(day);

	}

}
