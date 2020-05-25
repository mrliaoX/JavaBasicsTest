package com.study.list;

import java.util.ArrayList;

import com.study.string.Person;

public class ArrayListArray {
	/*  案例演示
	  集合嵌套之ArrayList嵌套ArrayList
	  案例：
	  学科为大集合下分为班级，班级包含个人*/

	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> list = new ArrayList<>();//学科集合包含班级，班级集合包含个人
		ArrayList<Person> first = new ArrayList<>();//第一个班级集合
		first.add(new Person("大哥",1));
		first.add(new Person("二哥",2));
		first.add(new Person("三弟",3));
		ArrayList<Person> second = new ArrayList<>();//第二个班级集合
		second.add(new Person("大姐",1));
		second.add(new Person("二姐",2));
		second.add(new Person("三妹",3));
		
		list.add(first);//将第一个班级添加到学科
		list.add(second);//将第二个班级添加到学科
		//嵌套遍历个每个人
		for (ArrayList< Person> al: list) {//遍历学科集合中的班级
			for (Person person : al) {//遍历班级集合中的个人
				System.out.println(person);
			}
		}

	}

}
