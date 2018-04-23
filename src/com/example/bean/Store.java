package com.example.bean;

import java.io.Serializable;

public class Store implements Serializable {
	private String storeName;
	private String storeAddr;
	private String star;
	private int spicture;

	public Store() {
		super();
	}

	public Store(String storeName, String storeAddr, String star, int spicture) {
		super();
		this.storeName = storeName;
		this.storeAddr = storeAddr;
		this.star = star;
		this.spicture = spicture;
	}

	public int getSpicture() {
		return spicture;
	}

	public void setSpicture(int spicture) {
		this.spicture = spicture;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddr() {
		return storeAddr;
	}

	public void setStoreAddr(String storeAddr) {
		this.storeAddr = storeAddr;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

}
