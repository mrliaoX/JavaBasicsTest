package com.study.io_stream.digui;

import java.io.File;

public class Digui_Case2 {
	/** ����:2,�Ӽ��̽���һ���ļ���·��,ɾ�����ļ���
	 * 
	 * ɾ�����ļ���
	 * ����:
	 * 1,��ȡ���ļ����µ����е��ļ����ļ���
	 * 2,��������
	 * 3,�ж����ļ�ֱ��ɾ��
	 * 4,������ļ���,�ݹ����
	 * 5,ѭ��������,�ѿ��ļ���ɾ��
	 */
	public static void main(String[] args) {
		File file = Digui_Case1.getFile();
		deleteFile(file);

	}

	private static void deleteFile(File file) {
		File[] subFile = file.listFiles();
		for (File file2 : subFile) {
			if (file2.isFile()) {
				file2.delete();
			} else {
				deleteFile(file2);

			}
		}
		file.delete();
	}

}
