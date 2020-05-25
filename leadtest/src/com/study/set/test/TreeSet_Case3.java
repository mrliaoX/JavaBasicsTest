package com.study.set.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Case3 {
//���������� ���ԴӼ���������ն��������ֱ������quitʱ�������롣 ����������������������д�ӡ.
	/*������
	 *    1������Scanner¼���ַ���
	 *    2������TreeSet���ϴ���Ƚ���
	 *    3������ѭ���ж��ַ����Ƿ���quit�Ǿͽ��������Ǿͽ��ַ���������Integer
	 *    4������TreeSet*/
	public static void main(String[] args) {
		//����Scanner¼���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�");
		//��TreeSet���ϴ���Ƚ���
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {//�Ƚ����������ڲ���comparator��д�ȽϷ��������ֵ�Ƚϱ����ظ�
				int num = i2.compareTo(i1);//��int num = i2-i1;����һ��
				return num == 0 ? 1 :num;
			}
		});
		//����ѭ���ж��ַ����Ƿ���quit�Ǿͽ��������Ǿͽ��ַ���������Integer
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
			Integer i = Integer.parseInt(line);
			ts.add(i);
			/*try {
				
				
			} catch (Exception e) {
				System.out.println("����������");
			}*/
			
		}//����TreeSet
		for (Integer integer : ts) {
			System.out.println(integer);
		}


	}

}
