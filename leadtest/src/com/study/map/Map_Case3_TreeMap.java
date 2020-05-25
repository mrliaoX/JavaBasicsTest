package com.study.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Map_Case3_TreeMap {
	/*������ʾ
	  TreeMap���ϼ���Studentֵ��String�İ���*/
	public static void main(String[] args) {
//		demo1();
		TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {//��ӱȽ���

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());	//���������Ƚ�
				return num ==0 ? s1.getAge()-s2.getAge():num; //�ٰ�������Ƚ�
			}
			
		});
		tm.put(new Student("С��",10), "�人");
		tm.put(new Student("��Ϊ",14), "����");
		tm.put(new Student("����",17), "�麣");
		tm.put(new Student("һ��",8), "����ͼ");
		tm.put(new Student("С��",11), "����");
		System.out.println(tm);

	}

	private static void demo1() {
		TreeMap<Student,String> tm = new TreeMap<>();
		tm.put(new Student("С��",10), "�人");
		tm.put(new Student("��Ϊ",14), "����");
		tm.put(new Student("����",17), "�麣");
		tm.put(new Student("һ��",8), "����ͼ");
		System.out.println(tm);//�ᱨ�����ܽ�Studentǿ��ת��Ϊjava.lang.Comparable��
		                          /*��ΪTreeMap������ģ����Բ�֪��˭�����
		                          ������Ҫ��һ���Ƚ���comparable*/
		/*java.lang.ClassCastException: 
		com.study.map.Student cannot be cast to java.lang.Comparable*/
	}

}
