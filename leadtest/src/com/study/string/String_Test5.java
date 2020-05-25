package com.study.string;

public class String_Test5 {
/*	String��ת�����ܣ�
	* byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
	* char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
	* static String valueOf(char[] chs):���ַ�����ת���ַ�����
	* static String valueOf(int i):��int���͵�����ת���ַ�����
		* ע�⣺String���valueOf�������԰��������͵�����ת���ַ���

	* String toLowerCase():���ַ���ת��Сд��(�˽�)
	* String toUpperCase():���ַ���ת�ɴ�д��
	* String concat(String str):���ַ���ƴ�ӡ�*/
	
	//GBK���һ�����Ĵ��������ֽڣ���һ���ֽڿ϶��Ǹ������ڶ����ֽ��п����Ǹ���
	public static void main(String[] args) {
	    demo1();
		demo2();
		demo3();
		demo4();
		
	}

	private static void demo4() {
		String s1 = "abcdEFG";
		String s2 = "ABCDefg";
		String a1 = s1.toLowerCase();//String toLowerCase():���ַ���ת��Сд����ͽ����abcdefg
		String a2 = s2.toUpperCase();//String toUpperCase():���ַ���ת�ɴ�д��������ABCDEFG
		System.out.println("toLowerCase()ȫת����Сд��"+a1+" toUpperCase()ȫת���ɴ�д��"+a2);
	    
		System.out.println(s1+s2);  
		System.out.println(s1.concat(s2));/*����Ľ����һ�µģ�����+�ŵĹ��ܱ�concat�Ĺ���
	                                        ;ԭ����+�ſ����������ַ����������ַ���ƴ��concat���õĺʹ����
	                                       ֻ�����ַ���*/
	}

	private static void demo3() {  /*static String valueOf(char[] chs):���ַ�����ת���ַ�����
		                             static String valueOf(int i):��int���͵�����ת���ַ�����
		                             ע�⣺String���valueOf�������԰��������͵�����ת���ַ���*/
		char[] arr = {'a','b','c'};
	    String s = String.valueOf(arr);//��ΪvalueOf�Ǿ�̬��������ֱ����String . ���á��ײ�����String�๹�췽����ɵ�
        System.out.println(s);//��������abc
        String s2 = String.valueOf(10); //��int ���͵�10 ת�����ַ���10������ȥһ������ʵ�����岻һ��
        System.out.println(s2+10);//��������1010
	}

	private static void demo2() {//char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
		String s2 = "abc";        //�ڶ��ֱ����ַ�����ӡ�ַ����ķ�������һ������charAt����
		char[] a1 = s2.toCharArray();
		for(int i = 0;i < s2.length();i++) {
			System.out.print(a1[i]+" ");
		}
	}

	private static void demo1() {//byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
		String s1 = "abc";
		byte[] a = s1.getBytes();
		for(int i= 0;i<s1.length();i++)
		System.out.println(a[i]); //��������97��98��99
	}

}
