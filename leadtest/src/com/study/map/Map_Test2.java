package com.study.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test2 {
	/* Map���ϵı���֮����ֵ
	 ����ֵ˼·��
		  ��ȡ���м��ļ���
		  �������ļ��ϣ���ȡ��ÿһ����
		  ���ݼ���ֵ*/
	public static void main(String[] args) {
		 Map<String,Integer> map = new HashMap<>();
		 map.put("һ", 18);
		 map.put("��", 17);
		 map.put("��", 19);
		 map.put("��", 18);
		 /*map�����ĵ�һ�ַ�������ȡ���н�����set���ϣ�ͨ��
		   set���ϻ�ȡ����������ͨ������������key��set*/
		 Set<String> keySet = map.keySet(); //keySet�ǻ�ȡ���Ե�ֵ
		 Iterator<String> it = keySet.iterator();//��ȡ������
		 while (it.hasNext()) {//�ж����Ƿ����Ԫ��
			String key = it.next();//��ȡÿһ����
			Integer value = map.get(key);//��ȡÿ������Ӧ��ֵ
			System.out.println(key+"="+value);//��ӡ���ͼ�ֵ
		}
		 System.out.println("-------------------");
		 //ǿfor����
		 for(String key : map.keySet()) {
			 System.out.println(key+"="+map.get(key));
		 }

	}

}
