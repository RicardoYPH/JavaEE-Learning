package com.yph.test;

public class HelloAction {
	String message = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String execute() {
		if(message == null || message.matches("[ ]*")) message = "please input the name";
		else message = "hello " + message;
		return "SUCCESS";
	}
}
