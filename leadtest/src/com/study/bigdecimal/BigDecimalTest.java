package com.study.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalTest {
/*	BigDecimal�ĸ���
	  �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
	  ���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
	  ���ɱ�ġ����⾫�ȵ��з���ʮ��������
   ���췽��
	  public BigDecimal(String val)
   ��Ա����
	  public BigDecimal add(BigDecimal augend)����С���ļ�
	  public BigDecimal subtract(BigDecimal subtrahend)����С���ļ�
	  public BigDecimal multiply(BigDecimal multiplicand)����С���ĳ�
	  public BigDecimal divide(BigDecimal divisor)����С���ĳ�*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();

	}

	private static void demo4() {
		BigDecimal bd = new BigDecimal("9.9");
		BigDecimal b = new BigDecimal("0.3");
		System.out.println(bd.divide(b));
	}

	private static void demo3() {
		BigDecimal bd = new BigDecimal("0.5");
		BigDecimal b = new BigDecimal("0.3");
		System.out.println(bd.multiply(b));
	}

	private static void demo2() {
		BigDecimal bd = new BigDecimal("10.7");
		BigDecimal b = new BigDecimal("1.6");
		System.out.println(bd.subtract(b));
	}

	private static void demo1() {
		BigDecimal bd = new BigDecimal("3.0");
		BigDecimal b = new BigDecimal("1.2");
		System.out.println(bd.add(b));
	}

}
