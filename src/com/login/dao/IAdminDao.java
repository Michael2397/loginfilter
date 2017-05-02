package com.login.dao;

import com.login.entity.Admin;

/**
 * 2.管理员数据访问层设计
 * @author Jie.Yuan
 *
 */
public interface IAdminDao {

	/**
	 * 根据用户名密码查询
	 * @param admin
	 * @return
	 */
	Admin findByNameAndPwd(Admin admin);
}
