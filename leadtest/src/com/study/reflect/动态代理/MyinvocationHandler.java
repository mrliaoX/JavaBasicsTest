package com.study.reflect.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyinvocationHandler implements InvocationHandler {
	private Object traget;
	//使用动态代理，实现一个权限校验和日志记录
	public MyinvocationHandler(Object traget) {
		this.traget = traget;
	}
	//处理代理实例上的方法调用并返回结果。args是返回的结果，menthod调用的方法， 
	public Object invoke(Object proxy,Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("权限校验");
		method.invoke(traget, args);//执行被代理target对象的方法
		System.out.println("日志记录");
		return null;

	}

}
