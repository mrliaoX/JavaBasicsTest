package com.study.algorithm;

public class StringBuffer_4 {
	/*StringBuffer的替换功能
		public StringBuffer replace(int start,int end, string str) :
		从start开始到end用str替换
	StringBuffer的反转功能.
		public StringBuffer reverse() :
		杠字符串反转*/
	public static void main(String[] args) {
		demo1();
		demo2();

	}
	private static void demo2() {/*public StringBuffer reverse() :
		                           杠字符串反转*/
		StringBuffer sb2 = new StringBuffer();
		sb2.append("abcde");
		StringBuffer a = sb2.reverse();
		System.out.println(a);
	}
	private static void demo1() {/*public StringBuffer replace(int start,int end, string str) :
		                            从start开始到end用str替换*/
		StringBuffer sb1 = new StringBuffer("wahahanb");
		sb1.replace(0, 6, "wo");//从0开始到6结束不包含6
		System.out.println(sb1);
	}

}
