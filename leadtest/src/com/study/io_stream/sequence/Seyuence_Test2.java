package com.study.io_stream.sequence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Seyuence_Test2 {
//	���������϶��,����������ϵ�������
	/*��������abcd�ļ������ݴ���e
	Ҫ�õ�vector ��enumeration*/
	public static void main(String[] args) throws IOException {
		/*File file = new File("e.txt");
		System.out.println(file.createNewFile());*/
		FileInputStream fis1 = new FileInputStream("a.txt");	//��������������,����a.txt
		FileInputStream fis2 = new FileInputStream("b.txt");	//��������������,����b.txt
		FileInputStream fis3 = new FileInputStream("c.txt");  //��������������,����c.txt
		FileInputStream fis4 = new FileInputStream("d.txt");  //��������������,����c.txt
		Vector<InputStream> v = new Vector<>();  //����vector���϶���
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		Enumeration<InputStream> e = v.elements();//��ȡ÷������
		SequenceInputStream sis = new SequenceInputStream(e);//���ݸ�SequenceInputStream����
		FileOutputStream fos = new FileOutputStream("e.txt");//�������������,����e.txt
		int i;
		while ((i = sis.read())!= -1) {
			fos.write(i);
		}
		sis.close();
		fos.close();

	}

}
