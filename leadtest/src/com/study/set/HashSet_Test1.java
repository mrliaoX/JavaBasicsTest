package com.study.set;

import java.util.HashSet;

public class HashSet_Test1 {

	public static void main(String[] args) {
		//Set�����������������ظ������򣨴�ȡ��һ�£�
		HashSet<String> hs = new HashSet<>();
		/* HashSet�̳��˸���ĸ��ࣨүү�ࣩ�е�toString������
		 * public String toString() {
		        Iterator<E> it = iterator();
		        if (! it.hasNext())
		            return "[]";

		        StringBuilder sb = new StringBuilder();
		        sb.append('[');
		        for (;;) {
		            E e = it.next();
		            sb.append(e == this ? "(this Collection)" : e);
		            if (! it.hasNext())
		                return sb.append(']').toString();
		            sb.append(',').append(' ');
		        }
		    }*/
		hs.add("b");
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");   //��Set���ϴ洢�ظ�Ԫ�ص�ʱ��᷵��false
		System.out.println(hs);     //HashSet�ļ̳���ϵ����д��toString����
		System.out.println(b1);
		System.out.println(b2);

	}

}
