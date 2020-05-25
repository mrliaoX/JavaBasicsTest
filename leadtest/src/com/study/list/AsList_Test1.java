package com.study.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList_Test1 {
	  /** A:������ʾ
	* Arrays�������asList()������ʹ��
	* Collection��toArray(T[] a)���Ͱ�ļ���ת����
*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();

	}
	private static void demo3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		/*������ת��������ʱ�����鳤��С�ڵ��ڼ��ϳ��ȣ�ת��������ĳ���Ϊ���鱾����̶�
		��������ڼ��ϵ�sizeʱ����������鳤�Ⱦͺ�ָ���ĳ���һ��*/
		String[] arr = list.toArray(new String[1]);
		for (String string : arr) {/*//����ת�������鲻��ֱ�Ӵ�ӡ����ñ����������
            ��Ϊ����û����дtoString����*/
			System.out.println(string);
		}
	}
	private static void demo2() {
		int[] arr = {1,2,3,4};
		List<int[]> list = Arrays.asList(arr);//�����������͵�����ת���ɼ��ϣ��Ὣ�������鵱��һ�����ö���
		System.out.println(list);
		Integer[] arr2 = {1,2,3,4};
		List<Integer> list2 = Arrays.asList(arr2);//������ת���ɼ��ϣ����������������������
		System.out.println(list2);
	}
//   ������ת���ɼ���
	private static void demo1() {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);
		//list.add("d");����ת���ɼ��ϲ���ʹ�üӼ�Ԫ�أ����ǿ����ü��ϵ�˼�����������飬Ҳ����˵�����������еķ���
		System.out.println(list);
	}

}
