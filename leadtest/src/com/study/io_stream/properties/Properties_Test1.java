package com.study.io_stream.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Properties_Test1 {
	 /* A:Properties�ĸ���
	  Properties ���ʾ��һ���־õ����Լ� ����person���ֵ����ԡ�
	  Properties �ɱ��������л�����м��ء�
	  �����б���ÿ���������Ӧֵ����һ���ַ����� 
      B:������ʾ
	  Properties��ΪMap���ϵ�ʹ��*/
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));//����  config.propertiesΪ�����ļ�
		prop.setProperty("tel", "12345678900");//����
		prop.store(new FileOutputStream("config.properties"), null);//���
		System.out.println(prop);

	}
	//����properties���ֵ�����
	@SuppressWarnings("unchecked")
	private static void demo2() {
		Properties prop = new Properties();
		prop.setProperty("name", "����");
		prop.setProperty("tel", "18912345678");
		
//		System.out.println(prop);//�õ�һ����¼������������绰
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
		while(en.hasMoreElements()) {  //�õ�������¼�ֱ��������͵绰
			String key = en.nextElement();				//��ȡProperties�е�ÿһ����
			String value = prop.getProperty(key);		//���ݼ���ȡֵ
			System.out.println(key + "="+ value);
		}
	}
//    �����ݴ���properties��
	private static void demo1() {
		Properties p = new Properties();
		p.put("a", 1);
		System.out.println(p);
	}

}
