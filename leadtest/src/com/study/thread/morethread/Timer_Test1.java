package com.study.thread.morethread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_Test1 {
//Timer��һ����ʱ��
	@SuppressWarnings("deprecation")//����date����
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		//��ָ��ʱ�䰲��ָ������
		//��һ������,�ǰ��ŵ�����,�ڶ���������ִ�е�ʱ��(��Ϊ��ǰ���-1900����Ϊ0-11),�����������ǹ��೤ʱ�����ظ�ִ��
		t.schedule(new Mytimer(), new Date(120,3,28,21,29,10), 2000);
		while (true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}

	}

}
class Mytimer extends TimerTask{

	@Override
	public void run() {
		System.out.println("���ˣ�ôô��");
		
	}
	
}