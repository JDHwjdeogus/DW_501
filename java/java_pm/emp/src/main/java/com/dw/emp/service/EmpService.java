package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

public class EmpService{
	@Autowired
	EmpMapper empMapper;
	
	public List<EmpVO> selectEmp(){
		return empMapper.selectEmp();
	}
	
	public EmpVO selectEmpfindByEmpno(int empno) {
		return empMapper.selectEmpfindByEmpno(empno);
	}
	
	
	
	public int insertEmp(EmpVO vo) {
		return empMapper.insertEmp(vo);
	}
	
	public int updateEmp(EmpVO vo) {
		return empMapper.updateEmp(vo);
	}
	
	public int deleteEmp(int empno) {
		return empMapper.deleteEmp(empno);
	}
}
