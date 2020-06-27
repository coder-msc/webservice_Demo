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

@WebServlet("/recoverUser")
public class recoverHistoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserService userservice=new UserServiceImpl();

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Users user=RequestBeanUtils.requestToBean(req, Users.class);
	try {
		Integer reco=userservice.recoverUserDel(user);//»Ö¸´É¾³ý¼ÇÂ¼
		
		List<Users> AllUserList=userservice.queryHistoryUser(user);
		req.setAttribute("AllUserList", AllUserList);
		req.getRequestDispatcher("mange/user_history.jsp").forward(req, resp);
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
