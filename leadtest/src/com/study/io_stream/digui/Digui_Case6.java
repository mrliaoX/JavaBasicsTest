package com.study.io_stream.digui;

import java.math.BigInteger;

public class Digui_Case6 {
//	需求:求出1000的阶乘所有零和尾部零的个数,不用递归做
	/*分析：因为1000的阶乘远远超出了int和long的取值范围
	 *      所以必须用biginteger
	 *      */
	public static void main(String[] args) {
		demo1();
		demo2(/*1000000000*/);
		System.out.println(factorial(39));
		
	}
	//不能这样用递归是因为就算是long类型的也只能支持到39的阶乘所以必须用biginteger
	private static long factorial(long n) {
	    if(n == 1) {
	    	return 1;
	    }else {
	    	return n * factorial(n-1);
        }
	
    }

	//递归调用计算1000的阶层尾部0的个数
	public static int fun(int num) {
		if(num > 0 && num < 5) {
			return 0;
		}else {
			return num / 5 + fun(num / 5);
		}
	}
	//计算1000阶乘中尾部有几个0
	private static void demo2(/*Integer num*/) {//不传参进来的原因是无论是int，long都是有范围的，当传入的数穿过int或long范围就会编译异常
		//创建bigintger的对象，并通过构造方法定义bi1初始化值为1
		BigInteger bi1 = new BigInteger("1");
		//计算1000阶层的结果
		for(int i = 1 ;i <= 1000/*num*/; i++) {
		//创建bigintger对象bi2用于计算阶乘
		BigInteger bi2 = new BigInteger(i+"");
		bi1 = bi1.multiply(bi2);//multiply方法 为 this * val
		}
		//计算的结果转化为字符串类型
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
//  计算1000阶乘结果中0的个数
	private static void demo1() {
		//创建bigintger的对象，并通过构造方法定义bi1初始化值为1
		BigInteger bi1 = new BigInteger("1");
		//计算1000阶层的结果
		for(int i = 1 ;i <= 1000; i++) {
			//创建bigintger对象bi2用于计算阶乘
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);//multiply方法 为 this * val
		}
		//计算的结果转化为字符串类型
		String line = bi1.toString();
		//计数器
		int count = 0;
		//计算结果中0的个数
		for (int i = 0; i < line.length(); i++) {
			if('0' == line.charAt(i)) {//拿到每一个索引判断是否是0
				count++;
			}
		}
		//输出结果
		System.out.println(count);
	}

}
