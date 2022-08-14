package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceMgmtImpl implements IEmployeeMgmtService {
	// HAS-A property
	private IEmployeeDAO dao;

	public EmployeeServiceMgmtImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeServiceMgmtImpl.EmployeeServiceMgmtImpl()-1 param constrcutor....");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeServiceMgmtImpl.registerEmployee()");
		// Business logic to calculate gross Salary and net salary
		float grossSalary = dto.getBasicSalary() + dto.getBasicSalary() * 0.4f; // +40% in basic salary
		float netSalary = grossSalary - dto.getBasicSalary() * 0.2f; // -20% in gross salary
		// Prepare BO class object having persistable data
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		//bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		// Use DAO
		int count = dao.insertEmployee(bo);
		// Generate final result
		return count == 1 ? "Employee registered with netSalary::" + netSalary
				: "Employee registered with netSalary::" + netSalary; // ternery operator

	}

}
