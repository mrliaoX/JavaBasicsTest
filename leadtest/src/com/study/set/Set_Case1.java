package com.study.set;

import java.util.HashSet;
import java.util.Random;

public class Set_Case1 {
	/* ������ʾ
	 ����: ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
	 ����:1��ʹ��Random����1��20�������
	      2��ֻ��Ҫȡ10����while����������
	      3����hashset���洢���ظ�
	      4������hashset*/
	public static void main(String[] args) {
		//����random��
		Random r = new Random();
		//����hashset���洢���ظ�������
		HashSet<Integer> hs = new HashSet<>();
		//while���ƴ洢��Ԫ��ֻ��10��
		while(hs.size()<10) {
			hs.add(r.nextInt(21));//r.nextInt(21)����0��20�������
		}
		//����Hashset
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
	}

}
