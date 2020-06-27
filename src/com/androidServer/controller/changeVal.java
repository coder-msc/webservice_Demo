package com.androidServer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.androidServer.pojo.Changes;
import com.androidServer.service.changeService;
import com.androidServer.service.impl.changeServiceImpl;
import com.my.web.servlet.RequestBeanUtils;
//http://localhost:8080/AndroidMyServer/changeVal?name=90&val=809
@WebServlet("/changeVal")
public class changeVal extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private changeService chageservice=new changeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Changes change=RequestBeanUtils.requestToBean(req, Changes.class);
		String name=req.getParameter("name").trim();
		String val=req.getParameter("val").trim();
		String user=req.getParameter("user").trim();
		System.out.println(name+"name的值he用户"+user);
		System.out.println("nval==="+val);
		try {
			chageservice.insertDevice(name,val,user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
