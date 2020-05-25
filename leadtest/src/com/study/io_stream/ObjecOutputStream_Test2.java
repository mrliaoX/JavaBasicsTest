package com.study.io_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjecOutputStream_Test2 {
//读取对象：反序列化
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		Person p1 = (Person) ois.readObject();//因为用的是Object存入所以类型会自动上市的Object类
//		                                          所以在着需要向下转型
		Person p2 = (Person) ois.readObject();
		System.out.println(p1);
		System.out.println(p2);
		ois.close();

	}

}
