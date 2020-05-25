package com.study.io_stream.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Case01 {
//	* ��һ���ı��ĵ��ϵ��ı���ת,��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
	/*��������������д�ַ���������buffere����
	      ����һ�����ϴ洢�������ַ���
	      ���ű������ϣ�д���ĵ�
	      �ر���
	  ע��ΪʲôҪ�Ѵ������������������ֿ�����Ϊ��������������ʱ��Ŵ�����������Ϲء�
	      */
	public static void main(String[] args) throws IOException {
		//1,����������������abc.txt
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		//2,�������϶���洢������ַ�
		ArrayList<String> list = new ArrayList<>();
		String line;
		while ((line = br.readLine())!= null) {//�������ַ���ȡ������
		    list.add(line);	
		}
		br.close();//�ر������
		//3�������������������reabc.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("reabc.txt"));
		//4�����ű������Ͻ������ַ������е���ʽд���ĵ�
		for (int i=list.size()-1;i>=0;i-- ) {
		    bw.write(list.get(i));
		    bw.newLine();
		}
		//�ر������ַ���
		bw.close();

	}

}
