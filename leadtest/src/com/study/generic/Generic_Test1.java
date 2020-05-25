package com.study.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.study.string.Person;

public class Generic_Test1 {
	 /*泛型概述
	 泛型好处
		  提高安全性(将运行期的错误转换到编译期) 
		  省去强转的麻烦
	 泛型基本使用
		  <>中放的必须是引用数据类型 
	 泛型使用注意事项
		  前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型) */
	//数组要保证前后的数据类型--.致
	//集合的泛型要保证前后的数据类型一致
	//泛型最好不要定义成object,没有意义
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();//前面定义了范型后面可以不用定义
		list.add(new Person("小新",5));
		list.add(new Person("白",3));
		Iterator<Person> it =list.iterator();  //获取迭代器
		while(it.hasNext()) {
			//System.out.println(it.next().getName()+" "+it.next().getAge());当多次调用next()指针会多次移动
			Person p = it.next();
			System.out.println(p.getName()+" "+p.getAge());
		}

	}

}
