package com.study.io_stream.sequence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sequence_Test1 {
	/*������
	* ���������԰Ѷ���ֽ����������ϳ�һ��, ���������ж�ȡ����ʱ, 
	���ӱ����ϵĵ�һ������ʼ��, ����һ��֮��������ڶ���, �Դ�����.*/
//    ��������a�ļ�b�ļ������ݴ���c�ļ���
	@SuppressWarnings("resource")//����fis2�ľ���
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");//���������ֽ����������a.txt
		FileInputStream fis2 = new FileInputStream("b.txt");//���������ֽ����������a.txt
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);//���������������ϵ����� ������
		FileOutputStream fos = new FileOutputStream("c.txt");//����������������c.txt
		int i;
		while ((i = sis.read()) != -1) {//���������е����ݰ���˳�����
			fos.write(i);                //д��c.txt
		}
		sis.close();//�ر�������ΪSequence��ʵ���˶��ڰ������������Ĺر����ķ���
		fos.close();

	}

}
