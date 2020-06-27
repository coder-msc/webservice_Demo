package com.androidServer.service.impl;

import java.util.List;

import com.androidServer.pojo.Values;
import com.androidServer.service.IValuesService;
import com.androidServlet.dao.IValuesDao;
import com.androidServlet.dao.impl.ValuesDaoImpl;

public class ValuesServiceImpl implements IValuesService {
private IValuesDao valuedao=new ValuesDaoImpl();
	public List<Values> queryVale(String itemName) throws Exception {
		// TODO Auto-generated method stub
		List<Values> listVal=valuedao.queryVal(itemName);
		return listVal;
	}

}
