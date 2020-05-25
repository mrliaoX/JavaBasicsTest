package com.study.io_stream.digui;

import java.io.File;
import java.util.Scanner;

public class Digui_Case1 {
//	 * 需求:1,从键盘接收一个文件夹路径,统计该文件夹大小
/*	分析:
 * 接收路劲:
		1 创建Scanner 接收路径
		2 将键盘结果存储并封装成file对象
		3 判断是否是文件
		4 统计文件大小
		5 将文件路劲对象返回
	计算文件大小
	       统计该文件夹大小 
	    1,定义一个求和变量
	    2,获取该文件夹下所有的文件和文件夹listFiles();
	    3,遍历数组
	    4,判断是文件就计算大小并累加
	    5,判断是文件夹,递归调用*/
	public static void main(String[] args) {
		File file = getFile();
		System.out.println(getFileLength(file));
	}
//	接收路劲:
	public static File getFile() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个路径:");
		while (true) {
			String line = sc.nextLine();
			File file = new File(line);
			if (! file.exists()) {
				System.out.println("路径错误,请输入正确的路径");
			}else if (file.isFile()) {
				System.out.println("路径错误,请输入文件夹路径");
			}else {
				return file;
			}
		}
		
	}
	public static long getFileLength(File file) {
		long len = 0;
		File[] subFile = file.listFiles();
		for (File file2 : subFile) {
			if (file2.isFile()) {
				len = len + file2.length();
			}else {
				len = len + getFileLength(file2);
			}
		}
		return len;
		
	}

}
