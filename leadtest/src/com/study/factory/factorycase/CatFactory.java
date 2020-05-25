package com.study.factory.factorycase;

public class CatFactory implements Factory{

	@Override
	public Animal createAnimal() {
		
		return new Cat();
	}

}
