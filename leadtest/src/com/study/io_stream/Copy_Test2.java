package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Test2 {
/*	* write(byte[] b)
	* write(byte[] b, int off, int len)д����Ч���ֽڸ���*/
	public static void main(String[] args) throws IOException {
		demo1();
		FileInputStream fis = new FileInputStream("111.jpg");//�����������������ͼƬ
		FileOutputStream fos = new FileOutputStream("copy2.jpg");//����������������ͼƬ
		int len;
		byte[] arr = new byte[1024*2];//һ�㶨��С������1024�ı���
		while ((len = fis.read(arr)) != -1) {//�ж��Ƿ���������ж�ÿ�������е��ֽ��Ƿ������
			fos.write(arr,0,len);//��0��λ�ÿ�ʼд��ÿ��д�������ֽ���>���鳤������°������鳤����д��
		                         //�ֽ���<���鳤�Ȱ����ֽ���������д		                       
		}
		fis.close();
		fos.close();
		
	}
    //����3������С����
	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("aaa.txt");//�����������������ͼƬ
		FileOutputStream fos = new FileOutputStream("copy.txt");//����������������ͼƬ
		int len;
		byte[] arr = new byte[8];
		while ((len = fis.read(arr)) != -1) {//�ж��Ƿ���������ж�ÿ�������е��ֽ��Ƿ������
			fos.write(arr,0,len);//��0��λ�ÿ�ʼд��ÿ��д�������ֽ���>���鳤������°������鳤����д��
		                         //�ֽ���<���鳤�Ȱ����ֽ���������д		                       
		}
		fis.close();
		fos.close();
    }

}
