package com.study.io_stream.digui;

import java.io.File;
import java.util.Scanner;

public class Digui_Case1 {
//	 * ����:1,�Ӽ��̽���һ���ļ���·��,ͳ�Ƹ��ļ��д�С
/*	����:
 * ����·��:
		1 ����Scanner ����·��
		2 �����̽���洢����װ��file����
		3 �ж��Ƿ����ļ�
		4 ͳ���ļ���С
		5 ���ļ�·�����󷵻�
	�����ļ���С
	       ͳ�Ƹ��ļ��д�С 
	    1,����һ����ͱ���
	    2,��ȡ���ļ��������е��ļ����ļ���listFiles();
	    3,��������
	    4,�ж����ļ��ͼ����С���ۼ�
	    5,�ж����ļ���,�ݹ����*/
	public static void main(String[] args) {
		File file = getFile();
		System.out.println(getFileLength(file));
	}
//	����·��:
	public static File getFile() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��·��:");
		while (true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (! file.exists()) {
				System.out.println("·������,��������ȷ��·��");
			}else if (file.isFile()) {
				System.out.println("·������,�������ļ���·��");
			}else {
				return file;
			}
		}
		
	}
	public static long getFileLength(File file) {
		long len = 0;
		File[] subFile = file.listFiles();
		for (File file2 : subFile) {
			if (file2.isFile()) {
				len = len + file2.length();
			}else {
				len = len + getFileLength(file2);
			}
		}
		return len;
		
	}

}
