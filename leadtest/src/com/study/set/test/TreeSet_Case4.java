package com.study.set.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Case4 {
	//����:����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�) ,�����ִܷӸߵ������������̨��
	/*������
	 *    ����һ��ѧ���ࣺ��Ա������˽�У��ַ������ͣ������������ģ���ѧ��Ӣ��ܷ�
	 *                    ��Ա�������ղι��죬�вι��죬�ܷ�Ϊ��������ѧӢ��ĺͣ�toString
	 *    ����һ�������ࣺ����Scanner����¼�����Ϣ������TreeSet���ϴ���Ƚ��������ֽܷ��бȽ�
	 *                    ����5��ѧ������Ϣ����5��ѧ��������Ϊ�ж����������sizeС��5�ͽ��д洢
	 *                    ��¼����ַ����и�ö����и����һ���ַ������飬
	 *                    �������й��ӵڶ���Ԫ�ؿ�ʼ�������ת����Int��
	 *                    ����TreeSet���ϴ�ӡ��*/
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�밴�ո�ʽ������Ϣ�����������ģ���ѧ��Ӣ��");
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSun()-s1.getSun();
				return num==0 ? 1:num;
			}
		});
		while (ts.size()<5) {
			String line = sc.nextLine();
			String[] arr = line.split(",");
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			ts.add(new Student(arr[0],chinese,math,english));
		}
		for (Student student : ts) {
			System.out.println(student);
		}

	}

}
