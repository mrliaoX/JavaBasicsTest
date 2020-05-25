package com.study.io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Case_Test1 {
	/** 在控制台录入文件的路径,将文件拷贝到当前项目下
	 * 
	 * 分析:
	 * 
	 * 1,定义方法对键盘录入的路径进行判断,如果是文件就返回
	 * 2,在主方法中接收该文件
	 * 3,读和写该文件*/
	public static void main(String[] args) throws IOException {
		File file = getFile();//调用getFile方法
		//文件复制
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int i;
		byte[] arr = new byte[1024];
		while ((i = bis.read(arr)) != -1) {
			bos.write(i);
		}
		bis.close();
		bos.close();
		

	}
    //创建一个获取键盘录入并封装成文件对象
	private static File getFile() {
		@SuppressWarnings("resource")//为了消除sc的警告
		Scanner sc = new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入一个路径");
		while (true) {
			String line = sc.nextLine();  //接收录入路径
			File file = new File(line);   //封装成File对象,并对其进行判断
			//路径健状性判断
			if (!file.exists()) {          
				System.out.println("文件路径不存在，重新输入");
			} else if(file.isDirectory()){
                System.out.println("录入的是文件夹路径，请补全路径");
			} else {
				return file;
			}
		}
		
	}

}
