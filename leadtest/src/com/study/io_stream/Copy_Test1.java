package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//����ͼƬ
public class Copy_Test1 {
	/** FileInputStream��ȡ
	* FileOutputStreamд��
	 * @throws IOException */
    public static void main(String[] args) throws IOException {
    	demo1();
    	demo2();
    	
	}
    //������������һ�����ļ���Сһ�������飬��Ӳ�̶�ȡ�ļ����ڴ��е����飬��д��copy1.jpg��
    //���Ƽ�����Ϊ�п��ܻ��ڴ���� 
	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("111.jpg");//�����������������ͼƬ
    	FileOutputStream fos = new FileOutputStream("copy1.jpg");//����������������ͼƬ
    	byte[] arr = new byte[fis.available()];//����һ�����ļ���Сһ��������
    	fis.read(arr);                             //���ļ����ֽڶ�ȡ��������
    	fos.write(arr);                            //���������ļ��ֽ�д��
    	fis.close();
    	fos.close();
	}
    //����һ����ͼƬһ���ֽ�һ���ֽڶ�����д��copy.jpg
	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("111.jpg");//�����������������ͼƬ
    	FileOutputStream fos = new FileOutputStream("copy.jpg");//����������������ͼƬ
    	int i;
    	while ((i=fis.read())!= -1) {   //һ���ֽ�һ���ֽڶ�ȡ
			fos.write(i);                //һ���ֽ�һ���ֽ�д��
		}
    	fis.close();
    	fos.close();
	}
}
