package com.study.set;

import java.util.HashSet;

import com.study.string.Student;

public class HashSet_Test2 {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("С��",3));
		hs.add(new Student("С��",3));
		hs.add(new Student("С��",5));
		hs.add(new Student("С��",5));
		hs.add(new Student("С��",5));
		hs.add(new Student("С��",3));
		System.out.println(hs.size());  /*��ӡhs�����Ԫ��Ϊ6��˵��set���ϴ����ظ���
		                                 ԭ������Student����û����дequals������Hashcode����*/
        System.out.println(hs);//��Student��дequals��Hashset������Ϳ��Դ洢���ظ�Ԫ��
	}

}
