// MyBatis VO와 같은 역할
// 차이점: vo 역할과 테이블 생성을 동시에 한다.

// 테이블 명세서와 같은 느낌 
package com.dw.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// 테이블 이름은 소문자로. 이름을 지정하지 않으면 자동으로 맨 앞 글자가 대문자인 테이블이 생성된다. 
@Entity
@Table(name="dw_member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // AUTO_INCREMENT
	@Column
	private long id; // pk
	@Column
	private String name; // 멤버이름
	@Column
	private int age; // 나이
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
