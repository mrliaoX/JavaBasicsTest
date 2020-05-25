package com.study.reflect.动态代理;

public class StudentImp implements Student {

	@Override
	public void login() {
		System.out.println("登入");
	}

	@Override
	public void submit() {
		System.out.println("提交");

	}

}
