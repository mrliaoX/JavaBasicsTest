package com.study.io_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayOutputStream_Test1 {
/*	什么是内存输出流
	* 该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
* 2.使用方式
	* 创建对象: new ByteArrayOutputStream()
	* 写出数据: write(int), write(byte[])
	* 获取数据: toByteArray()*/
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i;
		while ((i = fis.read())!= -1) {
			baos.write(i);
		}
		byte[] arr = baos.toByteArray();//将缓冲区的内容存储在数组种
		System.out.println(new String(arr));//两种输出都可以但是第一种比较灵活，因为可以指定输出类型
//		System.out.println(baos.toString()); //第二种只能输出字符串类型
		baos.close();
		fis.close();

	}

}
