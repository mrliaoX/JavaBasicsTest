package com.study.io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Test3 {
//	BufferedInputStream
//	BufferOutputStream����
	public static void main(String[] args) throws IOException {
		//����4 ͨ��BufferedInputStream,BufferedOutputStream����fis fos �൱�����ڴ��и�fis��fos���������ռ����ֽ����ڴ��ж�д
        //��Ϊ�����ڴ������Կ�
		FileInputStream fis = new FileInputStream("111.jpg");  //������������������ļ�111.jpg
		FileOutputStream fos = new FileOutputStream("copy.jpg");//�����������������ļ�copy.jpy
		BufferedInputStream bis = new BufferedInputStream(fis);//��������������fis
		BufferedOutputStream bos = new BufferedOutputStream(fos);//��������������fos
		
		int i ;
		while ((i = bis.read()) != -1) {//��ȡ111.jpg���ֽ�
			bos.write(i);                //д���ֽ�
		}
		bis.close();//�ر���
		bos.close();

	}

}
