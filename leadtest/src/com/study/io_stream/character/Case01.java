package com.study.io_stream.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Case01 {
//	* 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
	/*分析：创建读，写字符流对象，用buffere修饰
	      创建一个集合存储读出的字符，
	      倒着遍历集合，写入文档
	      关闭流
	  注：为什么要把创建输出，输入流对象分开，因为最好是用流对象的时候才创建用完就马上关。
	      */
	public static void main(String[] args) throws IOException {
		//1,创建输出流对象关联abc.txt
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		//2,创建集合对象存储输出的字符
		ArrayList<String> list = new ArrayList<>();
		String line;
		while ((line = br.readLine())!= null) {//按照行字符读取到集合
		    list.add(line);	
		}
		br.close();//关闭输出流
		//3，创建输入流对象关联reabc.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("reabc.txt"));
		//4，倒着遍历集合将集合字符按照行的形式写入文档
		for (int i=list.size()-1;i>=0;i-- ) {
		    bw.write(list.get(i));
		    bw.newLine();
		}
		//关闭输入字符流
		bw.close();

	}

}
