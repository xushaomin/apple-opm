package com.appleframework.opm.model;

public enum SideType {
	
	IN("内部", 1),
	OUT("外部", 2);
	
	// 成员变量
	private String name;
	private int index;

	// 构造方法
	private SideType(String name, int index) {
		this.name = name;
		this.index = index;
	}
	
	// 普通方法
	public static String getName(int index) {
		for (SideType c : SideType.values()) {
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
