package com.study.io_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayOutputStream_Case1 {
//	����һ���ļ�������,����read(byte[] b)����,��a.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
	public static void main(String[] args) throws IOException {
	    FileInputStream fis = new FileInputStream("a.txt");        //�����ֽ�������,����a.txt
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();  //�����ڴ������
	    byte[] arr = new byte[5];                                   //�����ֽ�����,��СΪ5
	    int i;
	    while ((i = fis.read(arr))!= -1) {//���ļ��ϵ����ݶ����ֽ�������
			baos.write(arr,0,i);//���ֽ����������д���ڴ滺������
		}
	    System.out.println(baos);//���ڴ滺����������ת��Ϊ�ַ�����ӡ
	    fis.close();

	}

}
