package com.study.try_catch;

public class Try_Catch02 {
/*Throwable�ļ�����������
	  a:getMessage()
		* ��ȡ�쳣��Ϣ�������ַ�����
	  b:toString()
		* ��ȡ�쳣�������쳣��Ϣ�������ַ�����
	  c:printStackTrace()
		* ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
  ������ʾ
	  Throwable�ļ������������Ļ���ʹ��*/

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) { //�൱��Exception e = new ArithmeticException();
			System.out.println(e.getMessage());//��ȡ�쳣��Ϣ�������ַ�����
			System.out.println(e.toString());//��ȡ�쳣�������쳣��Ϣ�������ַ�����
			e.printStackTrace();//��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid��
		}

	}

}
