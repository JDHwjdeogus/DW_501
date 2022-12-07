package com.dw.emp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dw.emp.mapper.EmpMapper;

public class EmpService{
	@Autowired
	EmpMapper empMapper;
}
