package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Test2 {
/*	* write(byte[] b)
	* write(byte[] b, int off, int len)写出有效的字节个数*/
	public static void main(String[] args) throws IOException {
		demo1();
		FileInputStream fis = new FileInputStream("111.jpg");//创建输入流对象管理图片
		FileOutputStream fos = new FileOutputStream("copy2.jpg");//创建输出流对象关联图片
		int len;
		byte[] arr = new byte[1024*2];//一般定义小数组用1024的倍数
		while ((len = fis.read(arr)) != -1) {//判读是否读结束，判断每次数组中的字节是否是最后
			fos.write(arr,0,len);//从0的位置开始写，每次写长度在字节数>数组长度情况下按照数组长度来写。
		                         //字节数<数组长度按照字节数长度来写		                       
		}
		fis.close();
		fos.close();
		
	}
    //方法3，定义小数组
	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");//创建输入流对象管理图片
		FileOutputStream fos = new FileOutputStream("copy.txt");//创建输出流对象关联图片
		int len;
		byte[] arr = new byte[8];
		while ((len = fis.read(arr)) != -1) {//判读是否读结束，判断每次数组中的字节是否是最后
			fos.write(arr,0,len);//从0的位置开始写，每次写长度在字节数>数组长度情况下按照数组长度来写。
		                         //字节数<数组长度按照字节数长度来写		                       
		}
		fis.close();
		fos.close();
    }

}
