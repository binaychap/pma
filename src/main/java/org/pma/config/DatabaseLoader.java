package org.pma.config;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.pma.domain.Author;
import org.pma.domain.Post;
import org.pma.repository.AuthorRepository;
import org.pma.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseLoader {

	@Autowired
	PostRepository postRepository;
	@Autowired
	AuthorRepository authorRepository;

	// @Autowired
	// UserRepository userRepository;

	@PostConstruct
	private void initDatabase() {

		
		//authorRepository.deleteAll();
		Author dv = new Author();
		dv.setFirstName("Binay");
		dv.setLastName("Rai");
		dv.setEmail("binayrai@gmail.com");
		authorRepository.save(dv);

		//postRepository.deleteAll();

		Post post = new Post();
		post.setTitle("PMA Data Rocks!");
		post.setSlug("PMA-data-rocks");
		post.setTeaser("Post Teaser");
		post.setBody("Post Body");
		post.setPostedOn(new Date());
		post.setAuthor(dv);
		postRepository.save(post);

		dv.getPosts().add(post);
		authorRepository.save(dv);
	}

	// userRepository.deleteAll();
	//
	//
	// def user = new User(id: 12, email: "binaychap@gmail.com",password:
	// "1234",fullName: "Binay rai",roles: ["ROLE_ADMIN","ROLE_USER"] as Set )
	//
	// userRepository.save(user)

}
