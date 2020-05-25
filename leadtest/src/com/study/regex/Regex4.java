package com.study.regex;

import java.util.Arrays;

public class Regex4 {

	public static void main(String[] args) {
		demo1();
		demo2();

	}
	/*@param args
	案例演示
	需求:我有如下一个字符串:”91 27 46 38 50”，请写代码实现最终输出结果是:”27 38 46 50 91”
	   100
	   80
	分析:
	  1,将字符串切割成字符串数组
	  2,将字符串转换成数字并将其存储在一个等长度的int数组中
	  3,排序
	  4,将排序后的结果遍历并拼接成一个字符串*/
	private static void demo2() {
		
		String s = "91 27 46 38 50";
		//1,将字符串切割成字符串数组
		String[] arr = s.split(" ");
		//2创建一个int类型的和 arr长度一样的数组
		int[] arr2 = new int[arr.length];
		//将字符串转换成数字并将其存储在一个等长度的int数组中
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		//3,排序
		Arrays.sort(arr2);
		/*方法一：不推荐使用因为Str每一次都被新的字符串覆盖久的就别成垃圾这样会产生很多垃圾
		 * String str = "";
		for (int i = 0; i < arr2.length; i++) {
			if(i == arr2.length-1) {
				str = str + arr2[i];
			}else {
				str = str + arr2[i]+" ";
			}
		}
		System.out.println(str);*/
		
		/*方法二：使用StringBulider来解决 StringBulider种的append方法每次都是在屁股上加新值
		 *  所以不产生垃圾*/
		StringBuilder sb = new StringBuilder();//4,将排序后的结果遍历并拼接成一个字符串*/
		for (int i = 0; i < arr2.length; i++) {
			if(i == arr2.length-1) {
				sb.append(arr2[i]);
			}else {
				sb.append(arr2[i]+" ");
			}
		}
		System.out.println(sb);
	}
	/*	正则表达式的分割功能
	 *      spilt方法
			string类的功能: pub11c str1ng[] ap11t(String regex)
		案例演示
			由正则表达式的分制功能*/
	private static void demo1() {
		String s = "蜡笔小新.小白.小爱.娜娜子";
		String[] arr = s.split("\\.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
