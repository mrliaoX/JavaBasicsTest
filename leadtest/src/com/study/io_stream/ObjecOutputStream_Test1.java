package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjecOutputStream_Test1 {
/*	 1.ʲô�Ƕ��������
		* �������Խ�һ������д��, ���߶�ȡһ�����󵽳�����. Ҳ����ִ�������л��ͷ����л��Ĳ���.
	* 2.ʹ�÷�ʽ
		* д��: new ObjectOutputStream(OutputStream), writeObject()*/
	public static void main(String[] args) throws IOException {
	   /*д��e.txt��ȥ�鿴e.txt��ʱ��ᷢ�����룬������Ϊ���ͬ��ԭ�򣬲���Ҫ��
	    * ��Ϊ���л�ֻ��Ҫ������У����൱����Ϸ�Ĵ浵����ʱ�����л��Ϳ��Եõ�����*/
		//������д�룺���л�
		Person p1 = new Person("С��",1);
		Person p2 = new Person("С��",5);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));//�������������
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();

	}

}
