package com.dw.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Member;
import com.dw.member.repository.MemberRepo;

@RestController
public class MemberController {

	@Autowired
	MemberRepo repo;
	
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
	
}
