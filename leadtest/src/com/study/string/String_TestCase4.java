package com.study.string;

public class String_TestCase4 {
	/*案例演示
	* 需求：把数组中的数据按照指定个格式拼接成一个字符串
		* 举例：
			* int[] arr = {1,2,3};	
		* 输出结果：
			* "[1, 2, 3]"*/
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s = "[";
		for(int i = 0;i<arr.length;i++) {  //循环遍历出数组中的数
			if(i == arr.length-1) {         //判断什么时候结尾＋上 ]
				s = s + arr[i]+"]";
			}else {
				s = s+arr[i]+", ";
			}
			
		}
        System.out.println(s);
	}

}
