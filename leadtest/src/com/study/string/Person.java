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
	��compareTo��������0��ʱ�򼯺���ֻ��-��Ԫ��
    ��compareTo��������������ʱ�򼯺ϻ���ô�����ôȡ
    ��compareTo�������ظ�����ʱ�򼯺ϻᵹ��洢
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 1;
	}*/
	/*@Override
	//�����ȱȽ����䣬��Ƚ������ķ�ʽ���Ƚ�
	public int compareTo(Person o) {
		int num = this.age - o.age;//�ȱȽ����䣬���õ�������ϴ洢������
		return num ==0 ? this.name.compareTo(o.name):num;//�ٱȽ����������num��������ͬ�ͱȽ�����
	}
	*/
	/*@Override
	//���������ȱȽϣ�Ȼ��Ƚ�����ķ�ʽ
	public int compareTo(Person o) {
		int num = this.name.compareTo(o.name);//�ȱȽ�����
		return num ==0 ? this.age-o.age:num;//�ٱȽ�����
	}
    */
	@Override
	//�����ȱȽ����ֳ����ٱȽ����֣����Ƚ�����ķ�ʽ
	public int compareTo(Person o) {
		int length = this.name.length()-o.name.length();//�ȱȽ����ֳ���
		int num = length ==0 ? this.name.compareTo(o.name):length;//�ٱȽ�����
		return num ==0 ? this.age-o.age:num;//���Ƚ�����
	}
}
