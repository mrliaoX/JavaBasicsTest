package com.study.io_stream.digui;

import java.math.BigInteger;

public class Digui_Case6 {
//	����:���1000�Ľ׳��������β����ĸ���,���õݹ���
	/*��������Ϊ1000�Ľ׳�ԶԶ������int��long��ȡֵ��Χ
	 *      ���Ա�����biginteger
	 *      */
	public static void main(String[] args) {
		demo1();
		demo2(/*1000000000*/);
		System.out.println(factorial(39));
		
	}
	//���������õݹ�����Ϊ������long���͵�Ҳֻ��֧�ֵ�39�Ľ׳����Ա�����biginteger
	private static long factorial(long n) {
	    if(n == 1) {
	    	return 1;
	    }else {
	    	return n * factorial(n-1);
        }
	
    }

	//�ݹ���ü���1000�Ľײ�β��0�ĸ���
	public static int fun(int num) {
		if(num > 0 && num < 5) {
			return 0;
		}else {
			return num / 5 + fun(num / 5);
		}
	}
	//����1000�׳���β���м���0
	private static void demo2(/*Integer num*/) {//�����ν�����ԭ����������int��long�����з�Χ�ģ��������������int��long��Χ�ͻ�����쳣
		//����bigintger�Ķ��󣬲�ͨ�����췽������bi1��ʼ��ֵΪ1
		BigInteger bi1 = new BigInteger("1");
		//����1000�ײ�Ľ��
		for(int i = 1 ;i <= 1000/*num*/; i++) {
		//����bigintger����bi2���ڼ���׳�
		BigInteger bi2 = new BigInteger(i+"");
		bi1 = bi1.multiply(bi2);//multiply���� Ϊ this * val
		}
		//����Ľ��ת��Ϊ�ַ�������
		String line = bi1.toString();
		StringBuilder sb = new StringBuilder(line);
		line = sb.reverse().toString();
		int count = 0;
		for(int i = 0; i < line.length();i++) {
			if('0' != line.charAt(i)) {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
//  ����1000�׳˽����0�ĸ���
	private static void demo1() {
		//����bigintger�Ķ��󣬲�ͨ�����췽������bi1��ʼ��ֵΪ1
		BigInteger bi1 = new BigInteger("1");
		//����1000�ײ�Ľ��
		for(int i = 1 ;i <= 1000; i++) {
			//����bigintger����bi2���ڼ���׳�
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);//multiply���� Ϊ this * val
		}
		//����Ľ��ת��Ϊ�ַ�������
		String line = bi1.toString();
		//������
		int count = 0;
		//��������0�ĸ���
		for (int i = 0; i < line.length(); i++) {
			if('0' == line.charAt(i)) {//�õ�ÿһ�������ж��Ƿ���0
				count++;
			}
		}
		//������
		System.out.println(count);
	}

}
