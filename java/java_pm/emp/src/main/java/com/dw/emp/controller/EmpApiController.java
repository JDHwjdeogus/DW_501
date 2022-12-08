package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

@RestController
public class EmpApiController {
	
	@Autowired
	EmpMapper empMapper;
	
	// select
	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp(){
		return empMapper.selectEmp();
	}
	
	@GetMapping("/api/v1/emp/{empno}")
	public EmpVO callEmp(@PathVariable int empno){
		return empMapper.selectEmpfindByEmpno(empno);
	}
	
	
	
	// insert
	@PostMapping("/api/v1/emp/join")
	public int callEmpjoin(@RequestBody EmpVO emp) {
		return empMapper.insertEmp(emp);
	}
	
	// update
	@PatchMapping("/api/v1/emp")
	public int callEmpUpdate(@RequestBody EmpVO emp) {
		return empMapper.updateEmp(emp);
	}
	
	// delete
	@DeleteMapping("/api/v1/emp/{empno}")
	public int callEmpDelete(@PathVariable int empno) {
		return empMapper.deleteEmp(empno);
	}
		
}
