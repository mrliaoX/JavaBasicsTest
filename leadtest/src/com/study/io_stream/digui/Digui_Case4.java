package com.study.io_stream.digui;

import java.io.File;

public class Digui_Case4 {
	/*需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印, 例如:
		   把文件夹中的所有文件以及文件夹的名字按层级打印
		   分析：
		       1 接收所有的文件夹和文件，返回给File数组中
		       2 遍历数组
		       3 无论是文件还是文件夹，都需要打印
		       4 如果是文件夹调用递归*/
	public static void main(String[] args) {
	    File file = Digui_Case1.getFile();
	    printlev(file);
	    printlev2(file,0);

	}

	private static void printlev2(File file,int lev) {
//		 1 接收所有的文件夹和文件，返回给File数组中
		File[] arr = file.listFiles();
//		2 遍历数组
		for (File subfile : arr) {
			//让打印文件夹更有层次感，即每一级之间有空格
			for (int i = 0; i <= lev; i++) {
				System.out.print("\t");
			}
//			3 无论是文件还是文件夹，都需要打印
			System.out.println(subfile);
//			 4 如果是文件夹调用递归
			if ((subfile.isDirectory())) {
				printlev2(subfile,++lev);
			}
		}
		
		
	}

	private static void printlev(File file) {
//		 1 接收所有的文件夹和文件，返回给File数组中
		File[] arr = file.listFiles();
//		2 遍历数组
		for (File subfile : arr) {
//			3 无论是文件还是文件夹，都需要打印
			System.out.println(subfile);
//			4 如果是文件夹调用递归
			if ((subfile.isDirectory())) {
				printlev(subfile);
			}
		}
		
	}

}
