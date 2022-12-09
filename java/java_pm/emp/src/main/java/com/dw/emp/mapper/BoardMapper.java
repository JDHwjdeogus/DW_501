package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;

@Mapper
public interface BoardMapper {
	/**
	 * @Since : 2022. 12. 9.
	 * @Author : Jeong_Dahyeon
	 * @Return : List<BoardVO>
	 * @Comment : DW 게시판 게시글 리스트 페이지
	 */
	public List<BoardVO> selectBoard();
}
