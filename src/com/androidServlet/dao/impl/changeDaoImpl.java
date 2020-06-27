package com.androidServlet.dao.impl;

import com.androidServlet.dao.changeDao;
import com.androidServlet.utils.C3p0Util;

public class changeDaoImpl implements changeDao {

	public void insertDevice(String name, String val,String user) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into item_changeVal (deviceName,deviceVal,userName,changeDate) values(?,?,?,NOW() ) ";
		C3p0Util.update(sql, name,val,user);
	}

}
