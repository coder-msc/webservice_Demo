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

@WebServlet("/queryList")
public class userListController extends HttpServlet  {
	private IUserService userservice=new UserServiceImpl();

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Users user=RequestBeanUtils.requestToBean(req, Users.class);
		try {
			List<Users> AllUserList=userservice.queryAllUser(user);
			req.setAttribute("AllUserList", AllUserList);
			req.getRequestDispatcher("mange/user_list.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Users user=RequestBeanUtils.requestToBean(req, Users.class);
		doGet(req, resp);
		
	}
}
