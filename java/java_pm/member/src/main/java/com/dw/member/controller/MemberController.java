package com.dw.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Member;
import com.dw.member.repository.MemberRepo;
import com.dw.member.service.MainService;
import com.dw.member.utils.APIResponse;

@RestController
public class MemberController {

	@Autowired
	MemberRepo repo;
	
	@Autowired
	MainService service;


	// 전체 조회
	@GetMapping("/member")
	public APIResponse<List<Member>> callAllMembers() {
		// findAll == select * from <테이블 이름>
		List<Member> list = repo.findAll();
		int size = (int) repo.count();
		return new APIResponse<>(size, list);
	}

	// 전체 조회 (정렬 기능 추가)
	@GetMapping("/member/sort/{column}")
	public APIResponse<List<Member>> callAllMembers(@PathVariable String column) {
		// findAll == select * from <테이블 이름>
		List<Member> list = repo.findAll(Sort.by(Sort.Direction.ASC, column));
		int size = (int) repo.count();
		return new APIResponse<>(size, list);
	}

	// 전체 조회 (페이징 처리, 정렬 추가)
	// 사용법: /member/pagination?offset=0&pageSize=5&column=age
	@GetMapping("/member/pagination")
	public APIResponse<Page<Member>> callAllMembers(@RequestParam int offset, @RequestParam int pageSize, @RequestParam String column) {
		// offset, pageSize == LIMIT offset, pageSize
		// pageSize: 한 페이지 당 몇 개를 출력할 것인지

		Page<Member> members = repo
				.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(column)));
		int size = members.getSize();

		return new APIResponse<>(size, members);
	}





	// json으로 보낼 때 @RequestBody로 받는다
	@PostMapping("/api/v1/login-test")
	public boolean callLogin(@RequestBody Member member, HttpServletRequest request){

		Member m = repo.findByuserIdAndUserPassword(member.getUserId(), member.getUserPassword());

		if(m != null) {
			// System.out.println("이름은: " + m.getName());
			HttpSession session = request.getSession();
			session.setAttribute("userId", m.getUserId());
			return true;
		}
		else{
			return false;
		}
	}
	


	// 전체조회
	/*
	@GetMapping("/member")
	public List<Member> callAllMembers(){
		// findAll == select * from 테이블명
		return repo.findAll();
	}
	*/
	
	
	// 추가
	@PostMapping("/member")
	public Member callSaveMember(@RequestBody Member member) {
		// save == insert
		member = repo.save(member);
		return member;
	}
	
	
	// 삭제
	@DeleteMapping("/member/{id}")
	public boolean callDeleteMember(@PathVariable long id) {
		// deleteById == delete
		// By == WHERE
		try {
			repo.deleteById(id);	// return 타입이 void 임.
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	
	// 수정
	@PatchMapping("/member")
	public Member updateMember(@RequestBody Member member) {
		// save == update or insert
		// 동일한 pk 값이 있으면 update
		// 동일한 pk 값이 없으면 insert
		member = repo.save(member);
		return member;
	}
	
	
	// 상세조회
	@GetMapping("/member/{id}")
	public Member callMemberById(@PathVariable long id) {
		// fincById == select * from emp where empno == 333(예시)
		return repo.findById(id).get();
	}




	// 리캡챠 인증 controller 만들기
	// FORM 태그로 데이터 전송받는 방법
	// 1. HttpServletRequest 사용
	@PostMapping("/api/v1/valid-recaptcha")
	public boolean validRecapcha(HttpServletRequest request) {
		String response = request.getParameter("g-recaptcha-response");
		boolean isRecaptcha = service.verifyRecaptcha(response);
		// 리캡차 인증 성공 시 true, 실패 시 false
		return isRecaptcha;
	}

	
	@PostMapping(value = "/api/v1/login")
	public boolean callLogin2(@ModelAttribute Member member, HttpServletRequest request) {
		Member m = repo.findByuserIdAndUserPassword(member.getUserId(), member.getUserPassword());
		if(m != null){
			HttpSession session = request.getSession();
			session.setAttribute("userId", m.getUserId());
			return  true;
		} else {
			return false;
		}
	}
}
