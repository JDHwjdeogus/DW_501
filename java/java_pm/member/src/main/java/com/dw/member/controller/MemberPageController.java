package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller: 페이지 이동 || @RestController: 데이터 전달
@Controller
public class MemberPageController {

	@GetMapping("/mpage")
	public String callMemberPage() {
		return "members";
	}
}
