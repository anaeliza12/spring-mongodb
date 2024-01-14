package com.ana.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ana.workshopmongodb.entities.Post;
import com.ana.workshopmongodb.entities.User;
import com.ana.workshopmongodb.repository.PostRepository;
import com.ana.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private UserRepository userRepsository;

	public void run(String... args) throws Exception {

		SimpleDateFormat stf = new SimpleDateFormat("dd/mm/yyyy");
		stf.setTimeZone(TimeZone.getTimeZone("GMT"));

		userRepsository.deleteAll();
		postRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");

		Post post1 = new Post(null, stf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo, abraços!",
				maria);
		Post post2 = new Post(null, stf.parse("23/03/2018"), "Bom dia!", "Acordei feliz hoje!", maria);

		postRepository.saveAll(Arrays.asList(post1, post2));

		userRepsository.saveAll(Arrays.asList(maria, alex, bob));

	}

}
