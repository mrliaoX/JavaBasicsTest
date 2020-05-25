package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjecOutputStream_Test1 {
/*	 1.什么是对象操作流
		* 该流可以将一个对象写出, 或者读取一个对象到程序中. 也就是执行了序列化和反序列化的操作.
	* 2.使用方式
		* 写出: new ObjectOutputStream(OutputStream), writeObject()*/
	public static void main(String[] args) throws IOException {
	   /*写入e.txt，去查看e.txt的时候会发现乱码，这是因为码表不同的原因，不需要改
	    * 因为序列化只需要存入就行，就相当于游戏的存档，到时候反序列化就可以得到内容*/
		//将对象写入：序列化
		Person p1 = new Person("小葵",1);
		Person p2 = new Person("小新",5);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));//创建对象输出流
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();

	}

}
