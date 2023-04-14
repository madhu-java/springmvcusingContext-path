package com.myskills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	@GetMapping("/greet")
	public String greet(Model model) {
		String greet="welcome to third spring web mvc..";
		model.addAttribute("message",greet);
		return "index";
	}

}
