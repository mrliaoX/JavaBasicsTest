package com.study.io_stream.digui;

public class Digui {
//	File��(�ݹ�) �������ϵĵ�������
	public static void main(String[] args) {
		int i = fun(5);
		System.out.println(i);

	}
    //����һ���ײ㷽��
	private static int fun(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * fun(num - 1);
		}
		
	}

}
