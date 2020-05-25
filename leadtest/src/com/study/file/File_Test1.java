package com.study.file;

import java.io.File;

public class File_Test1 {

	public static void main(String[] args) {
		demo2();
		demo1();

	}

	private static void demo2() {
		String person = "D:\\BaiduNetdiskDownload";
		String child = "GC and Tuning.md";
		File file = new File(person,child);
		System.out.println(file.exists());
	}

	private static void demo1() {
		File file = new File("D:\\BaiduNetdiskDownload\\GC and Tuning.md");
		System.out.println(file.exists());
	}

}
