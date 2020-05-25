package com.study.math;

import java.util.Random;

public class MathTest2 {

	public static void main(String[] args) {
		Random r = new Random();//生成随机数,每一次生成的都不一样，给他传参数后生成的也不一样
		/*int x = r.nextInt();
		System.out.println(x);*/
		for(int i = 0;i < 9;i++) {
			System.out.println(r.nextInt(100));//生成0到99的随机数
		}
        /*Random r2 = new Random(100);
        int a = r2.nextInt();
        int b = r2.nextInt();
        System.out.println(a);
        System.out.println(b);*/
	}

}
