package com.study.io_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjecOutputStream_Test2 {
//��ȡ���󣺷����л�
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		Person p1 = (Person) ois.readObject();//��Ϊ�õ���Object�����������ͻ��Զ����е�Object��
//		                                          ����������Ҫ����ת��
		Person p2 = (Person) ois.readObject();
		System.out.println(p1);
		System.out.println(p2);
		ois.close();

	}

}
