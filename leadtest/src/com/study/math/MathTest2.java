package com.study.math;

import java.util.Random;

public class MathTest2 {

	public static void main(String[] args) {
		Random r = new Random();//���������,ÿһ�����ɵĶ���һ�������������������ɵ�Ҳ��һ��
		/*int x = r.nextInt();
		System.out.println(x);*/
		for(int i = 0;i < 9;i++) {
			System.out.println(r.nextInt(100));//����0��99�������
		}
        /*Random r2 = new Random(100);
        int a = r2.nextInt();
        int b = r2.nextInt();
        System.out.println(a);
        System.out.println(b);*/
	}

}
