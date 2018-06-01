package org.pma.controller;

import org.pma.domain.Author;
import org.pma.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/authors")
public class AuthorController {
	
	@Autowired
	AuthorRepository authorRepository;
	


	@RequestMapping("/list")
	@ResponseBody
	public Iterable<Author> list(){
		return authorRepository.findAll();
	}
	
	public void test() {
		System.out.println("revert test");
	}
	
}
