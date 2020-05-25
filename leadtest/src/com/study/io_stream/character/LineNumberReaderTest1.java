package com.study.io_stream.character;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest1 {
/*	* LineNumberReader是BufferedReader的子类, 具有相同的功能, 并且可以统计行号
	* 调用getLineNumber()方法可以获取当前行号
	* 调用setLineNumber()方法可以设置当前行号*/
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("abc.txt"));
		String line;
		lnr.setLineNumber(100);									//设置行号
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);//获取行号
		}
		
		lnr.close(); 

	}

}
