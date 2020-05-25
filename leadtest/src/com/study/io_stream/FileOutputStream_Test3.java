package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Test3 {
/*	FileOutputStream追加
	案例演示
	  FileOutputStream的构造方法写出数据如何实现数据的追加写入*/
	public static void main(String[] args) throws IOException {
		 FileOutputStream fos = new  FileOutputStream("aaa.txt",true);//在文件后面加一个true的方法就可以用追加功能
//		 fos.write(65);
//		 fos.write(66);
//		 fos.write(67);
		 fos.write(68);
		 fos.close();

	}

}
