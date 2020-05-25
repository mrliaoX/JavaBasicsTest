package com.study.string;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
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
		return "Preson [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
	/*@Override
	当compareTo方法返回0的时候集合中只有-个元素
    当compareTo方法返回正数的时候集合会怎么存就怎么取
    当compareTo方法返回负数的时候集合会倒序存储
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 1;
	}*/
	/*@Override
	//按照先比较年龄，后比较姓名的方式来比较
	public int compareTo(Person o) {
		int num = this.age - o.age;//先比较年龄，调用的年龄比上存储的年龄
		return num ==0 ? this.name.compareTo(o.name):num;//再比较姓名，如多num即年龄相同就比较姓名
	}
	*/
	/*@Override
	//按照名字先比较，然后比较年龄的方式
	public int compareTo(Person o) {
		int num = this.name.compareTo(o.name);//先比较名字
		return num ==0 ? this.age-o.age:num;//再比较年龄
	}
    */
	@Override
	//按照先比较名字长度再比较名字，最后比较年龄的方式
	public int compareTo(Person o) {
		int length = this.name.length()-o.name.length();//先比较名字长度
		int num = length ==0 ? this.name.compareTo(o.name):length;//再比较名字
		return num ==0 ? this.age-o.age:num;//最后比较年龄
	}
}
