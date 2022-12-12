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
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : DW 게시판 작성 글 등록하기
	 */
	public int insertBoard(BoardVO vo);
	// 작성한 sql 쿼리의 ID와 메소드 이름이 동일해야 매핑이 된다.
	// insert, update, delete는 int로 리턴한다.
	
	
	
	// =============== write.html ==================
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : Jeong_Dahyeon
	 * @Return : BoardVO
	 * @Comment : 게시글 보기
	 */
	public BoardVO selectBoardFindByBoardNo(int boardNo);
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : 
	 */
	public int deleteBoardByBoardNo(int boardNo);
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : 
	 */
	public int updateBoardByBoardNo(BoardVO vo);
}
