package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Test2 {
//	write()һ��д��һ���ֽ�
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("syz.txt");
		fos.write(65);//ÿ��дһ���ֽڣ��������Ҫ���Ԫ�أ�ԭ����Ԫ�ػᱻ�����
		fos.write(66);
		fos.write(67);
		fos.close();

	}

}
