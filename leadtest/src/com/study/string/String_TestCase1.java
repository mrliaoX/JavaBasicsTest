package com.study.string;

public class String_TestCase1 {
	/** ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���,�����ַ����ֵĴ�����
	* ABCDEabcd123456!@#$%^*/
	public static void main(String[] args) {
        demo1();
        
	}
	private static void demo1() {
		String s1 = "ABCDEabcd123456!@#$%^";
        int big = 0;
        int small= 0;
        int other = 0;
        int num = 0;
        for(int i = 0;i<s1.length();i++) {
        	char a1 = s1.charAt(i);
        	if ('A'<= a1 &&'Z'>=a1) {
				big++;
			}else if('a'<= a1 && 'z'>=a1){
				small++;
			}else if('0'<= a1 && '9'>=a1){
				num++;
			}else {
				other++;
			}
        }
        System.out.println("��д��ĸ��"+big+" Сд��ĸ��"+small+" ���֣�"+num+" �ַ���"+other);
        return ;
	}
        
}
