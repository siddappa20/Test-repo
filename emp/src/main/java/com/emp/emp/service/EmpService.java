package com.emp.emp.service;

import java.util.List;

import com.emp.emp.entity.Emp;

public interface EmpService {
	
	public Emp getEmpById(Integer id);
	
	public Emp getEmpByName(String name);
	
	public Emp addEmp(Emp emp);

	public List<Emp> getAllEmp();

}
