package com.study.eunm;

public enum Week2 {
	//有参构造的eunm方法
	MON("周一"),TUE("周二"),WED("周三");
	private String name;

	private Week2(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}	
	public String toString() {
		return name;
	}
	

}
