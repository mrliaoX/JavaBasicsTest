package com.study.bigInteger;

import java.math.BigInteger;

public class BigIntegerTest1 {
	/*可以让超过Integer范围内的数据进行运算
	构造方法
	  public BigInteger(String val)
    成员方法
	  public BigInteger add(BigInteger val) 加
	  public BigInteger subtract(BigInteger val) 减
	  public BigInteger multiply(BigInteger val) 乘
	  public BigInteger divide(BigInteger val)   除
	  public BigInteger[] divideAndRemainder(BigInteger val)*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		
	}

	private static void demo4() {
		BigInteger bi = new BigInteger("9");
		BigInteger b = new BigInteger("3");
		System.out.println(bi.divide(b));
	}

	private static void demo3() {  //整数乘
		BigInteger bi = new BigInteger("3");
		BigInteger b = new BigInteger("2");
		System.out.println(bi.multiply(b));
	}

	private static void demo2() { // 整数减法
		BigInteger bi = new BigInteger("3");
        BigInteger b = new BigInteger("1");
        System.out.println(bi.subtract(b));
	}

	private static void demo1() {  //整数加法
		BigInteger bi = new BigInteger("100");
		BigInteger b = new BigInteger("5");
		System.out.println(bi.add(b));
		System.out.println(bi.add(bi));
	}

}
