package com.emp.emp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emp.emp.domain.EmpResponse;
import com.emp.emp.entity.Emp;
import com.emp.emp.service.EmpService;

@RestController
public class EmpInfoController {

	Logger logger = LoggerFactory.getLogger(EmpInfoController.class);
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<EmpResponse> getEmp(@PathVariable("id") Integer id) {
		
		logger.debug("get emp details by Id:{} ",id);
		logger.info("get emp details by Id:{} ",id);
		logger.warn("get emp details by Id:{} ",id);
		logger.error("get emp details by Id:{} ",id);
		
			
		Emp emp = empService.getEmpById(id);
		EmpResponse res = new EmpResponse();
		res.setEmpRes(emp);
		res.setMessage("success");
		
		
		return new ResponseEntity<EmpResponse>(res, HttpStatus.OK);
		
	}
	
	
}
