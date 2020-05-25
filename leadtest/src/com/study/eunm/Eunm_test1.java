package com.study.eunm;
/*枚举的注意事项：1、定义枚举要用eunm
                2、所有枚举都是eunm的子类
                3、枚举类的第一行必须是枚举项
                4、枚举可以有构造器 但是必须是私有的
                5、枚举可以抽象成方法，但是枚举必须重写该方法
                6、枚举在switch语句中使用*/
public class Eunm_test1 {
    public static void main(String[] args) {
    	demo1();
    	demo2();
    	demo3();
    	WeeK3 w = WeeK3.MON;
    	switch (w) {
		case MON:
			System.out.println("星期一");
			break;
		case TUE:
			System.out.println("星期二");

		default:
			break;
		}
	}
//    调用抽象方法的enum
	private static void demo3() {
		WeeK3 w = WeeK3.WED;
    	w.show();
	}
//    调用有参构造的enum
	private static void demo2() {
		Week2 t = Week2.TUE;
    	System.out.println(t.getName());
	}
//调用空参构造的eunm
	private static void demo1() {
		WeeK m = WeeK.MON;
    	System.out.println(m);
	}
    
}
