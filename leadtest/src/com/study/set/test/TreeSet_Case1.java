package com.study.set.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSet_Case1 {
//	���� ��һ�������д洢���������ظ����ַ���,����-������,��������(�ֵ�˳��) ,���һ�����ȥ���ظ�
	/*����������һ��TreeSet���ϣ���ΪString������бȽϹ��ܣ����ǲ��ᱣ���ظ�������Ҫ�ñȽ���
	 *      ��list�����е�Ԫ����ӵ�TreeSet�����У����򣬱����ظ�
	 *      �Ƚ����������ڲ���comparator��д�ȽϷ��������ֵ�Ƚϱ����ظ�
	 *      ��TreeSet����õ�*/
	public static void main(String[] args) {
		//����һ�������list����
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("ccc");
		list.add("ddd");
		//��list����
		sort(list);
		//��ӡ������list
		System.out.println(list);

	}

	private static void sort(List<String> list) {
		//����һ��TreeSet���ϣ���ΪString������бȽϹ��ܣ����ǲ��ᱣ���ظ�������Ҫ�ñȽ���
		TreeSet<String> ts =new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {//�Ƚ����������ڲ���comparator��д�ȽϷ��������ֵ�Ƚϱ����ظ�
				int num = s1.compareTo(s2);
				return num ==0 ? 1:num;
			}
		
		});
		//��list�����е�Ԫ����ӵ�TreeSet�����У����򣬱����ظ�
		ts.addAll(list);
		//���list�е�����Ԫ��
		list.clear();
		//��ts������õ�Ԫ�ش���list
		list.addAll(ts);
	}

}
 