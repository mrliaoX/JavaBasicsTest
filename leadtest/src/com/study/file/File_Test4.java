package com.study.file;

import java.io.File;

public class File_Test4 {
	/** A:判断功能
	* public boolean isDirectory():判断是否是目录
	* public boolean isFile():判断是否是文件
	* public boolean exists():判断是否存在
	* public boolean canRead():判断是否可读
	* public boolean canWrite():判断是否可写
	* public boolean isHidden():判断是否隐藏
      B:案例演示
	* File类的判断功能*/
	public static void main(String[] args) {
		File dir = new File("abc.txt");
		System.out.println(dir.isDirectory());//判断是否是目录
		File dir1 = new File("aaa");
		System.out.println(dir1.isDirectory());//判断是否是目录
		
		File dir2 = new File("syz.txt");
		System.out.println(dir2.isFile());//判断是否是文件
		
		File dir3 = new File("syz.txt");
		System.out.println(dir3.exists());//判断是否存在
		File dir4 = new File("zzz");
		System.out.println(dir4.exists());//判断是否存在
		
		File dir5 = new File("aaa");
		dir5.setReadable(false);//设置文不可读，但是再windows中默认文件都是可读的
		System.out.println(dir5.canRead());//判断是否可读
		
		File dir6 = new File("abc");
		System.out.println(dir6.canWrite());//判断是否可写
		File dir7 = new File("abc.txt");
		System.out.println(dir7.canWrite());//判断是否可写
		
		File dir8 = new File("abc");
		System.out.println(dir8.isHidden());//判断是否隐藏
	}

}
