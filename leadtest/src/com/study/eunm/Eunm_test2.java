package com.study.eunm;

public class Eunm_test2 {
	/*ö�ٳ��÷���
	 * int ordinal()
	* int compareTo(E o)
	* String name()
	* String toString()
	* <T> T valueOf(Class<T> type,String name)
	* values() 
	* �˷�����Ȼ��JDK�ĵ��в��Ҳ�������ÿ��ö���඼���и÷�����������ö���������ö��ֵ�ǳ�����
	 */
	public static void main(String[] args) {
		demo1();
		Week2 mon = Week2.valueOf(Week2.class,"MON");//ͨ���ֽ�������ȡö����
		System.out.println(mon);
		
		Week2[] arr = Week2.values();//����ö���������ö��ֵ�ǳ�����
		for (Week2 week2 : arr) {
			System.out.println(week2);
		}

	}

	private static void demo1() {
		WeeK3 m = WeeK3.MON;
		WeeK3 t = WeeK3.TUE;
		WeeK3 w = WeeK3.WED;
		
		System.out.println(m.ordinal());//ö������б�ŵ�
		System.out.println(t.ordinal());
		System.out.println(w.ordinal());
		//�Ƚϵ��Ǳ��
		System.out.println(m.compareTo(t));//0��1��
		System.out.println(m.compareTo(w));//0��2��
		
		System.out.println(m.name());//��ȡʵ������
		System.out.println(m.toString());//������д֮���toString����
	}

}
