package com.example.bean;

import java.io.Serializable;

public class BookComment implements Serializable {
	private String userName;
	private String bookComment;
	private String commentTime;
	private int cpicture;

	public BookComment() {
	}

	public int getCpicture() {
		return cpicture;
	}

	public void setCpicture(int cpicture) {
		this.cpicture = cpicture;
	}

	public BookComment(String userName, String bookComment, String commentTime,
			int cpicture) {
		super();
		this.userName = userName;
		this.bookComment = bookComment;
		this.commentTime = commentTime;
		this.cpicture = cpicture;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBookComment() {
		return bookComment;
	}

	public void setBookComment(String bookComment) {
		this.bookComment = bookComment;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

}
