package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class InputStream_PrintStream_Test1 {
/*	* 1.ʲô�Ǳ�׼���������(����)
	* System.in��InputStream, ��׼������, Ĭ�Ͽ��ԴӼ��������ȡ�ֽ�����
	* System.out��PrintStream, ��׼�����, Ĭ�Ͽ�����Console������ַ����ֽ�����
      2.�޸ı�׼���������(�˽�)
	* �޸�������: System.setIn(InputStream)
	* �޸������: System.setOut(PrintStream)*/
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();
	}
	//ͨ����׼���������ʵ��ͼƬ����  ���������Ƽ�ʹ�ã�
	private static void demo2() throws FileNotFoundException, IOException {
		System.setIn(new FileInputStream("111.jpg"));		//�ı��׼������
		System.setOut(new PrintStream("copy.jpg")); 		//�ı��׼�����
		
		InputStream is = System.in;							//��ȡ��׼������
		PrintStream ps = System.out;						//��ȡ��׼�����
		
		int len;
		byte[] arr = new byte[1024 * 1];
		
		while((len = is.read(arr)) != -1) {
			ps.write(arr, 0, len);
		}
		
		is.close();
		ps.close();
	}
//ͨ����׼���������ʵ�ֽ�a�ĵ�����д��b�ĵ����������Ƽ�ʹ�ã�
	private static void demo1() throws FileNotFoundException, IOException {
		System.setIn(new FileInputStream("a.txt"));				//�޸ı�׼������
		System.setOut(new PrintStream("b.txt"));				//�޸ı�׼�����
		
		InputStream in = System.in;								//��ȡ��׼������
		PrintStream ps = System.out;							//��ȡ��׼�����
		int b;
		while((b = in.read()) != -1) {							//��a.txt�϶�ȡ����
			ps.write(b);										//������д��b.txt��
		}
		
		in.close();
		ps.close();
	}

}
