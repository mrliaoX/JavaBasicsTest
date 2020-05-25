package com.study.reflect.ref_test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reflect_test2 {
	//用反射实现这果汁

	public static void main(String[] args) throws Exception {
		Juicer j = new Juicer();
//		配置文件不能直接用Class.forName读取,所以得用BufferedReader读出配置文件中的信息传给forname
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		//读取配置文件中的信息
		Class clazz = Class.forName(br.readLine());
		//将信息抽线成对象，因为变成对象的时候类型自动提升为object对象所以需要向下转型
		Fruit f = (Fruit) clazz.newInstance();
		//运行
		j.run(f);
		
	}
	

}

interface Fruit{
	public void squeeze();
}
class Apple implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("榨苹果汁儿");
		
	}
	
}
class Orange implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("榨橘子汁儿");
		
	}
	
}
class Juicer{
	
	public void run(Fruit f) {
		f.squeeze();
	}
}