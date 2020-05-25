package com.study.system;

public class SystemTest1 {
	/* public static void gc() 垃圾回收器
	 public static void exit(int status) 退出jVM
	 public static long currentTimeMillis()  获取当前时间的毫秒值
	 pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)*/ 
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();

	}

	private static void demo4() {//将数组的元素拷贝到另一个数组
		int[] a = {1,2,3,4,5};
		int[] b = new int[8];
		System.arraycopy(a, 0, b, 0, a.length);  /* 从a数组中的0下标开始拷贝，拷贝到b数组中
		                                           从0位置粘贴，拷贝长度为a数组的长度*/
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	private static void demo3() { //计算程序运行时间单位毫秒
		long start = System.currentTimeMillis();//获取当前时间的毫秒值
		for(int i = 0;i < 10000;i++) {
			System.out.println("&");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

	private static void demo2() {//退出JVM
		System.exit(0);//退出JVM
		System.out.println("1111");
	}

	private static void demo1() {//垃圾回收
		for(int i = 0; i < 10; i++) {
			new Demo();
			System.gc();
		}
	}

}
class Demo{

	@Override
	protected void finalize(){
		System.out.println("垃圾被清扫了");
	}
	
}