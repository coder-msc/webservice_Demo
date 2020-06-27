package com.androidServer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.androidServer.pojo.Users;
import com.androidServer.service.IUserService;
import com.androidServer.service.impl.UserServiceImpl;
import com.my.web.servlet.RequestBeanUtils;

@WebServlet("/testLoginMange")
public class testLoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private IUserService userservice=new UserServiceImpl();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Users user=RequestBeanUtils.requestToBean(req, Users.class);  
	try {
		Users	users = userservice.queryTestMangeLogin(user);
		System.out.println(users+"c测试中的USER 信息"+user.getUserName()+"密码是"+user.getUserPassword());

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
	
}
}
