package com.study.io_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayOutputStream_Case1 {
//	定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
	public static void main(String[] args) throws IOException {
	    FileInputStream fis = new FileInputStream("a.txt");        //创建字节输入流,关联a.txt
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();  //创建内存输出流
	    byte[] arr = new byte[5];                                   //创建字节数组,大小为5
	    int i;
	    while ((i = fis.read(arr))!= -1) {//将文件上的数据读到字节数组中
			baos.write(arr,0,i);//将字节数组的数据写到内存缓冲区中
		}
	    System.out.println(baos);//将内存缓冲区的内容转换为字符串打印
	    fis.close();

	}

}
