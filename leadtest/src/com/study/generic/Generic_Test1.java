package com.study.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.study.string.Person;

public class Generic_Test1 {
	 /*���͸���
	 ���ͺô�
		  ��߰�ȫ��(�������ڵĴ���ת����������) 
		  ʡȥǿת���鷳
	 ���ͻ���ʹ��
		  <>�зŵı����������������� 
	 ����ʹ��ע������
		  ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���) */
	//����Ҫ��֤ǰ�����������--.��
	//���ϵķ���Ҫ��֤ǰ�����������һ��
	//������ò�Ҫ�����object,û������
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();//ǰ�涨���˷��ͺ�����Բ��ö���
		list.add(new Person("С��",5));
		list.add(new Person("��",3));
		Iterator<Person> it =list.iterator();  //��ȡ������
		while(it.hasNext()) {
			//System.out.println(it.next().getName()+" "+it.next().getAge());����ε���next()ָ������ƶ�
			Person p = it.next();
			System.out.println(p.getName()+" "+p.getAge());
		}

	}

}
