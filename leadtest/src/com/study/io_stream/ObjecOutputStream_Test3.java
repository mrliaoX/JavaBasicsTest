package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjecOutputStream_Test3 {
//����������Ż�:д��ʱһ��һ��д̫����������һ�����Ͻ�������Ҫд�����ݣ�
//	Ȼ����ObjectOutputStreamһ����д��
	public static void main(String[] args) throws IOException {

		Person p1 = new Person("����", 23);
		Person p2 = new Person("����", 24);
		Person p3 = new Person("���", 18);
		Person p4 = new Person("�Ը�", 20);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
		oos.writeObject(list);									//д�����϶���
		
		oos.close();

	}

}
