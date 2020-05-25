package com.study.io_stream.sequence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sequence_Test1 {
	/*序列流
	* 序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时, 
	将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推.*/
//    案例：将a文件b文件的内容穿到c文件中
	@SuppressWarnings("resource")//消除fis2的警告
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");//创建输入字节流对象关联a.txt
		FileInputStream fis2 = new FileInputStream("b.txt");//创建输入字节流对象关联a.txt
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);//将输入流对象整合到序列 序列流
		FileOutputStream fos = new FileOutputStream("c.txt");//创建输出流对象关联c.txt
		int i;
		while ((i = sis.read()) != -1) {//将序列流中的数据按照顺序读出
			fos.write(i);                //写进c.txt
		}
		sis.close();//关闭流，因为Sequence中实现了对于包含进来的流的关闭流的方法
		fos.close();

	}

}
