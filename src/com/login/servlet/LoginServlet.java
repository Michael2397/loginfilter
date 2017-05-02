package com.login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.entity.Admin;
import com.login.service.IAdminService;
import com.login.service.impl.AdminService;

/**
 * �����½����
 * @author Jie.Yuan
 *
 */
public class LoginServlet extends HttpServlet {
	// Service实例
	private IAdminService adminService = new AdminService();
	// 跳转资源
	private String uri;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("登陆");
		request.setCharacterEncoding("UTF-8");
		
		////1. 获取参数
		String userName = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		// 封装
		Admin admin = new Admin();
		admin.setUserName(userName);
		admin.setPwd(pwd);
		
		try {
			//2. 调用service处理业务
			Admin loginInfo = adminService.findByNameAndPwd(admin);
			// 判断:
			if (loginInfo == null){
				// 登陆失败
				uri = "/login.jsp";
			} else {
				//登陆成功
				// 先保存数据到session
				request.getSession().setAttribute("loginInfo", loginInfo);
				// 跳转到首页
				uri = "/index";
			}
		} catch (Exception e) {
			// 测试
			e.printStackTrace();
			// 错误
			uri = "/error/error.jsp";
		}
		
		//3. 跳转
		request.getRequestDispatcher(uri).forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
