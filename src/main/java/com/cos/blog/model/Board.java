package com.cos.blog.model;

import java.sql.Timestamp;

public class Board {
	
	private int id;
	private String title;
	private String content;
	private Timestamp createDate;
	private int userId;
	private String username;
	private String userProfile;
	private User user = new User();
	
	public Board() {
	}

	public Board(int id, String title, String content, Timestamp createDate, int userId, String username,
			String userProfile, User user) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createDate = createDate;
		this.userId = userId;
		this.username = username;
		this.userProfile = userProfile;
		this.user = user;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserProfile() {
		return userProfile;
	}


	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	
	
}
