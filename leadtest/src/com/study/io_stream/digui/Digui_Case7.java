package com.study.io_stream.digui;

import java.util.ArrayList;

public class Digui_Case7 {
	/*Լɪ��
	 * * �������� 8����ΧһȦ������˭����3�ı����ͱ���̭��ֱ��ʣ�����һ���ˣ�����Ǹ�����վ��λ��*/
	public static void main(String[] args) {
		System.out.println(getLuckyNum(8));

	}

	private static int getLuckyNum(int num) {
		//�������ϴ洢1��num�Ķ��� num��ʾ
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);   //���˰��Ž�λ�ã���8������ӽ����ϣ�
		}
		//������1��ʼ��
		int count = 1;
		for (int i = 0; list.size() != 1;i++) {//ֻҪ��������������1,��Ҫ���ϵ�ɱ
			if(i == list.size()) {//���i������������������+1ʱ���Ͱ�i��0�γ�һ��Ȧ
				i = 0;
			}
			if(count % 3 == 0) {//����3�ı���
				list.remove(i--);//��̭���Ǹ�λ�õ��ˣ�ȥ������λ�ö�Ӧ������
			}
			count++;
		}
		return list.get(0);//��ȡ
		
	}

}
