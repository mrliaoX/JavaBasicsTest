package com.study.set;

import java.util.TreeSet;

public class TreeSet_Test1 {
/*TreeSet�����������Լ��Ͻ��������,ͬ��Ҳ�ɱ�֤Ԫ��Ψһ
 * TreeSet�ײ�ʱ������С�Ĵ���ߣ�����������ұߣ���������Ȳ��棨0��*/
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(1);
		ts.add(3);
		ts.add(3);
		ts.add(2);
		ts.add(2);
		ts.add(2);
		System.out.println(ts);

	}

}
