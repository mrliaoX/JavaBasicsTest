package com.study.file;

import java.io.File;

public class File_Test4 {
	/** A:�жϹ���
	* public boolean isDirectory():�ж��Ƿ���Ŀ¼
	* public boolean isFile():�ж��Ƿ����ļ�
	* public boolean exists():�ж��Ƿ����
	* public boolean canRead():�ж��Ƿ�ɶ�
	* public boolean canWrite():�ж��Ƿ��д
	* public boolean isHidden():�ж��Ƿ�����
      B:������ʾ
	* File����жϹ���*/
	public static void main(String[] args) {
		File dir = new File("abc.txt");
		System.out.println(dir.isDirectory());//�ж��Ƿ���Ŀ¼
		File dir1 = new File("aaa");
		System.out.println(dir1.isDirectory());//�ж��Ƿ���Ŀ¼
		
		File dir2 = new File("syz.txt");
		System.out.println(dir2.isFile());//�ж��Ƿ����ļ�
		
		File dir3 = new File("syz.txt");
		System.out.println(dir3.exists());//�ж��Ƿ����
		File dir4 = new File("zzz");
		System.out.println(dir4.exists());//�ж��Ƿ����
		
		File dir5 = new File("aaa");
		dir5.setReadable(false);//�����Ĳ��ɶ���������windows��Ĭ���ļ����ǿɶ���
		System.out.println(dir5.canRead());//�ж��Ƿ�ɶ�
		
		File dir6 = new File("abc");
		System.out.println(dir6.canWrite());//�ж��Ƿ��д
		File dir7 = new File("abc.txt");
		System.out.println(dir7.canWrite());//�ж��Ƿ��д
		
		File dir8 = new File("abc");
		System.out.println(dir8.isHidden());//�ж��Ƿ�����
	}

}
