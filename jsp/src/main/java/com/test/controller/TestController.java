package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value = "/test.do")
	public String test(Model model) {
		
		model.addAttribute("name", "홍길동");
		
		return "test";
	}
}
