package com.study.eunm;
//���󷽷�ʵ�ֵ�eunm����
public enum WeeK3 {
	MON ("��һ"){
		@Override
		public void show() {
			System.out.println("��һ");
		}
	},TUE("�ܶ�") {
		@Override
		public void show() {
			System.out.println("�ܶ�");
		}
	},WED("����") {
		@Override
		public void show() {
			System.out.println("����");
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
