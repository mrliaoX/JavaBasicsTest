package com.study.file;

import java.io.File;

public class File_Test3 {
/*	* A:��������ɾ������
	* public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
	* public boolean delete():ɾ���ļ������ļ���
      B:������ע������
	* ���·������ͬ�����Ǹ�����
	* ���·������ͬ�����Ǹ��������С�
     C:ɾ��ע�����
	* Java�е�ɾ�����߻���վ��
	* Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���*/
	public static void main(String[] args) {
		File file = new File("abc.txt");
		File file1 = new File("syz.txt");
		System.out.println(file1.renameTo(file));//abc��syz���� ���ļ�������Ϊָ�����ļ�·��
		
		File file2 = new File("aaa");
		System.out.println(file2.delete());//ɾ���ļ������ļ���

	}

}
