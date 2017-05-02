package com.login.service;

import java.util.List;

import com.login.entity.Employee;

/**
 * 2. 员工业务逻辑层
 * @author Jie.Yuan
 *
 */
public interface IEmployeeService {

	/**
	 * 查询所有的员工
	 * @return
	 */
	List<Employee> getAll();
}
