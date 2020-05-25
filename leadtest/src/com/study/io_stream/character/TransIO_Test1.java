package com.study.io_stream.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


public class TransIO_Test1 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		demo1();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"),"uTf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));
		int i;
		while ((i = br.read())!= -1) {
			bw.write(i);
		}
		br.close();
		bw.close();
	}

	private static void demo1() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "uTf-8");	//指定码表读字符
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");	//指定码表写字符
        int i;
        while ((i = isr.read())!= -1) {
			osw.write(i);
		}
        isr.close();
        osw.close();
	}

}
