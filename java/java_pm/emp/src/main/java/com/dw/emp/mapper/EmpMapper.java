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
	List<EmpVO> selectEmp();
}
