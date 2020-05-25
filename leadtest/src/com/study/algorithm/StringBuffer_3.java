package com.study.algorithm;

public class StringBuffer_3 {
	/*StringBuffer的删除功能
		public stringBuffer deleteCharAt (int index) :
		删除指定位置的字符，并返回本身
		public StringBuffer delete(int start, int end) :
		删除从指定位置开始指定位置结束的内容，并返回本身*/
	public static void main(String[] args) {
		demo1();
		demo2();
	}

	private static void demo2() {/*public StringBuffer delete(int start, int end) :
		                删除从指定位置开始指定位置结束的内容，并返回本身*/
		StringBuffer sb2 = new StringBuffer("adidas");
//		sb2.delete(0, sb2.length());清楚缓冲区
        sb2.delete(2, 4);
        System.out.println(sb2);//输出结果为adas 从第2给位置开始删，到第4个位置结束（第4个位置不删）
	}

	private static void demo1() {/*public stringBuffer deleteCharAt (int index) :
		                               删除指定位置的字符，并返回本身*/
		StringBuffer sb1 = new StringBuffer();
/*//		sb1.deleteCharAt(1);当缓冲区没有元素的时候调用deleteCharAt()方法会报错
		        java.lang.StringIndexOutOfBoundsException: String index out of range*/
		sb1.append("nikenb");
		StringBuffer a = sb1.deleteCharAt(1);
		System.out.println(a);//输出结果为nkenb
	}

}
