package com.study.io_stream.character;

public class Interface_Test1 {
/*	װ�����ģʽ�ĺô���:
		 * ����Բ�ǿ,��װ�ε���ı仯��װ����ı仯�޹�*/
	public static void main(String[] args) {
		Edstudent e = new Edstudent(new Student());
		e.code();

	}

}
interface Coder{
	public void code();
}
class Student implements Coder{

	@Override
	public void code() {
		System.out.println("javaSE");
		System.out.println("MySql");
		System.out.println("���ݽṹ���㷨");
		
	}
	
}
class Edstudent implements Coder{
	//1,��ȡ��װ���������
	private Student s;
	//2,�ڹ��췽���д��뱻װ����Ķ���
	public Edstudent(Student s) {
		this.s = s;
	}
	@Override
	public void code() {
		s.code();
		System.out.println("SSH");
		System.out.println("Spring");
		System.out.println("���ݿ�");
		System.out.println("�ֲ�ʽ");
		
	}
	
}
