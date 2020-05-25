package com.study.eunm;
//抽象方法实现的eunm方法
public enum WeeK3 {
	MON ("周一"){
		@Override
		public void show() {
			System.out.println("周一");
		}
	},TUE("周二") {
		@Override
		public void show() {
			System.out.println("周二");
		}
	},WED("周三") {
		@Override
		public void show() {
			System.out.println("周三");
		}
	};
	private String name;

	private WeeK3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public abstract void show();
}
