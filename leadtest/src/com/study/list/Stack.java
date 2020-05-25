package com.study.list;

import java.util.LinkedList;
@SuppressWarnings({"rawtypes","unchecked"})
public class Stack {
	private LinkedList list = new LinkedList();
    //添加方法
	public  void add(Object ob) {
    	list.addLast(ob);//尾插
    }
	//删除方法
	public Object out() {
		return list.removeLast();//尾删
	}
	//判空方法
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
