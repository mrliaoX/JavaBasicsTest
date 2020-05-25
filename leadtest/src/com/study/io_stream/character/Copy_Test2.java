package com.study.io_stream.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_Test2 {
/*带缓冲的字符流
  BufferedReader的read()方法读取字符时会一次读取若干字符到缓冲区, 然后逐个返回给程序, 
  降低读取文件的次数, 提高效率
  BufferedWriter的write()方法写出字符时会先写到缓冲区, 缓冲区写满时才会写到文件, 降低写文件的次数,
  提高效率
	  */
	public static void main(String[] args) throws IOException {
		demo1();

	}
//  缓存区拷贝方法，和字节流类似
	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("syz.txt"));//创建缓冲区修饰读字符流对象关联syz.txt文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy2.txt"));//创建缓冲区修饰写字符流对象关联copy2.txt文件
		int len;
		//定义小数组copy
		char[] arr = new char[1024];
		while ((len = br.read(arr))!= -1) {  //read会先把缓冲区读满，然后在一个个返回给临时变量
			bw.write(arr, 0, len);//write是先把数据写到数组写满在一块写出去
			
		}
		br.close();
		bw.close();
	}

}
