package com.study.try_catch;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Try_Catch_Test1 {
  /* 键盘录入一个int类型的整数 ,对其求二进制表现形式
	 如果录入的整数过大，给予提示，录入的整数过大请重新录入一个整数BigInteger
	 如果录入的是小数,给予提示，录入的是小数，请重新录入一个整数
	 如果录入的是其他字符,给予提示,录入的是非法字符，请重新录入一个整数*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("请输入一个整数：");
		//通过try嵌套将整数过大，小数，其他字符排除
		 while(true){
			String s = sc.nextLine();
			
			try {
					int num = Integer.parseInt(s);
					System.out.println(Integer.toBinaryString(num));
					break;
			} catch (Exception e) {
					try {
						new BigInteger(s);
						System.out.println("输入的整数过大，请重新输入");
					} catch (Exception e2) {
						try {
							new BigDecimal(s);
							System.out.println("输入错误输入为小数，请重写输入");
						} catch (Exception e3) {
							 System.out.println("输入的是非法字符，请重写输入");
						}
					}
			}
			
	 	 } 
	     sc.close();

	}

}
