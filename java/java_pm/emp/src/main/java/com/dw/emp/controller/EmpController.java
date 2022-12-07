package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dw.emp.mapper.EmpMapper;

@Controller
public class EmpController {
	@GetMapping("/emp")
	public String callEmpPage() {
		return "emp";
	}
}
