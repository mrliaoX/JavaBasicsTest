package com.study.io_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStream_PrintStream_Test2 {
//	���ַ�ʽʵ�ּ���¼��
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();

	}
	//�ڶ��ּ���¼�루�Ƽ���
	private static void demo2() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		sc.close();
	}
    //��һ�м���¼�뷽��ͨ��buffere��ʵ��
	private static void demo1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//InputStreamReaderת����
		String line = br.readLine();
		System.out.println(line);
		br.close();
	}

}
