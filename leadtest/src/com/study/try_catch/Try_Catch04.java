package com.study.try_catch;

public class Try_Catch04 {
  /*A:finally���ص�
	  ��finally���Ƶ������һ����ִ��
	  �����������ִ�е�finally֮ǰjvm�˳���(����System.exit(0))
    B:finally������
	  �����ͷ���Դ����IO�����������ݿ�����л����
    C:������ʾ
	  finally�ؼ��ֵ��ص㼰����
	  return����֮ǰ��ȥ�����Ƿ���finally���ڣ�����о�ִ��finally������finallyִ��ʱretrun�Ѿ���������������*/
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("catchִ����");
			System.exit(0);
			return;
			
		}finally {
			System.out.println("finallyִ����");
		}
		
		

	}

}
