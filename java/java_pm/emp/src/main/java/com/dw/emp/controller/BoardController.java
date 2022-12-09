package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("/dwboard")
	public String callDWboardPage() {
		return "board";
	}
	
	@GetMapping("/write")
	public String loadWritePage() {
		return "write";
	}
	
}
