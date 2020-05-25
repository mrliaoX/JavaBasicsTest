package com.study.reflect.ref_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

public class Reflect_test4 {
	/**
	 * * 已知一个类，定义如下： 
	 * package cn.itcast.heima;
	 * 		public class DemoClass {
				public void run() {
					System.out.println("welcome to heima!");
				}
			}
	 * (1) 写一个Properties格式的配置文件，配置类的完整名称。 
	 * (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法。
	 * @throws FileNotFoundException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		配置文件不能直接用Class.forName读取,所以得用BufferedReader读出配置文件中的信息传给forname
		BufferedReader br = new BufferedReader(new FileReader("demo.properties"));
		Class clazz = Class.forName(br.readLine());//从buffere中获取到字节码对象
		
	    DemoClass dc = (DemoClass) clazz.newInstance();//通过字节码对象创建新的对象
		dc.run();

	}

}
