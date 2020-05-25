package com.study.algorithm;

public class StringBuffer_5 {
    /*StringBuffer的截取功能
	    public String substring(int start) :
		从指定位置截取到末尾
		public string substring(int start,int end) :
		截取从指定位置开始到结束位置，包括开始位置,不包括结束位置
		注意事项
		注意:返回值类型不再是stringBuffer本身*/
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefg");	
		System.out.println(sb.substring(1)); //从指定位置截取到末尾
		System.out.println(sb.substring(2, 6));/*截职从指定位置开始到结束位置，
		                                        包括开始位置,不包括结束位置*/

	}

}
