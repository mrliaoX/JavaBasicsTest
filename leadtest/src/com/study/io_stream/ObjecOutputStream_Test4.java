package com.study.io_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjecOutputStream_Test4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		在Test3中优化后 读取到的是一个集合对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"));
		@SuppressWarnings("unchecked")
		ArrayList<Person> list = (ArrayList<Person>)ois.readObject();	//泛型在运行期会被擦除,索引运行期相当于没有泛型		
        for (Person person : list) {
			System.out.println(person);
		}
        ois.close();

	}

}
