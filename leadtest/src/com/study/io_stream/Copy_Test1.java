package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//拷贝图片
public class Copy_Test1 {
	/** FileInputStream读取
	* FileOutputStream写出
	 * @throws IOException */
    public static void main(String[] args) throws IOException {
    	demo1();
    	demo2();
    	
	}
    //方法二：创建一个和文件大小一样的数组，从硬盘读取文件到内存中的数组，在写到copy1.jpg上
    //不推荐，因为有可能会内存溢出 
	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("111.jpg");//创建输入流对象管理图片
    	FileOutputStream fos = new FileOutputStream("copy1.jpg");//创建输出流对象关联图片
    	byte[] arr = new byte[fis.available()];//创建一个和文件大小一样的数组
    	fis.read(arr);                             //将文件的字节读取到数组上
    	fos.write(arr);                            //将数组中文件字节写出
    	fis.close();
    	fos.close();
	}
    //方法一：将图片一个字节一个字节读出在写入copy.jpg
	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("111.jpg");//创建输入流对象管理图片
    	FileOutputStream fos = new FileOutputStream("copy.jpg");//创建输出流对象关联图片
    	int i;
    	while ((i=fis.read())!= -1) {   //一个字节一个字节读取
			fos.write(i);                //一个字节一个字节写出
		}
    	fis.close();
    	fos.close();
	}
}
