package com.study.factory;

public class Test1 {
/*A:简单工厂模式概述
	  又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
  B:优点
	  客户端不需要在负责对象的创建，从而明确了各个类的职责
  C:缺点
	  这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护
  D:案例演示
	  动物抽象类：public abstract Animal { public abstract void eat(); }
	  具体狗类：public class Dog extends Animal {}
	  具体猫类：public class Cat extends Animal {}*/

	public static void main(String[] args) {
		/*Cat c = new Cat();
		c.eat();
		c.shleep();*///这种方法太麻烦
		//通过工厂类来调用
		Dog d = (Dog) AnimalFactory.createAnimal("dog");//底层把dog转化为object类型所以要向下转型
		d.eat();
		d.shleep();
		Cat c = (Cat) AnimalFactory.createAnimal("cat");
		c.eat();
		c.shleep();
	}

}
