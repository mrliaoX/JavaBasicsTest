package com.study.calendar;

import java.util.Calendar;

public class CalendarTest2 {
	/*��Ա����
	  public void add(int field,int amount)
	  public final void set(int year,int month,int date)
    ������ʾ
	  Calendar��ĳ�Ա����ʹ��*/
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//���½��мӼ�
		c.add(Calendar.MONTH, +1);
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+
                c.get(Calendar.DAY_OF_MONTH)+"��");
		//������мӼ�
		c.add(Calendar.YEAR, -1);
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+
                c.get(Calendar.DAY_OF_MONTH)+"��");
		//����ݽ�������
		c.set(Calendar.YEAR, 2010);
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+
                c.get(Calendar.DAY_OF_MONTH)+"��");
		//�������ս�������
		c.set(2020, 3, 20);
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+
                c.get(Calendar.DAY_OF_MONTH)+"��");

	}

}
