package com.study.set;

import java.util.TreeSet;

import com.study.string.Person;

public class TreeSet_Test2 {
/*treeset�洢�Զ������ʱ������дCompareto����
 * 
 *  ��compareTo��������0��ʱ�򼯺���ֻ��-��Ԫ��
    ��compareTo��������������ʱ�򼯺ϻ���ô�����ôȡ
    ��compareTo�������ظ�����ʱ�򼯺ϻᵹ��洢*/
	public static void main(String[] args) {
		demo1();
//		ȥperson��ѡ��comparebleto�ıȽϷ���Ȼ��������
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("С��",3));
		ts.add(new Person("С��",5));
		ts.add(new Person("С��",1));
		ts.add(new Person("������",22));
		System.out.println(ts);

	}

	private static void demo1() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("С��",5));
		ts.add(new Person("С��",3));
		ts.add(new Person("С��",1));
		//��û����дComparableto������ʱ��ͱ��� java.lang.ClassCastException: com.study.test.Person cannot be cast to java.lang.Comparable
		System.out.println(ts);
	}

}
