package com.study.try_catch;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Try_Catch_Test1 {
  /* ����¼��һ��int���͵����� ,����������Ʊ�����ʽ
	 ���¼����������󣬸�����ʾ��¼�����������������¼��һ������BigInteger
	 ���¼�����С��,������ʾ��¼�����С����������¼��һ������
	 ���¼����������ַ�,������ʾ,¼����ǷǷ��ַ���������¼��һ������*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("������һ��������");
		//ͨ��tryǶ�׽���������С���������ַ��ų�
		 while(true){
			String s = sc.nextLine();
			
			try {
					int num = Integer.parseInt(s);
					System.out.println(Integer.toBinaryString(num));
					break;
			} catch (Exception e) {
					try {
						new BigInteger(s);
						System.out.println("�����������������������");
					} catch (Exception e2) {
						try {
							new BigDecimal(s);
							System.out.println("�����������ΪС��������д����");
						} catch (Exception e3) {
							 System.out.println("������ǷǷ��ַ�������д����");
						}
					}
			}
			
	 	 } 
	     sc.close();

	}

}
