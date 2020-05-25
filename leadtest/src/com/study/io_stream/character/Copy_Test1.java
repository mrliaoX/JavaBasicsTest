package com.study.io_stream.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_Test1 {
//	�ַ����Ŀ���
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();

	}
	private static void demo2() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("copy.txt");
		int len;
		char[] arr = new char[1024];
		while ((len = fr.read(arr)) != -1) {
			fw.write(arr, 0, len);
		}
		fr.close();
		fw.close();
	}
    //�����ֽڿ������ı��ļ�
	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("aaa.txt");//�������ַ������󣬹���aaa.txt
		FileWriter fw = new FileWriter("copy1.txt");//����д�ַ�������
		int i;
		while ((i = fr.read()) != -1) {
			fw.write(i);
		}
		fr.close();
		fw.close();/*Writer������һ��2k��С������,���������,�ͻὫ����д����������,
		 			�����Ὣ����������ˢ��,�ٹر�//Writer������һ��2k��С������,
		 			���������,�ͻὫ����д����������,�����Ὣ����������ˢ��,�ٹر�*/
	}

}
