package com.ana.workshopmongodb.entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Post {

	private String id;
	private Date date;
	private String title;
	private String body;
	private List<Comment> comments;
	private User user;

	public Post() {

	}

	public Post(String id, Date date, String title, String body, List<Comment> comments, User user) {
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.comments = comments;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

}