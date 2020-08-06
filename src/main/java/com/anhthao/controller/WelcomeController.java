package com.anhthao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String showForm(@RequestParam(name = "name", required = false) String name
			, Model model) {
		model.addAttribute("name", name);
		return "welcome";
	}
}
