package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"rawtypes","unchecked"})
public class ArrayLIst_Test1 {
	/*����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	  ˼·�������¼��Ϸ�ʽ*/

			/**
			 *  A:������ʾ
			 * ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
			 * ˼·�������¼��Ϸ�ʽ
			 * ����
			 * 1 �����¼��ϴ��뼯�ϣ��ϵļ��ϣ���ȡ������
			 * 2 �����ϵļ���
			 * 3 �ж��ϼ������ϼ����Ƿ��ظ�
			 * 4 ��Ӳ��ظ���Ԫ��
			 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		
		ArrayList al = getSingle(list); //���¼���ȡ���ܾͼ���
		System.out.println(al);

	}
	public static ArrayList getSingle(ArrayList list) {
		ArrayList al = new ArrayList();
		Iterator it = list.iterator(); //��ȡ������
		while(it.hasNext()) {   //��������
			Object ob = it.next();
			if (!al.contains(ob)) {  //�ж��Ƿ��ظ�
				al.add(ob);          //��Ӳ��ظ���Ԫ��
			}
		}
		return al;
		
	}

}
