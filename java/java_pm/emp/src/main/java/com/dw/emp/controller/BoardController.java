package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@GetMapping("/dwboard/{boardNo}")
	public String loadBoardPage(@PathVariable int boardNo, ModelMap map) {
		// url로 받아온 게시판 번호를 update.html에 다시 전달
		map.addAttribute("boardNo", boardNo);
		return "update";
	}
	
}
