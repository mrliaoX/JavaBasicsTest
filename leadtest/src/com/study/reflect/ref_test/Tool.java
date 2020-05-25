package com.study.reflect.ref_test;

import java.lang.reflect.Field;

public class Tool {
	//此方法可将obj对象中名为propertyName的属性的值设置为value。
	public void setProperty(Object obj,String propertyName,Object value) throws Exception, SecurityException {
		Class clazz = obj.getClass();//获取字节码对象
		Field filed = clazz.getDeclaredField(propertyName);//暴力反射获取字节码对象
		filed.setAccessible(true);  //去除权限
		filed.set(obj, value);

	}

}
