package com.study.algorithm;

public class StringBuffer_3 {
	/*StringBuffer��ɾ������
		public stringBuffer deleteCharAt (int index) :
		ɾ��ָ��λ�õ��ַ��������ر���
		public StringBuffer delete(int start, int end) :
		ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���*/
	public static void main(String[] args) {
		demo1();
		demo2();
	}

	private static void demo2() {/*public StringBuffer delete(int start, int end) :
		                ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���*/
		StringBuffer sb2 = new StringBuffer("adidas");
//		sb2.delete(0, sb2.length());���������
        sb2.delete(2, 4);
        System.out.println(sb2);//������Ϊadas �ӵ�2��λ�ÿ�ʼɾ������4��λ�ý�������4��λ�ò�ɾ��
	}

	private static void demo1() {/*public stringBuffer deleteCharAt (int index) :
		                               ɾ��ָ��λ�õ��ַ��������ر���*/
		StringBuffer sb1 = new StringBuffer();
/*//		sb1.deleteCharAt(1);��������û��Ԫ�ص�ʱ�����deleteCharAt()�����ᱨ��
		        java.lang.StringIndexOutOfBoundsException: String index out of range*/
		sb1.append("nikenb");
		StringBuffer a = sb1.deleteCharAt(1);
		System.out.println(a);//������Ϊnkenb
	}

}
