package com.study.set.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Case2 {
//�Ӽ��̽���һ ���ַ�������������������ַ���������,�����������: helloitcast�����ӡ:acehillostt
	/*������
	 *    1������Scaner	¼���ַ���
	 *    2��������¼����ַ���ת������
	 *    3������TreeSet���ϣ�����Ƚ��������򣬱����ظ�
	 *       �Ƚ����������ڲ���comparator��д�ȽϷ��������ֵ�Ƚϱ����ظ�
	 *    4���������齫�����е�Ԫ�ش���TreeSet����������
	 *    5���������ϴ�ӡ����Ԫ��*/
	public static void main(String[] args) {
		//1������Scaner	¼���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�");
		String line = sc.nextLine();
		//1������Scaner	¼���ַ���
		char[] arr = line.toCharArray();
		/*����TreeSet���ϣ�����Ƚ��������򣬱����ظ�
		 *       �Ƚ����������ڲ���comparator��д�ȽϷ��������ֵ�Ƚϱ����ظ�*/
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {//�Ƚ����������ڲ���comparator��д�ȽϷ��������ֵ�Ƚϱ����ظ�
				int num = c1.compareTo(c2);
				return num ==0 ? 1:num;
			}
		});
		//�������齫�����е�Ԫ�ش���TreeSet����������
		for (Character c : arr) {
			ts.add(c);
		}
		//�������ϴ�ӡ����Ԫ��
		for (Character c : ts) {
			System.out.print(c);
		}
		sc.close();

	}

}
