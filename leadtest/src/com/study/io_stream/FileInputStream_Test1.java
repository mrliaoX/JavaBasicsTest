package com.study.io_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_Test1 {
//	read()һ�ζ�ȡһ���ֽ� 
	public static void main(String[] args) throws IOException {
	    FileInputStream fis = new FileInputStream("abc.txt");//�������������󣬹���abc�ļ�
	    int i;
	    while((i = fis.read())!=-1) {//������ȡ�ļ��е���Ϣ
	    	System.out.println(i);
	    }
	    fis.close();

	}

}
