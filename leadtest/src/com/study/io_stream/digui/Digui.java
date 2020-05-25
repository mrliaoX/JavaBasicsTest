package com.study.io_stream.digui;

public class Digui {
//	File类(递归) 自生不断的调用自身
	public static void main(String[] args) {
		int i = fun(5);
		System.out.println(i);

	}
    //创建一个阶层方法
	private static int fun(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * fun(num - 1);
		}
		
	}

}
