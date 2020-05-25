package com.study.io_stream.digui;

import java.io.File;

public class Digui_Case2 {
	/** 需求:2,从键盘接收一个文件夹路径,删除该文件夹
	 * 
	 * 删除该文件夹
	 * 分析:
	 * 1,获取该文件夹下的所有的文件和文件夹
	 * 2,遍历数组
	 * 3,判断是文件直接删除
	 * 4,如果是文件夹,递归调用
	 * 5,循环结束后,把空文件夹删掉
	 */
	public static void main(String[] args) {
		File file = Digui_Case1.getFile();
		deleteFile(file);

	}

	private static void deleteFile(File file) {
		File[] subFile = file.listFiles();
		for (File file2 : subFile) {
			if (file2.isFile()) {
				file2.delete();
			} else {
				deleteFile(file2);

			}
		}
		file.delete();
	}

}
