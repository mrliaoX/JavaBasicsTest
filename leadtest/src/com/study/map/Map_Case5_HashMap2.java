package com.study.map;

import java.util.HashMap;

public class Map_Case5_HashMap2 {
	/*������ʾ
	  ����Ƕ��֮HashMapǶ��HashMap
	   ����:
	   ˫Ԫ�����кܶ������
	   ��88�ڻ����ඨ���һ��˫�м���,����ѧ������,ֵ��ѧ���Ĺ�����
	   ��99�ڻ����ඨ���һ��˫�м���,����ѧ������,ֵ��ѧ���Ĺ�����
	   ����88�ڻ���99�ڶ��ǰ༶����,����Ϊ�˱���ͳһ����,����Щ�༶������ӵ�˫Ԫ���ü�����*/
	public static void main(String[] args) {
		HashMap<Student,String> hm88 = new HashMap<>();//�����һ��˫�м���,����ѧ������,ֵ��ѧ���Ĺ�����
		hm88.put(new Student("�׾�",18), "�人��ѧ");
		hm88.put(new Student("��ж�",20), "������ҵ��ѧ");
		hm88.put(new Student("���",21), "�±���ѧ");
		hm88.put(new Student("������",19), "�㽭��ѧ");
		
		HashMap<Student,String> hm99 = new HashMap<>();//�����һ��˫�м���,����ѧ������,ֵ��ѧ���Ĺ�����
		hm99.put(new Student("��֮��",5), "˫Ҷ�׶�԰");
		hm99.put(new Student("����",5), "˫Ҷ�׶�԰");
		hm99.put(new Student("������",5), "˫Ҷ�׶�԰");
		hm99.put(new Student("���տ�",5), "˫Ҷ�׶�԰");
		
		HashMap<HashMap<Student,String>,String> hhm = new HashMap<>();//,����Щ�༶������ӵ��󼯺���
		hhm.put(hm88, "��88����ѵ��");
		hhm.put(hm99, "��99����ѵ��");
		for (HashMap<Student,String> h : hhm.keySet()) {//�����󼯺ϻ�ȡ����ÿһ�����ϴ󼯺ϵļ�������ÿһ��С����
			    String value = hhm.get(h);//ͨ������ȡ�󼯺��е�ֵ���ĸ���
			for(Student s : h.keySet()) {//����С�����е����м�
				String value2 = h.get(s);//��ȡС�����м�����Ӧ��ֵ
			    System.out.println(s+" "+value2+" "+value);//���
			}
		}

	}

}
