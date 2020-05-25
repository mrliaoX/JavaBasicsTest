package com.study.file;

import java.io.File;
import java.io.FilenameFilter;

public class File_Test6 {
	/** A:������ʾ
	* �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����*/
	public static void main(String[] args) {
		//����һ
		File file = new File("E:\\");//�Ȱ�E�̷�װ�ɶ���
		String[] arr = file.list();//��ȡE���µ��ļ���
		for (String string : arr) {//������ȡ���ļ���
			if(string.endsWith(".jpg")) {//endsWith���ж�β���Ƿ����XXX
				System.out.println(string);
			}
		}
		//������ �����г���
		File dir = new File("E:\\");
		File[] arr2 = dir.listFiles();
		for (File file2 : arr2) {
			if(file2.isFile() && file2.getName().endsWith(".jpg")) {
				System.out.println(file2);
			}
		}
		//������ͨ��file������������ô��ǲ��ñ�������
		String[] arr3 = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				File file = new File(dir,name);
				
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		for (String string : arr3) {
			System.out.println(string);
		}

	}

}
