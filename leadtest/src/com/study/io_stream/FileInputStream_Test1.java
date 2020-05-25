package com.study.io_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_Test1 {
//	read()一次读取一个字节 
	public static void main(String[] args) throws IOException {
	    FileInputStream fis = new FileInputStream("abc.txt");//创建输入流对象，关联abc文件
	    int i;
	    while((i = fis.read())!=-1) {//遍历读取文件中的信息
	    	System.out.println(i);
	    }
	    fis.close();

	}

}
