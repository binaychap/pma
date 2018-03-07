package org.pma.controller;


import org.pma.service.PostService;
import org.pma.service.PostServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private PostService postService;
	
	
	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("post", postService.getLatestPost());
		return "index";
	}
	
}
