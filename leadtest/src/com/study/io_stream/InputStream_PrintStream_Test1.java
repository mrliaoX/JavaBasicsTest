package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class InputStream_PrintStream_Test1 {
/*	* 1.什么是标准输入输出流(掌握)
	* System.in是InputStream, 标准输入流, 默认可以从键盘输入读取字节数据
	* System.out是PrintStream, 标准输出流, 默认可以向Console中输出字符和字节数据
      2.修改标准输入输出流(了解)
	* 修改输入流: System.setIn(InputStream)
	* 修改输出流: System.setOut(PrintStream)*/
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();
	}
	//通过标准输入输出流实现图片拷贝  （开发不推荐使用）
	private static void demo2() throws FileNotFoundException, IOException {
		System.setIn(new FileInputStream("111.jpg"));		//改变标准输入流
		System.setOut(new PrintStream("copy.jpg")); 		//改变标准输出流
		
		InputStream is = System.in;							//获取标准输入流
		PrintStream ps = System.out;						//获取标准输出流
		
		int len;
		byte[] arr = new byte[1024 * 1];
		
		while((len = is.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		is.close();
		ps.close();
	}
//通过标准输入输出流实现将a文档内容写道b文档（开发不推荐使用）
	private static void demo1() throws FileNotFoundException, IOException {
		System.setIn(new FileInputStream("a.txt"));				//修改标准输入流
		System.setOut(new PrintStream("b.txt"));				//修改标准输出流
		
		InputStream in = System.in;								//获取标准输入流
		PrintStream ps = System.out;							//获取标准输出流
		int b;
		while((b = in.read()) != -1) {							//从a.txt上读取数据
			ps.write(b);										//将数据写到b.txt上
		}
		
		in.close();
		ps.close();
	}

}
