package com.study.eunm;

public class Eunm_test2 {
	/*枚举常用方法
	 * int ordinal()
	* int compareTo(E o)
	* String name()
	* String toString()
	* <T> T valueOf(Class<T> type,String name)
	* values() 
	* 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
	 */
	public static void main(String[] args) {
		demo1();
		Week2 mon = Week2.valueOf(Week2.class,"MON");//通过字节码对象获取枚举项
		System.out.println(mon);
		
		Week2[] arr = Week2.values();//遍历枚举类的所有枚举值非常方便
		for (Week2 week2 : arr) {
			System.out.println(week2);
		}

	}

	private static void demo1() {
		WeeK3 m = WeeK3.MON;
		WeeK3 t = WeeK3.TUE;
		WeeK3 w = WeeK3.WED;
		
		System.out.println(m.ordinal());//枚举项都是有编号的
		System.out.println(t.ordinal());
		System.out.println(w.ordinal());
		//比较的是编号
		System.out.println(m.compareTo(t));//0和1比
		System.out.println(m.compareTo(w));//0和2比
		
		System.out.println(m.name());//获取实例名称
		System.out.println(m.toString());//调用重写之后的toString方法
	}

}
