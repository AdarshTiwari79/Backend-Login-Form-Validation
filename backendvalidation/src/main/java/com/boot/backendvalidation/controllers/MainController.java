package com.boot.backendvalidation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.boot.backendvalidation.entities.LoginData;

import jakarta.validation.Valid;



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
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
		return "success";
	}
	

}
