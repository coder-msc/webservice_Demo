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

@WebServlet("/changeOneUser")
public class changeUserController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private IUserService userservice=new UserServiceImpl();

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Users user=RequestBeanUtils.requestToBean(req, Users.class);
	Power power=RequestBeanUtils.requestToBean(req, Power.class);
	Mange mange=RequestBeanUtils.requestToBean(req, Mange.class);
	
	try {
		Users oneUserList = userservice.queryOneUser(user);
	
		List<Power> PowerList = userservice.queryPower(power);
		List<Mange> MangeList=userservice.queryMange(mange);
		req.setAttribute("PowerList", PowerList);
		req.setAttribute("MangeList", MangeList);
		
		req.setAttribute("oneUserList", oneUserList);
		req.getRequestDispatcher("mange/change_user.jsp").forward(req, resp);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.setCharacterEncoding("utf-8");
	resp.setCharacterEncoding("utf-8");
	Users user=RequestBeanUtils.requestToBean(req, Users.class);

	try {
		Integer changeUser=userservice.changeUserC(user);
		
		//修改完成后，显示所有用户列表
		List<Users> AllUserList=userservice.queryAllUser(user);
		req.setAttribute("AllUserList", AllUserList);//显示所有用户
		req.getRequestDispatcher("mange/user_list.jsp").forward(req, resp);
		
		
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
}

}
