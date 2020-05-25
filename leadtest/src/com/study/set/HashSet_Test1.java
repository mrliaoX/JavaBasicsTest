package com.study.set;

import java.util.HashSet;

public class HashSet_Test1 {

	public static void main(String[] args) {
		//Set集合无索引，不可重复，无序（存取不一致）
		HashSet<String> hs = new HashSet<>();
		/* HashSet继承了父类的父类（爷爷类）中的toString方法：
		 * public String toString() {
		        Iterator<E> it = iterator();
		        if (! it.hasNext())
		            return "[]";

		        StringBuilder sb = new StringBuilder();
		        sb.append('[');
		        for (;;) {
		            E e = it.next();
		            sb.append(e == this ? "(this Collection)" : e);
		            if (! it.hasNext())
		                return sb.append(']').toString();
		            sb.append(',').append(' ');
		        }
		    }*/
		hs.add("b");
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");   //当Set集合存储重复元素的时候会返回false
		System.out.println(hs);     //HashSet的继承体系中重写了toString方法
		System.out.println(b1);
		System.out.println(b2);

	}

}
