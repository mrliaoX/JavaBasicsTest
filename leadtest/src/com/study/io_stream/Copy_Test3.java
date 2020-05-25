package com.study.io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Test3 {
//	BufferedInputStream
//	BufferOutputStream拷贝
	public static void main(String[] args) throws IOException {
		//方法4 通过BufferedInputStream,BufferedOutputStream修饰fis fos 相当于在内存中给fis，fos开出两个空间让字节在内存中读写
        //因为是在内存中所以开
		FileInputStream fis = new FileInputStream("111.jpg");  //创建输入流对象关联文件111.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");//创建输出流对象关联文件copy.jpy
		BufferedInputStream bis = new BufferedInputStream(fis);//创建缓冲区修饰fis
		BufferedOutputStream bos = new BufferedOutputStream(fos);//创建缓冲区修饰fos
		
		int i ;
		while ((i = bis.read()) != -1) {//读取111.jpg的字节
			bos.write(i);                //写入字节
		}
		bis.close();//关闭流
		bos.close();

	}

}
