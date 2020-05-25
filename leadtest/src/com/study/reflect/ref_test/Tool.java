package com.study.reflect.ref_test;

import java.lang.reflect.Field;

public class Tool {
	//�˷����ɽ�obj��������ΪpropertyName�����Ե�ֵ����Ϊvalue��
	public void setProperty(Object obj,String propertyName,Object value) throws Exception, SecurityException {
		Class clazz = obj.getClass();//��ȡ�ֽ������
		Field filed = clazz.getDeclaredField(propertyName);//���������ȡ�ֽ������
		filed.setAccessible(true);  //ȥ��Ȩ��
		filed.set(obj, value);

	}

}
