package com.study.file;

import java.io.File;
import java.io.IOException;

public class File_Test2 {
	 /* A:��������
	  public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
	  public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
	  public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
      B:������ʾ
	  File��Ĵ�������

	  ע�����
		  ����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�*/
	public static void main(String[] args) throws IOException {
		File file = new File("c.txt");
		System.out.println(file.createNewFile());//�����ļ���������������ļ����Ͳ�������
		
		File file1 = new File("aaa");
		System.out.println(file1.mkdir());//�����ļ��� ��������������ļ��У��Ͳ�������
		
		File file2 = new File("D:bbb\\ccc");
		System.out.println(file2.mkdirs());

	}

}
