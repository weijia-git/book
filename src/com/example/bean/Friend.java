package com.example.bean;

import java.io.Serializable;

public class Friend implements Serializable {
	private String fname;
	private String finfo;
	private int fpicture;
	
	public Friend() {
		
	}
	
	
	public Friend(String fname, String finfo, int fpicture) {
		super();
		this.fname = fname;
		this.finfo = finfo;
		this.fpicture = fpicture;
	}


	public int getFpicture() {
		return fpicture;
	}


	public void setFpicture(int fpicture) {
		this.fpicture = fpicture;
	}


	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFinfo() {
		return finfo;
	}
	public void setFinfo(String finfo) {
		this.finfo = finfo;
	}
	
}
