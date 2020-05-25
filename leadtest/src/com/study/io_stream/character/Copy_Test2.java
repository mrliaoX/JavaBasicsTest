package com.study.io_stream.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_Test2 {
/*��������ַ���
  BufferedReader��read()������ȡ�ַ�ʱ��һ�ζ�ȡ�����ַ���������, Ȼ��������ظ�����, 
  ���Ͷ�ȡ�ļ��Ĵ���, ���Ч��
  BufferedWriter��write()����д���ַ�ʱ����д��������, ������д��ʱ�Ż�д���ļ�, ����д�ļ��Ĵ���,
  ���Ч��
	  */
	public static void main(String[] args) throws IOException {
		demo1();

	}
//  �������������������ֽ�������
	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("syz.txt"));//�������������ζ��ַ����������syz.txt�ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("copy2.txt"));//��������������д�ַ����������copy2.txt�ļ�
		int len;
		//����С����copy
		char[] arr = new char[1024];
		while ((len = br.read(arr))!= -1) {  //read���Ȱѻ�����������Ȼ����һ�������ظ���ʱ����
			bw.write(arr, 0, len);//write���Ȱ�����д������д����һ��д��ȥ
			
		}
		br.close();
		bw.close();
	}

}
