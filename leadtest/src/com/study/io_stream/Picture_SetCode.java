package com.study.io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Picture_SetCode {
//通过异或给图片进行加密
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.jpg"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123);
		}
		
		bis.close();
		bos.close();

	}

}
