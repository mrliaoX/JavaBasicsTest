package com.study.eunm;
/*ö�ٵ�ע�����1������ö��Ҫ��eunm
                2������ö�ٶ���eunm������
                3��ö����ĵ�һ�б�����ö����
                4��ö�ٿ����й����� ���Ǳ�����˽�е�
                5��ö�ٿ��Գ���ɷ���������ö�ٱ�����д�÷���
                6��ö����switch�����ʹ��*/
public class Eunm_test1 {
    public static void main(String[] args) {
    	demo1();
    	demo2();
    	demo3();
    	WeeK3 w = WeeK3.MON;
    	switch (w) {
		case MON:
			System.out.println("����һ");
			break;
		case TUE:
			System.out.println("���ڶ�");

		default:
			break;
		}
	}
//    ���ó��󷽷���enum
	private static void demo3() {
		WeeK3 w = WeeK3.WED;
    	w.show();
	}
//    �����вι����enum
	private static void demo2() {
		Week2 t = Week2.TUE;
    	System.out.println(t.getName());
	}
//���ÿղι����eunm
	private static void demo1() {
		WeeK m = WeeK.MON;
    	System.out.println(m);
	}
    
}
