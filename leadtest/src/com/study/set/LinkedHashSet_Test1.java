package com.study.set;

import java.util.LinkedHashSet;

public class LinkedHashSet_Test1 {
	/*LinkedHashSet���ص㣺
	LinkedHashSet�ײ�������ʵ�ֵģ���set������Ψһһ���ܱ�֤��ô�����ôȡ�ļ��϶���
	��Ϊ��HashSet����������Ҳ���Ա�֤�ǲ��ظ��洢*/
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("b");
		lhs.add("c");
		lhs.add("c");
		System.out.println(lhs);

	}

}
