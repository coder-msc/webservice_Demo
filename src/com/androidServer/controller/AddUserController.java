package com.androidServer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.androidServer.pojo.Mange;
import com.androidServer.pojo.Power;
import com.androidServer.pojo.Users;
import com.androidServer.service.IUserService;
import com.androidServer.service.impl.UserServiceImpl;
import com.my.web.servlet.RequestBeanUtils;

@WebServlet("/addUser")
public class  AddUserController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private IUserService userservice=new UserServiceImpl();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Users user=RequestBeanUtils.requestToBean(req, Users.class);
		Power power=RequestBeanUtils.requestToBean(req, Power.class);
		Mange mange=RequestBeanUtils.requestToBean(req, Mange.class);
		
		  
		try {
			Integer del=userservice.delUser(user);
			List<Power> PowerList = userservice.queryPower(power);
			List<Mange> MangeList=userservice.queryMange(mange);
			req.setAttribute("PowerList", PowerList);
			req.setAttribute("MangeList", MangeList);
			
			req.getRequestDispatcher("mange/add_user.jsp").forward(req, resp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		Users user=RequestBeanUtils.requestToBean(req, Users.class);
	
		try {
			
			Integer addUser=userservice.addUserC(user);
			List<Users> AllUserList=userservice.queryAllUser(user);
			req.setAttribute("AllUserList", AllUserList);//显示所有用户
			req.getRequestDispatcher("mange/user_list.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
