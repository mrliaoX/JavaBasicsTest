package com.study.list;

public class LinkedList_Case1 {
	/*  ��������LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
	  ����һ���ཫLinked�еķ�����װ*/
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		while(!s.isEmpty()) {//�п�
			System.out.println(s.out());
		}

	}

}
