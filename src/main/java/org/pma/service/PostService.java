package org.pma.service;

import java.util.List;

import org.pma.domain.Post;

public interface PostService {
	public Post getLatestPost();
	public List<Post> list();
	public Post getBySlug(String slug);
	
}
