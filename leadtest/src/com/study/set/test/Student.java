package com.study.set.test;

public class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;
    private int sun;
    
	public Student() {
		super();
		
	}

	

	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.sun = this.chinese+this.math+this.english;
	}
	public int getSun() {
		return sun;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", sun="
				+ sun + "]";
	}
	

	
}
