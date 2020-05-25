package com.study.file;

import java.io.File;
import java.io.FilenameFilter;

public class File_Test6 {
	/** A:案例演示
	* 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称*/
	public static void main(String[] args) {
		//方法一
		File file = new File("E:\\");//先把E盘封装成对象
		String[] arr = file.list();//获取E盘下的文件名
		for (String string : arr) {//遍历获取的文件名
			if(string.endsWith(".jpg")) {//endsWith是判断尾部是否包含XXX
				System.out.println(string);
			}
		}
		//方法二 开发中常用
		File dir = new File("E:\\");
		File[] arr2 = dir.listFiles();
		for (File file2 : arr2) {
			if(file2.isFile() && file2.getName().endsWith(".jpg")) {
				System.out.println(file2);
			}
		}
		//方法三通过file过滤器解决，好处是不用遍历数组
		String[] arr3 = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				File file = new File(dir,name);
				
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
		for (String string : arr3) {
			System.out.println(string);
		}

	}

}
