package com.login.service.impl;

import java.util.List;

import com.login.dao.IEmployeeDao;
import com.login.dao.impl.EmployeeDao;
import com.login.entity.Employee;
import com.login.service.IEmployeeService;

public class EmployeeService implements IEmployeeService {

	private IEmployeeDao employeeDao = new EmployeeDao();
	
	@Override
	public List<Employee> getAll() {
		try {
			return employeeDao.getAll();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
