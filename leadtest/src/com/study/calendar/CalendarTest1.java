package com.study.calendar;

import java.util.Calendar;

public class CalendarTest1 {
	/*Calendar��ĸ���
	  Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
    ��Ա����
	  public static Calendar getInstance()
	  public int get(int field)*/
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));//���ֶ�����ȡ���
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//��ȡһ�����еڵڼ���
		//��ȡ���еĵڼ��죬�ǰ�����ĩ�ǵ�һ�죬���������һ��ĸ�ʽ�������
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.YEAR)+"��"+c.get(Calendar.MONTH)+"��"+
		                    c.get(Calendar.DAY_OF_MONTH)+"��"+ getweek(c.get(Calendar.DAY_OF_WEEK)));
		
	}
	/*�����ڴ洢�ڱ��н��в�ѯ
	 * ����ֵString
	 * ���� int week*/
	public static String getweek(int week) {
		String[] arr = {"","����һ","���ڶ�","������","������","������","������","������"};
		return arr[week];
	}

}
