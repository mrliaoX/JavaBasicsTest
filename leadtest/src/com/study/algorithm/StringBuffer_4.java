package com.study.algorithm;

public class StringBuffer_4 {
	/*StringBuffer���滻����
		public StringBuffer replace(int start,int end, string str) :
		��start��ʼ��end��str�滻
	StringBuffer�ķ�ת����.
		public StringBuffer reverse() :
		���ַ�����ת*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	private static void demo2() {/*public StringBuffer reverse() :
		                           ���ַ�����ת*/
		StringBuffer sb2 = new StringBuffer();
		sb2.append("abcde");
		StringBuffer a = sb2.reverse();
		System.out.println(a);
	}
	private static void demo1() {/*public StringBuffer replace(int start,int end, string str) :
		                            ��start��ʼ��end��str�滻*/
		StringBuffer sb1 = new StringBuffer("wahahanb");
		sb1.replace(0, 6, "wo");//��0��ʼ��6����������6
		System.out.println(sb1);
	}

}
