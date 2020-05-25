package com.study.io_stream.digui;

import java.io.File;

public class Digui_Case4 {
	/*����:4,�Ӽ��̽���һ���ļ���·��,���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ, ����:
		   ���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ
		   ������
		       1 �������е��ļ��к��ļ������ظ�File������
		       2 ��������
		       3 �������ļ������ļ��У�����Ҫ��ӡ
		       4 ������ļ��е��õݹ�*/
	public static void main(String[] args) {
	    File file = Digui_Case1.getFile();
	    printlev(file);
	    printlev2(file,0);

	}

	private static void printlev2(File file,int lev) {
//		 1 �������е��ļ��к��ļ������ظ�File������
		File[] arr = file.listFiles();
//		2 ��������
		for (File subfile : arr) {
			//�ô�ӡ�ļ��и��в�θУ���ÿһ��֮���пո�
			for (int i = 0; i <= lev; i++) {
				System.out.print("\t");
			}
//			3 �������ļ������ļ��У�����Ҫ��ӡ
			System.out.println(subfile);
//			 4 ������ļ��е��õݹ�
			if ((subfile.isDirectory())) {
				printlev2(subfile,++lev);
			}
		}
		
		
	}

	private static void printlev(File file) {
//		 1 �������е��ļ��к��ļ������ظ�File������
		File[] arr = file.listFiles();
//		2 ��������
		for (File subfile : arr) {
//			3 �������ļ������ļ��У�����Ҫ��ӡ
			System.out.println(subfile);
//			4 ������ļ��е��õݹ�
			if ((subfile.isDirectory())) {
				printlev(subfile);
			}
		}
		
	}

}
