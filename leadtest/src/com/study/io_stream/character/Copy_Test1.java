package com.study.io_stream.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_Test1 {
//	字符流的拷贝
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();

	}
	private static void demo2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("copy.txt");
		int len;
		char[] arr = new char[1024];
		while ((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		fr.close();
		fw.close();
	}
    //单个字节拷贝纯文本文件
	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("aaa.txt");//创建读字符流对象，关联aaa.txt
		FileWriter fw = new FileWriter("copy1.txt");//创建写字符流对象
		int i;
		while ((i = fr.read()) != -1) {
			fw.write(i);
		}
		fr.close();
		fw.close();/*Writer类中有一个2k的小缓冲区,如果不关流,就会将内容写到缓冲区里,
		 			关流会将缓冲区内容刷新,再关闭//Writer类中有一个2k的小缓冲区,
		 			如果不关流,就会将内容写到缓冲区里,关流会将缓冲区内容刷新,再关闭*/
	}

}
