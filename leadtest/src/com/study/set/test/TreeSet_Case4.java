package com.study.set.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Case4 {
	//需求:键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩) ,按照总分从高到低输出到控制台。
	/*分析：
	 *    定义一个学生类：成员变量（私有，字符串类型）：姓名，语文，数学，英语，总分
	 *                    成员方法：空参构造，有参构造，总分为，语文数学英语的和，toString
	 *    定义一个方法类：创建Scanner接收录入的信息，创建TreeSet集合传入比较器，对总分进行比较
	 *                    输入5个学生的信息，以5个学生给个数为判断条件，如果size小于5就进行存储
	 *                    将录入的字符串切割，用逗号切割，返回一个字符串数组，
	 *                    将数组中国从第二个元素开始将后面的转换成Int数
	 *                    遍历TreeSet集合打印，*/
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请按照格式输入信息：姓名，语文，数学，英语");
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSun()-s1.getSun();
				return num==0 ? 1:num;
			}
		});
		while (ts.size()<5) {
			String line = sc.nextLine();
			String[] arr = line.split(",");
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			ts.add(new Student(arr[0],chinese,math,english));
		}
		for (Student student : ts) {
			System.out.println(student);
		}

	}

}
