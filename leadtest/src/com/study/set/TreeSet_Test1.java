package com.study.set;

import java.util.TreeSet;

public class TreeSet_Test1 {
/*TreeSet集合是用来对集合进行排序的,同样也可保证元素唯一
 * TreeSet底层时二叉树小的存左边（负数）大的右边（正数）相等不存（0）*/
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
