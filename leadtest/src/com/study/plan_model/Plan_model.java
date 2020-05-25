package com.study.plan_model;

public class Plan_model {
//单例的设计模式   思想把方法抽象出来然后通过子类方法实现
//	例如实现一个 计算一个程序运行的时间 的需求
	public static void main(String[] args) {
		Demo d = new Demo();//创建demo对象通过demo调用父类方法
		System.out.println(d.getTime());

	}

}
//抽取一个抽象类，该类是实现计算时间的类
abstract class GetTime{
	//一个计算时间的方法
	public final long getTime() {
		//currentTimeMillis是记录程序运行时的那一刻的时间
		long start = System.currentTimeMillis();//记录开始时的时间
		code();
		long end = System.currentTimeMillis();//记录结束时的时间
		return end - start;
	}
	public abstract void code();

}
//将运行的程序抽取成一个类，这样只需要改这个类就可以实现计算不同的程序运行时间
class Demo extends GetTime{
	
	public void code() {
		int i = 0;
		while (i<10000) {
			System.out.println("a");
			i++;
		}
	}
}