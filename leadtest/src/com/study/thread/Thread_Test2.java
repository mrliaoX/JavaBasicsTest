package com.study.thread;

public class Thread_Test2 {
//	多线程程序实现的方式2
   /* 实现Runnable
	* 定义类实现Runnable接口
	* 实现run方法
	* 把新线程要做的事写在run方法中
	* 创建自定义的Runnable的子类对象
	* 创建Thread对象, 传入Runnable
	* 调用start()开启新线程, 内部会自动调用Runnable的run()方法*/
	
	/*继承Thread
	* 好处是:可以直接使用Thread类中的方法,代码简单
	* 弊端是:如果已经有了父类,就不能用这种方法*/
/*	实现Runnable接口
	* 好处是:即使自己定义的线程类有了父类也没关系,因为有了父类也可以实现接口,而且接口是可以多实现的
	* 弊端是:不能直接使用Thread中的方法需要先获取到线程对象后,才能得到Thread的方法,代码复杂*/
	
	/** a.继承Thread : 由于子类重写了Thread类的run(), 当调用start()时, 直接找子类的run()方法
	* b.实现Runnable : 构造函数中传入了Runnable的引用, 成员变量记住了它, 
        start()调用run()方法时内部判断成员变量Runnable的引用是否为空, 
	    不为空编译时看的是Runnable的run(),运行时执行的是子类的run()方法*/
	public static void main(String[] args) {
		Myrunnable m = new Myrunnable();//创建自定义的Runnable的子类对象
		Thread t = new Thread(m);//创建Thread对象, 传入Runnable
		t.start();//调用start()开启新线程, 内部会自动调用Runnable的run()方法
		for (int i = 0; i < 100; i++) {
			System.out.println("main线程执行了");
		}

	}

}
class Myrunnable implements Runnable{//实现Runnable 定义类实现Runnable接口

	@Override
	public void run() {//实现run方法
		for(int i = 0;i < 100 ;i++) {//把新线程要做的事写在run方法中
			System.out.println("尼玛ruannable也执行了");
		}
		
	}
	
}