package com.study.io_stream.character;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Test1 {
//	 FileReader���read()�������԰����ַ���С��ȡ
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("aaa.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.println((char)i);//��ȡ����aaa.txt��Ԫ�ض�Ӧ��GBK��ֵ����int���գ�
			                              //Ҫ��ת�����ַ��͵�ǿ������ת����ת��char����
		}
		fr.close();
		
	}

}
