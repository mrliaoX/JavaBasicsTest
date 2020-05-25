package com.study.set;

import java.util.LinkedHashSet;

public class LinkedHashSet_Test1 {
	/*LinkedHashSet的特点：
	LinkedHashSet底层是链表实现的，是set集合中唯一一个能保证怎么存就怎么取的集合对象
	因为是HashSet的子类所以也可以保证是不重复存储*/
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
