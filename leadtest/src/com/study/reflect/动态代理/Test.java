package com.study.reflect.��̬����;

import java.lang.reflect.Proxy;

public class Test {
//proxy���invocation�ӿڿ�������һ����̬����
	public static void main(String[] args) {
		StudentImp si = new StudentImp();
		si.login();
		si.submit();
		
		System.out.println("-------------------");
		//������̬������si��̬����
		MyinvocationHandler m = new MyinvocationHandler(si);
		//����proxy�����ڽ��մ��������ɸ�ָ���ĵ��ô������getclass.getclassloader��ȡ�ֽ������ͨ���ֽ�������ȡ���������
		Student s = (Student) Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);
        s.login();
        s.submit();
	}

}
