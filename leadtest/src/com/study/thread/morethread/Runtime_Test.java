package com.study.thread.morethread;

import java.io.IOException;

public class Runtime_Test {
//	Runtime类是一个单例类
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
//		r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");

	}

}
