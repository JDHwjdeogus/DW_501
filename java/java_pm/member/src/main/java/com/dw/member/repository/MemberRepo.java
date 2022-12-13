package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Member;

// JPA를 상속받는다.
// @Mapper라는 어노테이션을 사용하지 않는다.
public interface MemberRepo extends JpaRepository<Member, Long>{
	// JpaRepository 안에 sql이 있어 이 클래스를 상속받으므로 별도의 sql 작성이 필요치 않은 것이다.
	
	
}
