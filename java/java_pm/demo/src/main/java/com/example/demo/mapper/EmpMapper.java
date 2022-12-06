package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.UsersVO;

/*
 * 추상클래스 인터페이스 차이점
	인터페이스: 메소드 정의만 가능
	추상클래스: 정의 및 구현 가능
*/

@Mapper
public interface EmpMapper {
	// 메소드 정의만 가능
	// 밑의 주석 단축키: alt + shift + j
	
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : Jeong_Dahyeon
	 * @Return : List<EmpVO>
	 * @Comment : EMP 테이블 전체 조회 
	 */
	List<EmpVO> selectEmp();
	
	/**
	 * @Since : 2022. 11. 29.
	 * @Author : Jeong_Dahyeon
	 * @Return : List<DeptVO>
	 * @Comment : DEPT 테이블 전체 조회 
	 */
	List<DeptVO> selectDept();
	
	// 이름은 sql.xml과 똑같이
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : EMP 테이블 데이터 insert
	 */
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : EMP 테이블 데이터 delete
	 */
	int deleteEmp(int empno);
	
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : DEPT 테이블 데이터 insert
	 */
	int insertDept(DeptVO dvo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : DEPT 테이블 데이터 delete
	 */
	int deleteDept(int deptno);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : EMP 테이블 데이터 수정
	 */
	int updateEmp(EmpVO vo);
	
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : user table insert: 회원가입
	 */
	int insertUsers(UsersVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : user login: 회원인지 아닌지 체크
	 */
	int selectUsersFindById(UsersVO vo);
	
	/**
	 * @Since : 2022. 12. 2.
	 * @Author : Jeong_Dahyeon
	 * @Return : List<UsersVO>
	 * @Comment : 회원리스트 조회(users.html)
	 */
	List<UsersVO> selectUser();
	
	
	/**
	 * @Since : 2022. 12. 6.
	 * @Author : Jeong_Dahyeon
	 * @Return : UsersVO
	 * @Comment : user login: (암호화된 비밀번호로) 회원인지 아닌지 체크
	 */
	UsersVO selectUsersPassword(UsersVO vo);
}
