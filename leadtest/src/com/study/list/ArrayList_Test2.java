package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.study.string.Person;
@SuppressWarnings({"rawtypes","unchecked"})
public class ArrayList_Test2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("小新",5));
		list.add(new Person("小新",5));
		list.add(new Person("妮妮",5));
		list.add(new Person("小新",5));
		
		ArrayList al = getSingle(list);  //老集合传给getSingle方法进行运行
        System.out.println(al);
	}
	 /* contains判断是否包含	底层依赖的是Object类的equals方法（地址值做判断）
	  所以得重写containsObject类的equals方法
	  remove也是底层依赖Object类的equals方法*/
	public static ArrayList getSingle(ArrayList list) {
		ArrayList al = new ArrayList();
		Iterator it = list.iterator(); //获取迭代器
		while(it.hasNext()) {   //遍历集合
			Object ob = it.next();
			if (!al.contains(ob)) {  //判断是否重复
				al.add(ob);          //添加不重复的元素
			}
		}
		return al;
		
	}

}
