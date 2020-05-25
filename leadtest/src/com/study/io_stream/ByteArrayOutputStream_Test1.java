package com.study.io_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayOutputStream_Test1 {
/*	ʲô���ڴ������
	* ��������������ڴ���д����, ���ڴ浱��һ��������, д��֮�����һ���Ի�ȡ����������
* 2.ʹ�÷�ʽ
	* ��������: new ByteArrayOutputStream()
	* д������: write(int), write(byte[])
	* ��ȡ����: toByteArray()*/
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i;
		while ((i = fis.read())!= -1) {
			baos.write(i);
		}
		byte[] arr = baos.toByteArray();//�������������ݴ洢��������
		System.out.println(new String(arr));//������������Ե��ǵ�һ�ֱȽ�����Ϊ����ָ���������
//		System.out.println(baos.toString()); //�ڶ���ֻ������ַ�������
		baos.close();
		fis.close();

	}

}
