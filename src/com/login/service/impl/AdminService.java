package com.login.service.impl;

import com.login.dao.IAdminDao;
import com.login.dao.impl.AdminDao;
import com.login.entity.Admin;
import com.login.service.IAdminService;

public class AdminService implements IAdminService{
	
	// 创建dao对象
	private IAdminDao adminDao = new AdminDao();

	@Override
	public Admin findByNameAndPwd(Admin admin) {
		try {
			return adminDao.findByNameAndPwd(admin);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
