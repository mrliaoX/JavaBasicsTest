package com.study.map;

import java.util.HashMap;

public class Map_Case4_HashMap {
/*	 ������ʾ
	  ����ͳ���ַ�����ÿ���ַ����ֵĴ���*/
	public static void main(String[] args) {
		String s = "aaabbbcccddddddddd";
		char[] arr = s.toCharArray();          //���ַ���ת��������
		HashMap<Character,Integer> hm = new HashMap<>();//����HashMap���Ͻ��������е�Ԫ��
		/*for (char c : arr) {   //�������齫����Ԫ�ش��뼯��
			if(!hm.containsKey(c)) {//�ж�Ԫ���Ƿ���ڣ������ھͰѼ���ֵ������
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);  //Ԫ�ش��ھͰ�ֵ��һ
			}
		}*/
		for (char c : arr) {//�������齫����Ԫ�ش��뼯��
			Integer i = !hm.containsKey(c)?hm.put(c, 1):hm.put(c, hm.get(c)+1);
			System.out.println(i);
		}
		
		for (Character key : hm.keySet()) {//�������ϻ�ȡ���м�hm.keySetΪ��ȡ���м�
			System.out.println(key+" "+hm.get(key));
		}
		

	}

}
