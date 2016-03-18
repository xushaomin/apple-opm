package com.appleframework.opm.model;

public enum EnvType {
	
	DEV("开发环境", 1),
	TEST("测试环境", 2),
	DEMO("预发布环境", 3),
	RELEASE("正式环境", 4);
	
	// 成员变量
	private String name;
	private int index;

	// 构造方法
	private EnvType(String name, int index) {
		this.name = name;
		this.index = index;
	}
	
	// 普通方法
	public static String getName(int index) {
		for (EnvType c : EnvType.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
