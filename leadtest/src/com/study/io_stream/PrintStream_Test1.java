package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStream_Test1 {
	/*什么是打印流
	* 该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
	* System.out就是一个PrintStream, 其默认向控制台输出信息
	* 使用方式
	* 打印: print(), println()
	* 自动刷出: PrintWriter(OutputStream out, boolean autoFlush, String encoding) 
	* 打印流只操作数据目的*/
	public static void main(String[] args) throws IOException {
		demo1();

		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"), true);
		pw.println(65);
		pw.println("你好");	//自动刷出,只针对的是println方法
		pw.print("大家好");
		pw.close();
							

	}

	private static void demo1() {
		PrintStream ps = System.out;
		ps.println(65);
		ps.println("A");
		ps.println(new Person("张三", 23));
		Person p = null;
		ps.println(p);					//如果是null,就返回null,如果不是null,就调用对象的toString()
	}

}
