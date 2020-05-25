package com.study.map;

import java.util.HashMap;

public class Map_Case5_HashMap2 {
	/*案例演示
	  集合嵌套之HashMap嵌套HashMap
	   需求:
	   双元课堂有很多基础班
	   第88期基础班定义成一个双列集合,键是学生对象,值是学生的归属地
	   第99期基础班定义成一个双列集合,键是学生对象,值是学生的归属地
	   无论88期还是99期都是班级对象,所以为了便于统一管理,把这些班级对象添加到双元课堂集合中*/
	public static void main(String[] args) {
		HashMap<Student,String> hm88 = new HashMap<>();//定义成一个双列集合,键是学生对象,值是学生的归属地
		hm88.put(new Student("雷军",18), "武汉大学");
		hm88.put(new Student("余承东",20), "西北工业大学");
		hm88.put(new Student("库克",21), "奥本大学");
		hm88.put(new Student("刘作虎",19), "浙江大学");
		
		HashMap<Student,String> hm99 = new HashMap<>();//定义成一个双列集合,键是学生对象,值是学生的归属地
		hm99.put(new Student("新之助",5), "双叶幼儿园");
		hm99.put(new Student("风间策",5), "双叶幼儿园");
		hm99.put(new Student("娜娜子",5), "双叶幼儿园");
		hm99.put(new Student("向日葵",5), "双叶幼儿园");
		
		HashMap<HashMap<Student,String>,String> hhm = new HashMap<>();//,把这些班级对象添加到大集合中
		hhm.put(hm88, "第88期培训班");
		hhm.put(hm99, "第99期培训班");
		for (HashMap<Student,String> h : hhm.keySet()) {//遍历大集合获取其中每一个集合大集合的键就是是每一个小集合
			    String value = hhm.get(h);//通过键获取大集合中的值即哪个班
			for(Student s : h.keySet()) {//遍历小集合中的所有键
				String value2 = h.get(s);//获取小集合中键所对应的值
			    System.out.println(s+" "+value2+" "+value);//输出
			}
		}

	}

}
