package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Test3 {
/*	FileOutputStream׷��
	������ʾ
	  FileOutputStream�Ĺ��췽��д���������ʵ�����ݵ�׷��д��*/
	public static void main(String[] args) throws IOException {
		 FileOutputStream fos = new  FileOutputStream("aaa.txt",true);//���ļ������һ��true�ķ����Ϳ�����׷�ӹ���
//		 fos.write(65);
//		 fos.write(66);
//		 fos.write(67);
		 fos.write(68);
		 fos.close();

	}

}
