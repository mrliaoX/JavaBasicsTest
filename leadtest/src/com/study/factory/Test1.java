package com.study.factory;

public class Test1 {
/*A:�򵥹���ģʽ����
	  �ֽо�̬��������ģʽ��������һ������Ĺ����ฺ�𴴽�һЩ���ʵ��
  B:�ŵ�
	  �ͻ��˲���Ҫ�ڸ������Ĵ������Ӷ���ȷ�˸������ְ��
  C:ȱ��
	  �����̬�����ฺ�����ж���Ĵ�����������µĶ������ӣ�����ĳЩ����Ĵ�����ʽ��ͬ������Ҫ���ϵ��޸Ĺ����࣬�����ں��ڵ�ά��
  D:������ʾ
	  ��������ࣺpublic abstract Animal { public abstract void eat(); }
	  ���幷�ࣺpublic class Dog extends Animal {}
	  ����è�ࣺpublic class Cat extends Animal {}*/

	public static void main(String[] args) {
		/*Cat c = new Cat();
		c.eat();
		c.shleep();*///���ַ���̫�鷳
		//ͨ��������������
		Dog d = (Dog) AnimalFactory.createAnimal("dog");//�ײ��dogת��Ϊobject��������Ҫ����ת��
		d.eat();
		d.shleep();
		Cat c = (Cat) AnimalFactory.createAnimal("cat");
		c.eat();
		c.shleep();
	}

}
