package com.study.io_stream.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffere_Test1 {
	/*(readLine()��newLine()����)	
	* BufferedReader��readLine()�������Զ�ȡһ���ַ�(���������з���)
	* BufferedWriter��newLine()�������һ����ƽ̨�Ļ��з���"\r\n"*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("bbb.txt"));
		String line;
		while ((line = br.readLine())!= null) {
			bw.write(line);
//			bw.write("\r\n");//ֻ֧��windowϵͳ
			bw.newLine();//��ƽ̨��
		}
		br.close();
		bw.close();

	}

}
