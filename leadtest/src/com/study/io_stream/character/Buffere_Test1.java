package com.study.io_stream.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffere_Test1 {
	/*(readLine()和newLine()方法)	
	* BufferedReader的readLine()方法可以读取一行字符(不包含换行符号)
	* BufferedWriter的newLine()可以输出一个跨平台的换行符号"\r\n"*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("bbb.txt"));
		String line;
		while ((line = br.readLine())!= null) {
			bw.write(line);
//			bw.write("\r\n");//只支持window系统
			bw.newLine();//跨平台的
		}
		br.close();
		bw.close();

	}

}
