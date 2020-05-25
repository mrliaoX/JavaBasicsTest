package com.study.reflect.动态代理;

import java.lang.reflect.Proxy;

public class Test {
//proxy类和invocation接口可以生成一个动态代理
	public static void main(String[] args) {
		StudentImp si = new StudentImp();
		si.login();
		si.submit();
		
		System.out.println("-------------------");
		//创建动态代理，将si动态代理
		MyinvocationHandler m = new MyinvocationHandler(si);
		//创建proxy类用于接收代理，并分派给指定的调用处理程序。getclass.getclassloader获取字节码对象并通过字节码对象获取类加载器，
		Student s = (Student) Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);
        s.login();
        s.submit();
	}

}
