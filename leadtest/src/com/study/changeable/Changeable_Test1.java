package com.study.changeable;

public class Changeable_Test1 {
	/* �ɱ��������
		  ���巽����ʱ��֪���ö�����ٸ�����
	 ��ʽ
		  ���η� ����ֵ���� ������(�������͡�  ������){}
	 ע�����
		  ����ı�����ʵ��һ������
		  ���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��*/

	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
		print(1,2,3,4,5);
	}
	public static void print(int...arr) {//�ɱ��ַ���ʵ��һ������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
