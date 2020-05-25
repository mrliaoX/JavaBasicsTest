package com.study.math;

public class MathTest1 {
	/* public static int abs(int a) 求绝对值
	   public static double ceil(double a) 向上取整数
	   public static double floor(double a) 向下取整数
	   public static int max(int a,int b) 取两数中最大值
	   public static double pow(double a,double b) //指数函数 a的b次方
	   public static double random() 生成0到1之间的小数
	   public static int round(float a) 四舍五入
	   public static double sqrt(double a) 平方返回double值
	   */
	public static void main(String[] args) {
		System.out.println(Math.PI);//Π 3.141592653589793
		System.out.println(Math.abs(-10.0)); //绝对值
		
		System.out.println("");
		
		System.out.println(Math.ceil(11.99));//向上取整数
		System.out.println(Math.ceil(11.1));
		System.out.println(Math.floor(11.9));//向下取整数
		System.out.println(Math.floor(11.2));
		
		System.out.println("");
		
		System.out.println(Math.max(12, 10));//取两数中最大值
		System.out.println(Math.max(10, 12));
		System.out.println(Math.min(11, 9));//取两数中最小值
		System.out.println(Math.min(9, 11));
		
		System.out.println("");
		
		System.out.println(Math.pow(2, 4));//指数函数2的4次方，返回的是double值
		
		System.out.println("");
		
		System.out.println(Math.random());//生成0到1之间的小数
		
		System.out.println(Math.round(11.5));//四舍五入
		System.out.println(Math.round(11.2));
		
		System.out.println(Math.sqrt(9));//开平方返回double值
 
	}

}
