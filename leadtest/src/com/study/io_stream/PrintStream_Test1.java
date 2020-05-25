package com.study.io_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStream_Test1 {
	/*ʲô�Ǵ�ӡ��
	* �������Ժܷ���Ľ������toString()������, �����Զ����ϻ���, ���ҿ���ʹ���Զ�ˢ����ģʽ
	* System.out����һ��PrintStream, ��Ĭ�������̨�����Ϣ
	* ʹ�÷�ʽ
	* ��ӡ: print(), println()
	* �Զ�ˢ��: PrintWriter(OutputStream out, boolean autoFlush, String encoding) 
	* ��ӡ��ֻ��������Ŀ��*/
	public static void main(String[] args) throws IOException {
		demo1();

		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"), true);
		pw.println(65);
		pw.println("���");	//�Զ�ˢ��,ֻ��Ե���println����
		pw.print("��Һ�");
		pw.close();
							

	}

	private static void demo1() {
		PrintStream ps = System.out;
		ps.println(65);
		ps.println("A");
		ps.println(new Person("����", 23));
		Person p = null;
		ps.println(p);					//�����null,�ͷ���null,�������null,�͵��ö����toString()
	}

}
