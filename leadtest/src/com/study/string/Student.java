package com.study.string;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	/*Ϊʲô��31
	1��31��һ���������������ܱ��Լ�h��1������
	2��31�����������Ҳ��С
	3��31�������㣬��Ϊ2��5�η���1����31����2�����ƶ�5�ڼ�1*/
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)                    //���õĶ���ʹ���Ķ�����ͬһ������
			return true;                    //ֱ�ӷ���true
		if (obj == null)                    //����Ķ���Ϊnull
			return false;                   //����false
		if (getClass() != obj.getClass())    //�ж����������Ӧ���ֽ����ļ��Ƿ���ͬһ���ֽ���
			return false;                   //�������ֱ�ӷ���false
		Student other = (Student) obj;     //����ת��
		if (age != other.age)                //���ö�������䲻���ڴ�����������
			return false;                    //����false
		if (name == null) {                  //���ö��������Ϊnull
			if (other.name != null)          //��������������Ϊnull
				return false;                //����false
		} else if (!name.equals(other.name)) //���ö�������������ڴ�����������
			return false;                   //����false
		return true;                        //����true
	}
   
}
