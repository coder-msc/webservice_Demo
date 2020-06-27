package com.androidServer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.androidServer.pojo.Users;
import com.androidServer.service.IUserService;
import com.androidServer.service.impl.UserServiceImpl;
import com.my.web.servlet.RequestBeanUtils;

@WebServlet("/delUser")
public class delUserController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private IUserService userservice=new UserServiceImpl();

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Users user=RequestBeanUtils.requestToBean(req, Users.class);
	try {
		Integer del=userservice.delUser(user);//删除用户
		List<Users> AllUserList=userservice.queryAllUser(user);
		req.setAttribute("AllUserList", AllUserList);//显示所有用户
		req.getRequestDispatcher("mange/user_list.jsp").forward(req, resp);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
}
}
