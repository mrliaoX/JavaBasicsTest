package com.study.reflect.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyinvocationHandler implements InvocationHandler {
	private Object traget;
	//ʹ�ö�̬����ʵ��һ��Ȩ��У�����־��¼
	public MyinvocationHandler(Object traget) {
		this.traget = traget;
	}
	//�������ʵ���ϵķ������ò����ؽ����args�Ƿ��صĽ����menthod���õķ����� 
	public Object invoke(Object proxy,Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("Ȩ��У��");
		method.invoke(traget, args);//ִ�б�����target����ķ���
		System.out.println("��־��¼");
		return null;

	}

}
