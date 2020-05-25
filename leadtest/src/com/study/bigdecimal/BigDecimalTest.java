package com.study.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalTest {
/*	BigDecimal的概述
	  由于在运算的时候，float类型和double很容易丢失精度，演示案例。
	  所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
	  不可变的、任意精度的有符号十进制数。
   构造方法
	  public BigDecimal(String val)
   成员方法
	  public BigDecimal add(BigDecimal augend)带有小数的加
	  public BigDecimal subtract(BigDecimal subtrahend)带有小数的减
	  public BigDecimal multiply(BigDecimal multiplicand)带有小数的乘
	  public BigDecimal divide(BigDecimal divisor)带有小数的除*/
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
