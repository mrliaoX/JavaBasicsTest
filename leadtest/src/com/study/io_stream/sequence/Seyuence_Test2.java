package com.study.io_stream.sequence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Seyuence_Test2 {
//	序列流整合多个,将多个流整合到序列流
	/*案例：将abcd文件的内容传入e
	要用到vector 和enumeration*/
	public static void main(String[] args) throws IOException {
		/*File file = new File("e.txt");
		System.out.println(file.createNewFile());*/
		FileInputStream fis1 = new FileInputStream("a.txt");	//创建输入流对象,关联a.txt
		FileInputStream fis2 = new FileInputStream("b.txt");	//创建输入流对象,关联b.txt
		FileInputStream fis3 = new FileInputStream("c.txt");  //创建输入流对象,关联c.txt
		FileInputStream fis4 = new FileInputStream("d.txt");  //创建输入流对象,关联c.txt
		Vector<InputStream> v = new Vector<>();  //创建vector集合对象
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		v.add(fis4);
		Enumeration<InputStream> e = v.elements();//获取梅举引用
		SequenceInputStream sis = new SequenceInputStream(e);//传递给SequenceInputStream构造
		FileOutputStream fos = new FileOutputStream("e.txt");//创建输出流对象,关联e.txt
		int i;
		while ((i = sis.read())!= -1) {
			fos.write(i);
		}
		sis.close();
		fos.close();

	}

}
