package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.vo.BoardVO;

@RestController
public class BoardApiController {
	
	@Autowired
	BoardMapper boardMapper;
	
	// DW 게시판 select
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoard(){
		return boardMapper.selectBoard();
	}
		
}
