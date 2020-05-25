package com.study.io_stream.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Properties_Test1 {
	 /* A:Properties的概述
	  Properties 类表示了一个持久的属性集 例如person类种的属性。
	  Properties 可保存在流中或从流中加载。
	  属性列表中每个键及其对应值都是一个字符串。 
      B:案例演示
	  Properties作为Map集合的使用*/
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));//输入  config.properties为配置文件
		prop.setProperty("tel", "12345678900");//设置
		prop.store(new FileOutputStream("config.properties"), null);//输出
		System.out.println(prop);

	}
	//设置properties集种的数据
	@SuppressWarnings("unchecked")
	private static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "张三");
		prop.setProperty("tel", "18912345678");
		
//		System.out.println(prop);//拿到一条记录里面包含姓名电话
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {  //拿到两条记录分别文姓名和电话
			String key = en.nextElement();				//获取Properties中的每一个键
			String value = prop.getProperty(key);		//根据键获取值
			System.out.println(key + "="+ value);
		}
	}
//    将数据存入properties集
	private static void demo1() {
		Properties p = new Properties();
		p.put("a", 1);
		System.out.println(p);
	}

}
