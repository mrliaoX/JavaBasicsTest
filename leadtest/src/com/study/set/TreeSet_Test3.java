package com.study.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Test3 {
//�����ַ������ȱȽϣ��ȱȽ��ַ������ȣ��ٱȽ��ַ�
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());//������Ƚ�����ʱ��ᰴ�ձȽ����ķ���ȥ����
		ts.add("aaaaaaaa");
		ts.add("bbvbb");
		ts.add("ccc");
		ts.add("zzz");
		ts.add("bcz");
		System.out.println(ts);

	}
	
	

}
//дһ���Ƚ��ַ������ȵıȽ�����ʵ��comparator
class CompareByLen implements Comparator<String> {
	public int compare(String s1,String s2) {
		int num = s1.length()-s2.length(); //�ȱȽ��ַ�������
		return num == 0 ? s1.compareTo(s2):num;//�ٱȽ��ַ�
	}
}
