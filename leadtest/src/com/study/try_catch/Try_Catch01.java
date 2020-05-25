package com.study.try_catch;

public class Try_Catch01 {
	/*异常处理的两种方式
	   try…catch…finally
		  try catch
		  try catch finally
		  try finally 
	   throws //将问题抛出
    try...catch处理异常的基本格式
	  try…catch…finally
   案例演示
	  try...catch的方式处理1个异常*/
	public static void main(String[] args) {
		try {
			String[] arr = {};
			System.out.println(arr[0]);
		} catch (ArrayIndexOutOfBoundsException e) {  //数组越界异常
			System.out.println("出错了");
		}
		
		

	}

}
