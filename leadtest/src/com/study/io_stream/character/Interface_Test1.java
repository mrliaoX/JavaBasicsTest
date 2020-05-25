package com.study.io_stream.character;

public class Interface_Test1 {
/*	装饰设计模式的好处是:
		 * 耦合性不强,被装饰的类的变化与装饰类的变化无关*/
	public static void main(String[] args) {
		Edstudent e = new Edstudent(new Student());
		e.code();

	}

}
interface Coder{
	public void code();
}
class Student implements Coder{

	@Override
	public void code() {
		System.out.println("javaSE");
		System.out.println("MySql");
		System.out.println("数据结构与算法");
		
	}
	
}
class Edstudent implements Coder{
	//1,获取被装饰类的引用
	private Student s;
	//2,在构造方法中传入被装饰类的对象
	public Edstudent(Student s) {
		this.s = s;
	}
	@Override
	public void code() {
		s.code();
		System.out.println("SSH");
		System.out.println("Spring");
		System.out.println("数据库");
		System.out.println("分布式");
		
	}
	
}
