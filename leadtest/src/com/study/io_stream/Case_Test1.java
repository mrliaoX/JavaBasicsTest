package com.study.io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Case_Test1 {
	/** �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ��
	 * 
	 * ����:
	 * 
	 * 1,���巽���Լ���¼���·�������ж�,������ļ��ͷ���
	 * 2,���������н��ո��ļ�
	 * 3,����д���ļ�*/
	public static void main(String[] args) throws IOException {
		File file = getFile();//����getFile����
		//�ļ�����
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int i;
		byte[] arr = new byte[1024];
		while ((i = bis.read(arr)) != -1) {
			bos.write(i);
		}
		bis.close();
		bos.close();
		

	}
    //����һ����ȡ����¼�벢��װ���ļ�����
	private static File getFile() {
		@SuppressWarnings("resource")//Ϊ������sc�ľ���
		Scanner sc = new Scanner(System.in);//��������¼�����
		System.out.println("������һ��·��");
		while (true) {
			String line = sc.nextLine();  //����¼��·��
			File file = new File(line);   //��װ��File����,����������ж�
			//·����״���ж�
			if (!file.exists()) {          
				System.out.println("�ļ�·�������ڣ���������");
			} else if(file.isDirectory()){
                System.out.println("¼������ļ���·�����벹ȫ·��");
			} else {
				return file;
			}
		}
		
	}

}
