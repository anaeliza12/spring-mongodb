package com.ana.workshopmongodb.entities;

import java.util.List;
import java.util.Objects;


public class User {

	private String id;
	private String name;
	private String email;
	private List<Post> posts;

	public User() {

	}

	public User(String id, String name, String email, List<Post> post) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.posts = post;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Post> getPost() {
		return posts;
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}