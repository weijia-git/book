package com.example.bean;

import java.io.Serializable;

public class Book implements Serializable {
	private String bname;
	private String binfo;
	private int bpicture;

	public Book() {
		super();
	}

	public Book(String bname, String binfo, int bpicture) {
		super();
		this.bname = bname;
		this.binfo = binfo;
		this.bpicture = bpicture;
	}

	public int getBpicture() {
		return bpicture;
	}

	public void setBpicture(int bpicture) {
		this.bpicture = bpicture;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBinfo() {
		return binfo;
	}

	public void setBinfo(String binfo) {
		this.binfo = binfo;
	}

}
