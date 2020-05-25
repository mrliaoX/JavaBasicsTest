package com.study.system;

public class SystemTest1 {
	/* public static void gc() ����������
	 public static void exit(int status) �˳�jVM
	 public static long currentTimeMillis()  ��ȡ��ǰʱ��ĺ���ֵ
	 pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)*/ 
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();

	}

	private static void demo4() {//�������Ԫ�ؿ�������һ������
		int[] a = {1,2,3,4,5};
		int[] b = new int[8];
		System.arraycopy(a, 0, b, 0, a.length);  /* ��a�����е�0�±꿪ʼ������������b������
		                                           ��0λ��ճ������������Ϊa����ĳ���*/
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	private static void demo3() { //�����������ʱ�䵥λ����
		long start = System.currentTimeMillis();//��ȡ��ǰʱ��ĺ���ֵ
		for(int i = 0;i < 10000;i++) {
			System.out.println("&");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	private static void demo2() {//�˳�JVM
		System.exit(0);//�˳�JVM
		System.out.println("1111");
	}

	private static void demo1() {//��������
		for(int i = 0; i < 10; i++) {
			new Demo();
			System.gc();
		}
	}

}
class Demo{

	@Override
	protected void finalize(){
		System.out.println("��������ɨ��");
	}
	
}