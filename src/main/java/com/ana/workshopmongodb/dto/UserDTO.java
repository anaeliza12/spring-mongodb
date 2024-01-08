package com.ana.workshopmongodb.dto;

import org.springframework.data.annotation.Id;

import com.ana.workshopmongodb.entities.User;

public class UserDTO {

	@Id
	private String id;
	private String name;
	private String email;

	public UserDTO() {

	}

	public UserDTO(User obj) {
		id = obj.getId();
		setName(obj.getName());
		setEmail(obj.getEmail());
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
}
