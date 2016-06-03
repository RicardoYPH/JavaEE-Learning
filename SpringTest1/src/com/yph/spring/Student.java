package com.yph.spring;

public class Student {
	private int sid;
	@Override
	public String toString() {
		System.out.println("hello world");
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
