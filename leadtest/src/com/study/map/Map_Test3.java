package com.study.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test3 {
	/*Map���ϵı���֮��ֵ�Զ����Ҽ���ֵ
	��ֵ�Զ����Ҽ���ֵ˼·��entry
	  ��ȡ���м�ֵ�Զ���ļ���
	  ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
	  ���ݼ�ֵ�Զ����Ҽ���ֵ*/
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		 map.put("һ", 18);
		 map.put("��", 17);
		 map.put("��", 19);
		 map.put("��", 18);
		 //Map.Entry����map�ڽӿڣ�������ֵ��װ��Entry���󣬲��洢��set��
		Set<Map.Entry<String,Integer>> entryset =map.entrySet();
		//��ȡÿ������
		Iterator<Map.Entry<String,Integer>> it = entryset.iterator();
		while(it.hasNext()) {//�ж��Ƿ���Ԫ��
			Map.Entry<String, Integer> me = it.next();//��ȡÿһ������
			String key = me.getKey();//��ȡÿһ�������еļ�
			Integer value = me.getValue();//��ȡÿһ�������е�ֵ
			System.out.println(key+"="+value);
		}
		System.out.println("---------------------");
		//ǿfor��entry����
		for(Map.Entry<String, Integer> me:map.entrySet()) {//������ȡÿһ������
			System.out.println(me.getKey()+"="+me.getValue());//��ӡÿ�������еļ���ֵ
		}

	}

}
