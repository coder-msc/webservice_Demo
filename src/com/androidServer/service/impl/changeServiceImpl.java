package com.androidServer.service.impl;

import com.androidServer.service.changeService;
import com.androidServlet.dao.changeDao;
import com.androidServlet.dao.impl.changeDaoImpl;

public class changeServiceImpl implements changeService {

	private changeDao changedao=new changeDaoImpl();
	public void insertDevice(String name, String val,String user) throws Exception {
		// TODO Auto-generated method stub
		changedao.insertDevice(name,val,user);
		
	}

}
