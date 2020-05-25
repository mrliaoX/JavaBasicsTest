package com.study.thread.morethread;
/*�������ģʽ����֤�����ڴ���ֻ��һ������

  ��α�֤�����ڴ���ֻ��һ�������أ�
	  (1)������Ĵ�������������������������Ķ���private
	  (2)�ڱ����ж���һ������Ķ���Singleton s;
	  (3)�ṩ�����ķ��ʷ�ʽ��  public static Singleton getInstance(){return s}*/
public class Singleton_Test1 {
/*����ʽ������ʽ������
	 1,����ʽ�ǿռ任ʱ��,����ʽ��ʱ�任�ռ�
	 2,�ڶ��̷߳���ʱ,����ʽ���ᴴ���������,������ʽ�п��ܻᴴ���������*/

	public static void main(String[] args) {
		Singlenton s1 = Singlenton.getInstance();
		Singlenton s2 = Singlenton.getInstance();
		System.out.println(s1 == s2);
		
		
		Singlenton1 s3 = Singlenton1.getInstance();
		Singlenton1 s4 = Singlenton1.getInstance();
		System.out.println(s3 == s4);
		
//		System.out.println(s1 == s4);  ������������Ͳ�һ�����ܱȽ�

	}

}
//����ʽ
class Singlenton{
//1,˽�й��췽��,�����಻�ܷ��ʸù��췽����
	private Singlenton() {
		super();
	}
	//��������Ķ���
	private static Singlenton s = new Singlenton(); 
	//�����ṩһ���������ʷ���
	public static Singlenton getInstance() {
		return s; 
		
	}
	
}
//����ʽ
class Singlenton1{
	//1,˽�й��췽��,�����಻�ܷ��ʸù��췽����
	private Singlenton1() {
		super();
	}
	//����һ������
	private static Singlenton1 s;
	//�����ṩһ�����ʷ���
	public static Singlenton1 getInstance() {
		if(s == null) {//�ж�s�Ƿ�Ϊ�գ�Ϊ�վʹ����������
			s = new Singlenton1(); 
		}
		return s;
	}
	 
}
