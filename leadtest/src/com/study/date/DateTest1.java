package com.study.date;

import java.util.Date;

public class DateTest1 {
	/*Date��ĸ���
	  �� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
    ���췽��
	  public Date()
	  public Date(long date)
    ��Ա����
	  public long getTime()
	  public void setTime(long time)*/

	public static void main(String[] args) {
		demo1();
		demo2();

	}

	private static void demo2() {
		Date d = new Date();
		System.out.println(d.getTime());//��ȡ��ǰʱ�����ֵΪ��λ
		System.out.println(System.currentTimeMillis());//���ص�ǰʱ�����ֵΪ��λ
	}

	private static void demo1() {
		Date d = new Date();
		System.out.println(d);
		Date d2 = new Date(0);
		System.out.println(d2);
	}

}
