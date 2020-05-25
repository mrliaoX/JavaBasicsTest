package com.study.thread.morethread;
/*单例设计模式：保证类在内存中只有一个对象。

  如何保证类在内存中只有一个对象呢？
	  (1)控制类的创建，不让其他类来创建本类的对象。private
	  (2)在本类中定义一个本类的对象。Singleton s;
	  (3)提供公共的访问方式。  public static Singleton getInstance(){return s}*/
public class Singleton_Test1 {
/*饿汉式和懒汉式的区别
	 1,饿汉式是空间换时间,懒汉式是时间换空间
	 2,在多线程访问时,饿汉式不会创建多个对象,而懒汉式有可能会创建多个对象*/

	public static void main(String[] args) {
		Singlenton s1 = Singlenton.getInstance();
		Singlenton s2 = Singlenton.getInstance();
		System.out.println(s1 == s2);
		
		
		Singlenton1 s3 = Singlenton1.getInstance();
		Singlenton1 s4 = Singlenton1.getInstance();
		System.out.println(s3 == s4);
		
//		System.out.println(s1 == s4);  两个对象的类型不一样不能比较

	}

}
//饿汉式
class Singlenton{
//1,私有构造方法,其他类不能访问该构造方法了
	private Singlenton() {
		super();
	}
	//创建本类的对象
	private static Singlenton s = new Singlenton(); 
	//对外提供一个公共访问方法
	public static Singlenton getInstance() {
		return s; 
		
	}
	
}
//懒汉式
class Singlenton1{
	//1,私有构造方法,其他类不能访问该构造方法了
	private Singlenton1() {
		super();
	}
	//声明一个引用
	private static Singlenton1 s;
	//对外提供一个访问方法
	public static Singlenton1 getInstance() {
		if(s == null) {//判断s是否为空，为空就创建本类对象
			s = new Singlenton1(); 
		}
		return s;
	}
	 
}
