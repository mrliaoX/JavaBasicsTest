package com.study.try_catch;

public class Try_Catch03 {
	 /*A:throws�ķ�ʽ�����쳣
		* ���幦�ܷ���ʱ����Ҫ�ѳ��ֵ����Ⱪ¶�����õ�����ȥ����
		* ��ô��ͨ��throws�ڷ����ϱ�ʶ��
	   B:������ʾ
		* �����ֱ���ʾ����ʱ�쳣������ʱ�쳣���׳�
		  ����ʱ�쳣���׳������������д���
		  ����ʱ�쳣���׳������Դ�����Բ�����*/
	public static void main(String[] args) throws Exception {//���쳣��������
		Person p = new Person();
		p.setAge(-18);
		System.out.println(p.getAge());

	}
	

}
class Person{
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
	public void setAge(int age) throws AgeOutOfBoundsException{
		if (age > 0 && age <= 150) {
			this.age = age;
		}else {
			throw new AgeOutOfBoundsException("����Ƿ�");// ���쳣���򷽷���
		}
		
	}
	
}