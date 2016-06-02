package com.entities;

public class Student {
	private int sid;
	private String sname;
	private String ssex;
	private int sage;
	private String stelnum;
	private String shobit;
	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", ssex=" + ssex + ", sage=" + sage + ", stelnum=" + stelnum
				+ ", shobit=" + shobit + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getStelnum() {
		return stelnum;
	}
	public void setStelnum(String stelnum) {
		this.stelnum = stelnum;
	}
	public String getShobit() {
		return shobit;
	}
	public void setShobit(String shobit) {
		this.shobit = shobit;
	}
	
	
}
