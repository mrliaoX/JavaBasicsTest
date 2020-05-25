package com.study.io_stream.character;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Tset1 {
//	FileWriter类的write()方法可以自动把字符转为字节写出
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("aaa.txt",true);//true是追加的作用
		fw.write("ABC");
		fw.close();

	}

}
