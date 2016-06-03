package com.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

public class Judge implements RequestAware{
	private String username;
	private String password;
	Map <String, Object> request;
	
	public String execute() {
		String regex1 = "(.*)[1-9](.*)";
		String regex2 = "(.*)[a-z](.*)";
		String regex3 = "(.*)[A-Z](.*)";
		boolean r1, r2, r3;
		r1 = this.password.matches(regex1);
		r2 = this.password.matches(regex2);
		r3 = this.password.matches(regex3);
//		System.out.println(password);
//		System.err.println(r1 + " " + r2 + " " + r3);
		String result = "密码强度不够，";
		if(r1 && r2 && r3) result = "密码强度足够";
		if (r1 == false) result += "缺少数字";
		if (r2 == false) result += "缺少小写字母";
		if (r3 == false) result += "缺少大写字母";
		request.put("result", result);
		return "success";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = arg0;
		
	}

}
