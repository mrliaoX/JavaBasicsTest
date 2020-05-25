package com.study.io_stream.digui;

import java.util.ArrayList;

public class Digui_Case7 {
	/*约瑟夫环
	 * * 幸运数字 8个人围一圈数数，谁数到3的倍数就被淘汰，直到剩下最后一个人，求出那个人所站的位置*/
	public static void main(String[] args) {
		System.out.println(getLuckyNum(8));

	}

	private static int getLuckyNum(int num) {
		//创建集合存储1到num的对象 num表示
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);   //将人安排进位置（将8个数添加进集合）
		}
		//计数从1开始数
		int count = 1;
		for (int i = 0; list.size() != 1;i++) {//只要集合中人数超过1,就要不断的杀
			if(i == list.size()) {//如果i增长到集合最大的索引+1时，就把i归0形成一个圈
				i = 0;
			}
			if(count % 3 == 0) {//数到3的倍数
				list.remove(i--);//淘汰到那个位置的人（去除索引位置对应的数）
			}
			count++;
		}
		return list.get(0);//获取
		
	}

}
