package com.study.set.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSet_Case1 {
//	需求 在一个集合中存储了无序并且重复的字符串,定义-个方法,让其有序(字典顺序) ,而且还不能去除重复
	/*分析：创建一个TreeSet集合，因为String本身具有比较功能，但是不会保留重复，所以要用比较器
	 *      将list集合中的元素添加到TreeSet集合中，排序，保留重复
	 *      比较器：匿名内部类comparator重写比较方法按照字典比较保留重复
	 *      将TreeSet排序好的*/
	public static void main(String[] args) {
		//创建一个无序的list集合
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("ccc");
		list.add("ddd");
		//给list排序
		sort(list);
		//打印排序后的list
		System.out.println(list);

	}

	private static void sort(List<String> list) {
		//创建一个TreeSet集合，因为String本身具有比较功能，但是不会保留重复，所以要用比较器
		TreeSet<String> ts =new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {//比较器：匿名内部类comparator重写比较方法按照字典比较保留重复
				int num = s1.compareTo(s2);
				return num ==0 ? 1:num;
			}
		
		});
		//将list集合中的元素添加到TreeSet集合中，排序，保留重复
		ts.addAll(list);
		//清空list中的无序元素
		list.clear();
		//将ts中排序好的元素传入list
		list.addAll(ts);
	}

}
 