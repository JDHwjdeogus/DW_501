package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	@GetMapping("/")
	public String callIndexPage() {
		// return에 html파일의 이름을 작성
		return "index";
	}
	
	@GetMapping("/home")
	public String callHomePage(HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		System.out.println("요청받은 IP: " + ip);
		
		return "home";
	}
	
	@GetMapping("/idden")
	public String callIddenPage() {
		return "idden";
	}
	
	@GetMapping("/movie")
	public String callMoviePage() {
		return "movie";
	}
	
	@GetMapping("/login")
	public String callLoginPage() {
		return "login";
	}
	
	@GetMapping("/login2")
	public String callLogin2Page() {
		return "login2";
	}
	
	@GetMapping("/emp")
	public String callEmpPage() {
		return "emp";
	}
	
	@GetMapping("/dept")
	public String callDeptPage() {
		return "dept";
	}
	
	@GetMapping("/join")
	public String callJoinPage() {
		return "join";
	}
	
	@GetMapping("/users")
	public String callUsersPage(HttpServletRequest req, ModelMap map) {
		// ModelMap: HTML에 데이터를 전달
		/*
		
		 	* HTML에 데이터를 전달하는 방법
			 1. AJAX를 이용한 데이터 처리
			 2. ModelMap을 활용한 데이터 처리
			
			* 실무에서는 1과 2를 번갈아가며 쓰지만 수업에서는 1에 초점을 둔다.
			* 2의 경우 쓰는 회사도 있고 안쓰는 곳도 있기 때문이다.
			
		 */
		
		HttpSession session  = req.getSession();
		String name = (String) session.getAttribute("name");
		
		System.out.println("name -> " + name);
		map.addAttribute("name", name);
		return "users";
		
	}
}
