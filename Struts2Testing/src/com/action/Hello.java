package com.action;


public class Hello {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() {
		if (this.name == null || this.name.equals("")) {
			return "error";
		}
		return "success";
	}

}
