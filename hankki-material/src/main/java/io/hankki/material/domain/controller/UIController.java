package io.hankki.material.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.hankki.material.domain.repository.MaterialRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UIController {
	
	@Autowired
	MaterialRepository repository;

	@GetMapping("/list")
	public String list(Model model) {
//		model.addAttribute("message", "hello world");
		model.addAttribute("materials", repository.findAll());
		return "list";
	}
	
	 @GetMapping("/index")
	  public String home(){
	    return "index";
	  }
	
}
