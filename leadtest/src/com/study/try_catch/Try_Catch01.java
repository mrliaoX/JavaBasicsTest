package com.study.try_catch;

public class Try_Catch01 {
	/*�쳣��������ַ�ʽ
	   try��catch��finally
		  try catch
		  try catch finally
		  try finally 
	   throws //�������׳�
    try...catch�����쳣�Ļ�����ʽ
	  try��catch��finally
   ������ʾ
	  try...catch�ķ�ʽ����1���쳣*/
	public static void main(String[] args) {
		try {
			String[] arr = {};
			System.out.println(arr[0]);
		} catch (ArrayIndexOutOfBoundsException e) {  //����Խ���쳣
			System.out.println("������");
		}
		
		

	}

}
