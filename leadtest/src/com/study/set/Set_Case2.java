package com.study.set;

import java.util.HashSet;
import java.util.Scanner;

public class Set_Case2 {
	 //ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ��� ��ӡ����ͬ����Щ�ַ�
	   /*������
	    * 1������Scanner¼���ַ�
	    * 2�����ַ�ת�������飬��������洢������
	    * 3������Hashset*/
	public static void main(String[] args) {
		//����Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		//����Hashset���洢���ظ�Ԫ��
		HashSet<Character> hs = new HashSet<>();
		//����¼����ַ�
		String line = sc.nextLine();
		//�����յ��ַ�ת�����ַ�����
		char[] arr = line.toCharArray();
		//�������齫ÿ���ַ�����hashset����
		for (char c : arr) {
			hs.add(c);
		}
		//�������ϴ�ӡ�������е�Ԫ��
		for(Character ct : hs) {
			System.out.println(ct);
		}
		sc.close();

	}

}
