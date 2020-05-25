package com.study.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarCase {
	 /*������ʾ
		* ���󣺼���¼������һ����ݣ��жϸ��������껹��ƽ��
		* ������
		*     1 Scanner¼��������ַ���
		*     2 ���ַ���ת�������ڶ���int��
		*     3 ʹ��calendar�෽����������
		*     4 �ж��������ڶ����Ƿ���29���оͷ���true
		*     5 ���*/
	public static void main(String[] args) {
		//1 ����Scanner¼��������ַ���
		Scanner s = new Scanner(System.in);
		System.out.println("������һ�����");
		String line = s.nextLine();//¼���ַ���
		//2 ���ַ���ת�������ڶ���int��
		int year = Integer.parseInt(line);
		//5 ���
		boolean b = getYear(year);//�������͵�ֵ�����жϵĽ��
		System.out.println(b);
		s.close();

	}

	private static boolean getYear(int year) {
		//3 ����calendar�����calendar�еķ�����������
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);//��������
		c.add(Calendar.DAY_OF_MONTH, -1);//��λ���������һ�죬��3��1��-1��
		//4 �ж��������ڶ����Ƿ���29���оͷ���true
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
