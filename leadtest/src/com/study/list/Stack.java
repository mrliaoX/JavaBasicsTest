package com.study.list;

import java.util.LinkedList;
@SuppressWarnings({"rawtypes","unchecked"})
public class Stack {
	private LinkedList list = new LinkedList();
    //��ӷ���
	public  void add(Object ob) {
    	list.addLast(ob);//β��
    }
	//ɾ������
	public Object out() {
		return list.removeLast();//βɾ
	}
	//�пշ���
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
