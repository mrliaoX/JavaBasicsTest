package com.study.io_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStream_PrintStream_Test2 {
//	两种方式实现键盘录入
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();

	}
	//第二种键盘录入（推荐）
	private static void demo2() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		sc.close();
	}
    //第一中键盘录入方法通过buffere来实现
	private static void demo1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//InputStreamReader转换流
		String line = br.readLine();
		System.out.println(line);
		br.close();
	}

}
