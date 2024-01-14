package com.ana.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ana.workshopmongodb.entities.Post;
import com.ana.workshopmongodb.entities.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
