package com.login.dao;

import java.util.List;

import com.login.entity.Employee;

/**
 * 2. 员工数据访问层接口设计
 * @author Jie.Yuan
 *
 */
public interface IEmployeeDao {

	/**
	 * 查询所有的员工
	 * @return
	 */
	List<Employee> getAll();
}
