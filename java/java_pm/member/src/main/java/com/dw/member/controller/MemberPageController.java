package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller: 페이지 이동 || @RestController: 데이터 전달
@Controller
public class MemberPageController {

	@GetMapping("/mpage")
	public String callMemberPage() {
		return "members";
	}

	@GetMapping("/login_test")
	public String loadLoginTestPage(){
		return "login_test";
	}


	@GetMapping("/login")
	public String loadLoginPage(){
		return "login";
	}

	@GetMapping(value = {"/", "/home"})
	public String loadHomePage() {
		return "members";
	}
}
