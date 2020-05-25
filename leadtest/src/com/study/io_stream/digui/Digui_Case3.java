package com.study.io_stream.digui;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Digui_Case3 {
//	����:3,�Ӽ��̽��������ļ���·��,������һ���ļ�����(��������)��������һ���ļ�����
	/*������
	 *    1 �����ļ���������getFile
	 *      �ж���������·���Ƿ�һ��
	 *    2 ����copy����ȥִ�п���
	 *      ������·����װ��file���󣬴������ļ���
	 *      ���������õ�����Դ�ļ����ļ���
	 *      �ж��Ƿ����ļ��������ж�д��ݹ�
	 *      */
	public static void main(String[] args) throws IOException {
		File src = Digui_Case1.getFile();
		File aaa = Digui_Case1.getFile();
		if (src.equals(aaa)) {
			System.out.println("�ļ���·����ͬ������д����");
		}else {
			copy(src,aaa);
		}

	}

	private static void copy(File src, File aaa) throws IOException {
//		1,��Ŀ���ļ����д���ԭ�ļ���
		File file = new File(aaa,src.getName());
		file.mkdir();//�൱����copy�ļ����´�����һ��src�ļ���
//		2,��ȡԭ�ļ��������е��ļ����ļ���,�洢��File������
		File[] arr = src.listFiles();
//		3,��������
		for (File file2 : arr) {
//			4,������ļ�����io����д
			if (file2.isFile()) {
				//file2�ǻ�ȡ��arr���������е��ļ����ļ��У�����io��дҪ��file2�ж���д��file��
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(file,file2.getName())));
				int i;
				byte[] b = new byte[1024*1];
				while ((i = bis.read(b)) != -1) {
					bos.write(i);
				}
				bis.close();
				bos.close();
//				5,������ļ��о͵ݹ����
			} else {
               copy(file2,file);
			}
		}
	}

}
