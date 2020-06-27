package com.androidServer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.androidServer.pojo.Values;
import com.androidServer.service.IValuesService;
import com.androidServer.service.impl.ValuesServiceImpl;
import com.my.web.servlet.RequestBeanUtils;

import net.sf.json.JSONObject;
@WebServlet("/chenkDevice")
public class checkCValues extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private IValuesService value=new ValuesServiceImpl();
	public int second=0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		JSONObject jsonobj=new JSONObject();
		
		//1.�����ÿ��2�붨ʱˢ��ҳ��
     /*resp.setHeader("refresh", "1");
     resp.getWriter().write(++second + "");*/
     System.out.println("second"+second);
	Values val=RequestBeanUtils.requestToBean(req, Values.class);
	try {
		//http://neuq.top/chenkDevice?itemName=New%20Alias%201.test
		//http://localhost:8080/AndroidMyServer/chenkDevice?itemName=New%20Alias%201.test
		List<Values> listVal=value.queryVale(val.getItemName());
		System.out.println("������ʾ���ͻ��˵�ֵ"+listVal);
		Values Val=listVal.get(0);
		out.println(Val.getItemValue());//�����ֵ������׿��
		
		jsonobj.put("jsonVal", Val.getItemValue());		//ʹ��json��ȡֵ
		System.out.println("�豸��ֵ��"+Val.getItemValue());//���޸ģ�ֻ��ʾֵ
		String a=(String)jsonobj.get("testkey");
		System.out.println("JSON ���ص�ֵ��"+a);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}			
	}@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
