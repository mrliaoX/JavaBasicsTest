package com.study.io_stream.character;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Tset1 {
//	FileWriter���write()���������Զ����ַ�תΪ�ֽ�д��
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("aaa.txt",true);//true��׷�ӵ�����
		fw.write("ABC");
		fw.close();

	}

}
