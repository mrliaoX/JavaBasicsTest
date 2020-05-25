package com.study.reflect.ref_test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reflect_test2 {
	//�÷���ʵ�����֭

	public static void main(String[] args) throws Exception {
		Juicer j = new Juicer();
//		�����ļ�����ֱ����Class.forName��ȡ,���Ե���BufferedReader���������ļ��е���Ϣ����forname
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		//��ȡ�����ļ��е���Ϣ
		Class clazz = Class.forName(br.readLine());
		//����Ϣ���߳ɶ�����Ϊ��ɶ����ʱ�������Զ�����Ϊobject����������Ҫ����ת��
		Fruit f = (Fruit) clazz.newInstance();
		//����
		j.run(f);
		
	}
	

}

interface Fruit{
	public void squeeze();
}
class Apple implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("եƻ��֭��");
		
	}
	
}
class Orange implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("ե����֭��");
		
	}
	
}
class Juicer{
	
	public void run(Fruit f) {
		f.squeeze();
	}
}