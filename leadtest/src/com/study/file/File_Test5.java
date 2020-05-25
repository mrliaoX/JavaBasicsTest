package com.study.file;

import java.io.File;

public class File_Test5 {
/*	* A:��ȡ����
	* public String getAbsolutePath()����ȡ����·��
	* public String getPath():��ȡ·��
	* public String getName():��ȡ����
	* public long length():��ȡ���ȡ��ֽ���
	* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
    * B:������ʾ
	* File��Ļ�ȡ����*/
	public static void main(String[] args) {
		File dir = new File("abc.txt");//E:\eclipse\eclipse-jee-oxygen-R-win32-x86_64\eclipse\eclipse-woekce\leadtest\abc.txt
		System.out.println(dir.getAbsolutePath());//��ȡ����·��
		
		File dir2 = new File("abc.txt");//abc.txt
		System.out.println(dir2.getPath());//��ȡ·��
		
		File dir3 = new File("E:\\eclipse\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\eclipse-woekce\\leadtest\\abc.txt");
		System.out.println(dir3.getName());//��ȡ����
		
		File dir4 = new File("abc.txt");
		System.out.println(dir4.length());//��ȡ���ȡ��ֽ���
		
		File dir5 = new File("abc.txt");
		System.out.println(dir5.lastModified());
		
		File dir6 = new File("D:\\�ϴ�");
		String[] arr = dir6.list();
		for (String string : arr) {
			System.out.println(string);
		}
		
		File dir7 = new File("D:\\�ϴ�");
		File[] arr2 = dir7.listFiles();
		for (File string : arr2) {
			System.out.println(string);
		}
		
		
		
	}
}
