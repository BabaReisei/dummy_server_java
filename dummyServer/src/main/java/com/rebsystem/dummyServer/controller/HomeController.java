package com.rebsystem.dummyServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rebsystem.dummyServer.model.Inquiry;

@Controller
public class HomeController {

	@GetMapping("/")
	private String readForm(@ModelAttribute Inquiry inquiry) {
		return "index";
	}

	@PostMapping("/")
	private String confirm(@Validated @ModelAttribute Inquiry inquiry, BindingResult result) {
		if (result.hasErrors()) {
			return "index";
		}
		return "confirm";
	}
}
