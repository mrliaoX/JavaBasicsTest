package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjecOutputStream_Test3 {
//对象操作流优化:写入时一个一个写太慢，所以用一个集合接收所以要写的数据，
//	然后用ObjectOutputStream一次性写入
	public static void main(String[] args) throws IOException {

		Person p1 = new Person("张三", 23);
		Person p2 = new Person("李四", 24);
		Person p3 = new Person("马哥", 18);
		Person p4 = new Person("辉哥", 20);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
		oos.writeObject(list);									//写出集合对象
		
		oos.close();

	}

}
