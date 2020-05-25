package com.study.io_stream.character;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Test1 {
//	 FileReader类的read()方法可以按照字符大小读取
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("aaa.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.println((char)i);//读取的是aaa.txt中元素对应的GBK码值，用int接收，
			                              //要想转换成字符就得强制类型转换，转成char类型
		}
		fr.close();
		
	}

}
