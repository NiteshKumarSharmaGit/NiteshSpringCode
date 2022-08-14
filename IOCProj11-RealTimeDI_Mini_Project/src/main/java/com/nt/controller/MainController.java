package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
	// HAS -A property
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		System.out.println("MainController.MainController()-1 param constrcort....");
		this.service = service;
	}

	public String processEmployee(EmployeeVO vo) throws Exception {
		// Convert Employee VO class object into Employee DTO class
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		//User Service
		String result = service.registerEmployee(dto);
		return result;
	}

}
