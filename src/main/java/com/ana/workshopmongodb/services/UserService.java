package com.ana.workshopmongodb.services;

import java.util.List;
import java.util.Optional;
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
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}
