package com.study.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Test3 {
//按照字符串长度比较，先比较字符串长度，再比较字符
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());//当传入比较器的时候会按照比较器的方法去排序
		ts.add("aaaaaaaa");
		ts.add("bbvbb");
		ts.add("ccc");
		ts.add("zzz");
		ts.add("bcz");
		System.out.println(ts);

	}
	
	

}
//写一个比较字符串长度的比较器，实现comparator
class CompareByLen implements Comparator<String> {
	public int compare(String s1,String s2) {
		int num = s1.length()-s2.length(); //先比较字符串长度
		return num == 0 ? s1.compareTo(s2):num;//再比较字符
	}
}
