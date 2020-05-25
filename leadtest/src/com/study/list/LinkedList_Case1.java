package com.study.list;

public class LinkedList_Case1 {
	/*  需求：请用LinkedList模拟栈数据结构的集合，并测试
	  创建一个类将Linked中的方法封装*/
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		while(!s.isEmpty()) {//判空
			System.out.println(s.out());
		}

	}

}
