package com.study.math;

public class MathTest1 {
	/* public static int abs(int a) �����ֵ
	   public static double ceil(double a) ����ȡ����
	   public static double floor(double a) ����ȡ����
	   public static int max(int a,int b) ȡ���������ֵ
	   public static double pow(double a,double b) //ָ������ a��b�η�
	   public static double random() ����0��1֮���С��
	   public static int round(float a) ��������
	   public static double sqrt(double a) ƽ������doubleֵ
	   */
	public static void main(String[] args) {
		System.out.println(Math.PI);//�� 3.141592653589793
		System.out.println(Math.abs(-10.0)); //����ֵ
		
		System.out.println("");
		
		System.out.println(Math.ceil(11.99));//����ȡ����
		System.out.println(Math.ceil(11.1));
		System.out.println(Math.floor(11.9));//����ȡ����
		System.out.println(Math.floor(11.2));
		
		System.out.println("");
		
		System.out.println(Math.max(12, 10));//ȡ���������ֵ
		System.out.println(Math.max(10, 12));
		System.out.println(Math.min(11, 9));//ȡ��������Сֵ
		System.out.println(Math.min(9, 11));
		
		System.out.println("");
		
		System.out.println(Math.pow(2, 4));//ָ������2��4�η������ص���doubleֵ
		
		System.out.println("");
		
		System.out.println(Math.random());//����0��1֮���С��
		
		System.out.println(Math.round(11.5));//��������
		System.out.println(Math.round(11.2));
		
		System.out.println(Math.sqrt(9));//��ƽ������doubleֵ
 
	}

}
