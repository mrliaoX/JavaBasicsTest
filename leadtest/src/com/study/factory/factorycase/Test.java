package com.study.factory.factorycase;

public class Test {

	public static void main(String[] args) {
		DogFactory af = new DogFactory();
		Dog d = (Dog) af.createAnimal();
		d.eat();
		CatFactory cf = new CatFactory();
		Cat c = (Cat) cf.createAnimal();
		c.eat();

	}

}
