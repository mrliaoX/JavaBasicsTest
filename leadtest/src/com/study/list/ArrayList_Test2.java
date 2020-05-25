package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.study.string.Person;
@SuppressWarnings({"rawtypes","unchecked"})
public class ArrayList_Test2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("С��",5));
		list.add(new Person("С��",5));
		list.add(new Person("����",5));
		list.add(new Person("С��",5));
		
		ArrayList al = getSingle(list);  //�ϼ��ϴ���getSingle������������
        System.out.println(al);
	}
	 /* contains�ж��Ƿ����	�ײ���������Object���equals��������ֵַ���жϣ�
	  ���Ե���дcontainsObject���equals����
	  removeҲ�ǵײ�����Object���equals����*/
	public static ArrayList getSingle(ArrayList list) {
		ArrayList al = new ArrayList();
		Iterator it = list.iterator(); //��ȡ������
		while(it.hasNext()) {   //��������
			Object ob = it.next();
			if (!al.contains(ob)) {  //�ж��Ƿ��ظ�
				al.add(ob);          //��Ӳ��ظ���Ԫ��
			}
		}
		return al;
		
	}

}
