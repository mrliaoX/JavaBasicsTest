package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Test2 {
//	write()一次写出一个字节
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("syz.txt");
		fos.write(65);//每次写一个字节，而且如果要添加元素，原来的元素会被清除掉
		fos.write(66);
		fos.write(67);
		fos.close();

	}

}
