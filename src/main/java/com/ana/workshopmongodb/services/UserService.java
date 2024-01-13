package com.ana.workshopmongodb.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ana.workshopmongodb.dto.UserDTO;
import com.ana.workshopmongodb.entities.User;
import com.ana.workshopmongodb.repository.UserRepository;
import com.ana.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserDTO> findAll() {
		List<User> list = repository.findAll();
		List<UserDTO> dto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return dto;
	}

	public User findById(String id) {
		List<User> list = repository.findAll();
		User user = null;
		for (User u : list) {
			if (u.getId().equals(id)) {
				user = new User(u.getId(), u.getName(), u.getEmail());
				break;
			} else
				throw new ObjectNotFoundException("Object not found");
		}
		return user;
	}
}
