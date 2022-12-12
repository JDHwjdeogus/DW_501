package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.BoardService;
import com.dw.emp.vo.BoardVO;

@RestController
public class BoardApiController {
	
	@Autowired
	BoardService boardService;
	
	// DW 게시판 select
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoard(){
		return boardService.selectBoard();
	}
	
	// DW 게시판 insert
	@PostMapping("/api/v1/board/write")
	public int callBoardSave(@RequestBody BoardVO vo) {
		return boardService.insertBoard(vo);
	}
	
	
	
	// 게시글 삭제
	@DeleteMapping("/api/v1/board/{boardNo}")
	public int callBoardDelete(@PathVariable int boardNo) {
		return boardService.deleteBoardByBoardNo(boardNo);
	}
	
	// 게시글 보기
	@ GetMapping("/api/v1/board/{boardNo}")
	public BoardVO callBoard(@PathVariable int boardNo) {
		return boardService.selectBoardFindByBoardNo(boardNo);
	}
	
	// 게시글 수정
	@PatchMapping("/api/v1/board/{boardNo}")
	public int updateBoardByBoardNo(@RequestBody BoardVO vo) {
		return boardService.updateBoardByBoardNo(vo);
	}
}
