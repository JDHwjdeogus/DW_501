package com.dw.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Member;
import com.dw.member.repository.MemberRepo;

@RestController
public class MemberController {

	@Autowired
	MemberRepo repo;
	

	@PostMapping("/api/v1/login")
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
	@GetMapping("/member")
	public List<Member> callAllMembers(){
		// findAll == select * from 테이블명
		return repo.findAll();
	}
	
	
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
	
}