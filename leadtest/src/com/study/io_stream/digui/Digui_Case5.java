package com.study.io_stream.digui;

public class Digui_Case5 {
	 /*��������
		* ���µô���Ԫ1202��˵�𣬻�˵��һλ��������꣬����쳲�������
		* ������һ�������������һ����Ȥ�����⣺����һ�Ըճ�����С��һ���º���ܳ��ɴ��ã��ٹ�һ���¾�������һ��С�ã����Ҵ˺�ÿ���¶���һ��С�ã�һ����û�з���������
		* �ʣ�һ�Ըճ��������ӣ�һ���ڷ�ֳ�ɶ��ٶ�����?*/
	public static void main(String[] args) {
		int num = fun(8);
		System.out.println(num);

	}
    //쳲����ݹ鷽��
	private static int fun(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}else {
			return fun(i-1)+fun(i-2);
		}
		
		
	}

}
