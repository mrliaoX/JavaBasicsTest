package com.study.plan_model;

public class Plan_model {
//���������ģʽ   ˼��ѷ����������Ȼ��ͨ�����෽��ʵ��
//	����ʵ��һ�� ����һ���������е�ʱ�� ������
	public static void main(String[] args) {
		Demo d = new Demo();//����demo����ͨ��demo���ø��෽��
		System.out.println(d.getTime());

	}

}
//��ȡһ�������࣬������ʵ�ּ���ʱ�����
abstract class GetTime{
	//һ������ʱ��ķ���
	public final long getTime() {
		//currentTimeMillis�Ǽ�¼��������ʱ����һ�̵�ʱ��
		long start = System.currentTimeMillis();//��¼��ʼʱ��ʱ��
		code();
		long end = System.currentTimeMillis();//��¼����ʱ��ʱ��
		return end - start;
	}
	public abstract void code();

}
//�����еĳ����ȡ��һ���࣬����ֻ��Ҫ�������Ϳ���ʵ�ּ��㲻ͬ�ĳ�������ʱ��
class Demo extends GetTime{
	
	public void code() {
		int i = 0;
		while (i<10000) {
			System.out.println("a");
			i++;
		}
	}
}