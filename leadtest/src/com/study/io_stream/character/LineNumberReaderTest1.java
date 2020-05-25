package com.study.io_stream.character;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest1 {
/*	* LineNumberReader��BufferedReader������, ������ͬ�Ĺ���, ���ҿ���ͳ���к�
	* ����getLineNumber()�������Ի�ȡ��ǰ�к�
	* ����setLineNumber()�����������õ�ǰ�к�*/
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("abc.txt"));
		String line;
		lnr.setLineNumber(100);									//�����к�
		while((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);//��ȡ�к�
		}
		
		lnr.close(); 

	}

}
