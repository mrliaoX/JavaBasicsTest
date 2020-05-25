package com.study.file;

import java.io.File;

public class File_Test5 {
/*	* A:获取功能
	* public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取路径
	* public String getName():获取名称
	* public long length():获取长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
    * B:案例演示
	* File类的获取功能*/
	public static void main(String[] args) {
		File dir = new File("abc.txt");//E:\eclipse\eclipse-jee-oxygen-R-win32-x86_64\eclipse\eclipse-woekce\leadtest\abc.txt
		System.out.println(dir.getAbsolutePath());//获取绝对路径
		
		File dir2 = new File("abc.txt");//abc.txt
		System.out.println(dir2.getPath());//获取路径
		
		File dir3 = new File("E:\\eclipse\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\eclipse-woekce\\leadtest\\abc.txt");
		System.out.println(dir3.getName());//获取名称
		
		File dir4 = new File("abc.txt");
		System.out.println(dir4.length());//获取长度。字节数
		
		File dir5 = new File("abc.txt");
		System.out.println(dir5.lastModified());
		
		File dir6 = new File("D:\\南大");
		String[] arr = dir6.list();
		for (String string : arr) {
			System.out.println(string);
		}
		
		File dir7 = new File("D:\\南大");
		File[] arr2 = dir7.listFiles();
		for (File string : arr2) {
			System.out.println(string);
		}
		
		
		
	}
}
