package org.pma.service;


import org.pma.domain.Post;
import org.pma.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public Post getLatestPost() {
		return postRepository.findFirstByOrderByPostedOnDesc();
	}

	@Override
	public List<Post> list() {
		return postRepository.findAllByOrderByPostedOnDesc();
	}

	@Override
	public Post getBySlug(String slug) {
		return postRepository.findBySlug(slug);
	}

	//private PostRepository postRepository;
	
//	@Autowired
//	public PostServiceImpl(PostRepository postRepository){
//		this.postRepository = postRepository;
//	}
//	
//	public Post getLatestPost(){
//		return postRepository.findFirstByOrderByPostedOnDesc();
//	}
//
//	public List<Post> list() {
//		return postRepository.findAllByOrderByPostedOnDesc();
//	}
//
//	public Post getBySlug(String slug) {
//		return postRepository.findBySlug(slug);
//	}

	
}
