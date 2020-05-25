package com.study.try_catch;

public class Try_Catch04 {
  /*A:finally的特点
	  被finally控制的语句体一定会执行
	  特殊情况：在执行到finally之前jvm退出了(比如System.exit(0))
    B:finally的作用
	  用于释放资源，在IO流操作和数据库操作中会见到
    C:案例演示
	  finally关键字的特点及作用
	  return结束之前会去看下是否右finally存在，如果有就执行finally，但是finally执行时retrun已经结束了它的生命*/
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("catch执行了");
			System.exit(0);
			return;
			
		}finally {
			System.out.println("finally执行了");
		}
		
		

	}

}
