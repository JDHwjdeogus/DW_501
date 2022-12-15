// MyBatis VO와 같은 역할
// 차이점: vo 역할과 테이블 생성을 동시에 한다.

// 테이블 명세서와 같은 느낌 
package com.dw.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// 테이블 이름은 소문자로. 이름을 지정하지 않으면 자동으로 맨 앞 글자가 대문자인 테이블이 생성된다. 

@Getter
@Setter
@Entity
@Table(name="dw_member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // AUTO_INCREMENT
	@Column
	private long id; // pk
	@Column(length = 30) // (length = 30): 컬럼 사이즈 설정
	private String name; // 멤버이름
	@Column
	private int age; // 나이
	


	// 로그인
	@Column(length = 40)
	private String userId;
	@Column
	private String userPassword;


	// @JoinColumn : member 테이블에 dept_id라는 컬럼(FK) 생성
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Dept dept;
	
}
