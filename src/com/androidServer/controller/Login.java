package com.androidServer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.androidServer.pojo.Users;
import com.androidServer.service.IUserService;
import com.androidServer.service.impl.UserServiceImpl;
import com.my.web.servlet.RequestBeanUtils;
@WebServlet("/mustLogin1")
public class Login extends HttpServlet{
	private IUserService userservice=new UserServiceImpl();
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Users user=RequestBeanUtils.requestToBean(req, Users.class);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		try {
			System.out.println(user.getUserName());
			String name=req.getParameter("logname").trim();
			String password=req.getParameter("password").trim();
//			Users login=userservice.Login(user.getUserName(),user.getUserPassword());
			System.out.println(name+"----"+password);
			Users login=userservice.Login(name,password);

			System.out.println("权限标志"+login.getPower());
			if(login==null){
				System.out.println("登陆失败");
			}else{
				out.println("login successfully!"+login.getPower());
				System.out.println("登陆成功");
			}
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
