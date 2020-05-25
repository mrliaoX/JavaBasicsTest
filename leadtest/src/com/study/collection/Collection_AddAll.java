package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"unchecked","rawtypes"})
public class Collection_AddAll {
	/*������ʾ
	  ��All�Ĺ�����ʾ
		boolean addAll(Collection c)
		boolean removeAll(Collection c)
		boolean containsAll(Collection c)
		boolean retainAll(Collection c)*/
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();

	}

	private static void demo4() {  //ȡ����������õļ��ϲ���Ϊtrue���ı�Ϊfalse
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("f");
		boolean b = c1.retainAll(c2); //ȡ����
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo3() {  //�ж�A���Ƿ����B�����Ե�Ԫ��
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
//		c2.add("f");
		boolean b = c1.containsAll(c2); //�жϴ����Ԫ���Ƿ������c1��
		System.out.println(b);
	}

	private static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("f");
		
		boolean b = c1.removeAll(c2);   //ɾ��������û�н�������false
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		System.out.println(c1.addAll(c2));//��C2�е�Ԫ����ӵ�C1��
		System.out.println(c1);
		c1.add(c2);
		System.out.println(c1); //��C2������ӵ�C1��ȡ
	}

}
