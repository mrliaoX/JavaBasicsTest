package com.study.string;

public class String_TestCase4 {
	/*������ʾ
	* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
		* ������
			* int[] arr = {1,2,3};	
		* ��������
			* "[1, 2, 3]"*/
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s = "[";
		for(int i = 0;i<arr.length;i++) {  //ѭ�������������е���
			if(i == arr.length-1) {         //�ж�ʲôʱ���β���� ]
				s = s + arr[i]+"]";
			}else {
				s = s+arr[i]+", ";
			}
			
		}
        System.out.println(s);
	}

}
