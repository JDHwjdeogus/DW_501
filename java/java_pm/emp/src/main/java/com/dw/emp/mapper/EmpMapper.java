package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {
	/**
	 * @Since : 2022. 12. 7.
	 * @Author : Jeong_Dahyeon
	 * @Return : List<EmpVO>
	 * @Comment : EMP 테이블 전체 조회 
	 */
	public List<EmpVO> selectEmp();
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : Jeong_Dahyeon
	 * @Return : EmpVO
	 * @Comment : 사원 번호 기준으로 사원명, 급여, 보너스 조회
	 */
	public EmpVO selectEmpfindByEmpno(int empno);
	
	
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : 사원 정보 입력
	 */
	public int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : 사원 번호 기준으로 사원 정보 수정: 사원명, 직책, 급여, 보너스
	 */
	public int updateEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : Jeong_Dahyeon
	 * @Return : int
	 * @Comment : 사원번호 기준으로 해당 사원의 전체 정보를 삭제
	 */
	public int deleteEmp(int empno);

}
