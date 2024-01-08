package com.ana.workshopmongodb.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ana.workshopmongodb.dto.UserDTO;
import com.ana.workshopmongodb.entities.User;
import com.ana.workshopmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<UserDTO> findAll() {
		List<User> list = repository.findAll();
		List<UserDTO> dto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return dto;
	}
}
