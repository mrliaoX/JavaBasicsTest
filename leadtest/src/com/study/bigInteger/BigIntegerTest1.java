package com.study.bigInteger;

import java.math.BigInteger;

public class BigIntegerTest1 {
	/*�����ó���Integer��Χ�ڵ����ݽ�������
	���췽��
	  public BigInteger(String val)
    ��Ա����
	  public BigInteger add(BigInteger val) ��
	  public BigInteger subtract(BigInteger val) ��
	  public BigInteger multiply(BigInteger val) ��
	  public BigInteger divide(BigInteger val)   ��
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

	private static void demo3() {  //������
		BigInteger bi = new BigInteger("3");
		BigInteger b = new BigInteger("2");
		System.out.println(bi.multiply(b));
	}

	private static void demo2() { // ��������
		BigInteger bi = new BigInteger("3");
        BigInteger b = new BigInteger("1");
        System.out.println(bi.subtract(b));
	}

	private static void demo1() {  //�����ӷ�
		BigInteger bi = new BigInteger("100");
		BigInteger b = new BigInteger("5");
		System.out.println(bi.add(b));
		System.out.println(bi.add(bi));
	}

}
