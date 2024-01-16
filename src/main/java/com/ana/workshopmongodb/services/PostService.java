package com.ana.workshopmongodb.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ana.workshopmongodb.dto.UserDTO;
import com.ana.workshopmongodb.entities.Post;
import com.ana.workshopmongodb.entities.User;
import com.ana.workshopmongodb.repository.PostRepository;
import com.ana.workshopmongodb.repository.UserRepository;
import com.ana.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		List<Post> list = repository.findAll();
		Post post = null;
		for (Post p : list) {
			if (p.getId().equals(id)) {
				post = new Post(id, p.getDate(), p.getTitle(), p.getBody(), p.getUser());
				break;
			} else
				throw new ObjectNotFoundException("Object not found");
		}
		return post;
	}

	public List<Post> findByTitle(String text) {
		return repository.searchTitle(text);
	}

}
