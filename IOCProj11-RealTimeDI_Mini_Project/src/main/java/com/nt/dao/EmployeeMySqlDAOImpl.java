package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeMySqlDAOImpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?)";
	// HAS-A property
	private DataSource ds;

	public EmployeeMySqlDAOImpl(DataSource ds) {
		System.out.println("EmployeeOracleDAOImpl()-1 param constructor.....");
		this.ds = ds;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeOracleDAOImpl.insertEmployee()");
		int result = 0;
		try (Connection con = ds.getConnection(); 
				PreparedStatement ps = con.prepareStatement(EMP_INSERT_QUERY);
						 ){
			// Set query @param values
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());

			// Execute the query
			result = ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;// Propogating the exception
		} catch (Exception e) {
			e.printStackTrace();
			throw e;// Propogating the exception
		}
		return result;
	}

}



