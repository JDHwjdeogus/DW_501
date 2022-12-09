package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.vo.BoardVO;

public class BoardService{
	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoard(){
		return boardMapper.selectBoard();
	}
}
