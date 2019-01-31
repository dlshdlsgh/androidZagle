package com.zagle.service.domain;

import java.sql.Date;

public class Comment {
	
	private String commentNo;
	private Board board;
	private User user;
	private String commentDetailText;
	private Date commentRegDate;
	
	public Comment() {
		
	}

	public String getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(String commentNo) {
		this.commentNo = commentNo;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCommentDetailText() {
		return commentDetailText;
	}

	public void setCommentDetailText(String commentDetailText) {
		this.commentDetailText = commentDetailText;
	}

	public Date getCommentRegDate() {
		return commentRegDate;
	}

	public void setCommentRegDate(Date commentRegDate) {
		this.commentRegDate = commentRegDate;
	}

	@Override
	public String toString() {
		return "Comment [commentNo=" + commentNo + ", board=" + board + ", user=" + user + ", commentDetailText="
				+ commentDetailText + ", commentRegDate=" + commentRegDate + "]";
	}
	
	

}
