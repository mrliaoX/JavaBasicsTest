package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Try_Test1 {
	
		public static void main(String[] args) throws IOException {
			demo1();
			demo2();
	
		}
		//���ı�׼�����쳣����1.7�汾
		//��try()�д��������������ʵ����AutoCloseable����ӿ�,���ʵ����,
		//��try�����{}(��д����)ִ�к�ͻ��Զ�����,�������close���������ص� 
		private static void demo2() throws IOException, FileNotFoundException {
			try( FileInputStream fis = new FileInputStream("111.jpg");
				 FileOutputStream fos = new FileOutputStream("copy.jpg");	
				){
				int i;
				while ((i = fis.read()) != -1) {
					fos.write(i);
				}
			}
		}
		//���ı�׼�����쳣����1.6�汾������ǰ
		private static void demo1() throws FileNotFoundException, IOException {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream("111.jpg");
				fos = new FileOutputStream("copy.jpg");
				byte[] arr = new byte[1024];
				int len;
				while ((len = fis.read()) != -1) {
					fos.write(arr,0,len);
				}
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} finally {
					if (fos != null) {
						fos.close();
					}
				}
				
			}
		}

}
