package com.dw.emp.vo;

public class BoardVO {
	private int boardNo;
	private String title;
	private String writer;
	private String create_at;
	private int board_count;
	private String contents;
	
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public int getBoard_no() {
		return boardNo;
	}
	public void setBoard_no(int board_no) {
		this.boardNo = board_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCreate_at() {
		return create_at;
	}
	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
}
