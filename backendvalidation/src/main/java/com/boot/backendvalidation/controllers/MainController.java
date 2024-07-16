package com.boot.backendvalidation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.boot.backendvalidation.entities.LoginData;



@Controller
public class MainController {
	
	
	// to show form
	@GetMapping("/form")
	public String openForm(Model model) {
		model.addAttribute("loginData",new LoginData());
		return "form";
	}
	
	
	// to process form after submit
	@PostMapping("/submit")
	public String processForm(@ModelAttribute("loginData") LoginData loginData) {
		
		System.out.println(loginData);
		return "success";
	}
	

}
