package com.study.io_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjecOutputStream_Test4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		��Test3���Ż��� ��ȡ������һ�����϶���
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"));
		@SuppressWarnings("unchecked")
		ArrayList<Person> list = (ArrayList<Person>)ois.readObject();	//�����������ڻᱻ����,�����������൱��û�з���		
        for (Person person : list) {
			System.out.println(person);
		}
        ois.close();

	}

}
