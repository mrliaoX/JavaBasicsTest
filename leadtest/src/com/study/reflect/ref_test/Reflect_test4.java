package com.study.reflect.ref_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;

public class Reflect_test4 {
	/**
	 * * ��֪һ���࣬�������£� 
	 * package cn.itcast.heima;
	 * 		public class DemoClass {
				public void run() {
					System.out.println("welcome to heima!");
				}
			}
	 * (1) дһ��Properties��ʽ�������ļ�����������������ơ� 
	 * (2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬�÷���ķ�ʽ����run������
	 * @throws FileNotFoundException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		�����ļ�����ֱ����Class.forName��ȡ,���Ե���BufferedReader���������ļ��е���Ϣ����forname
		BufferedReader br = new BufferedReader(new FileReader("demo.properties"));
		Class clazz = Class.forName(br.readLine());//��buffere�л�ȡ���ֽ������
		
	    DemoClass dc = (DemoClass) clazz.newInstance();//ͨ���ֽ�����󴴽��µĶ���
		dc.run();

	}

}
