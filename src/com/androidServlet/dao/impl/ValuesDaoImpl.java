package com.androidServlet.dao.impl;

import java.util.List;

import com.androidServer.pojo.Values;
import com.androidServlet.dao.IValuesDao;
import com.androidServlet.utils.C3p0Util;
public class ValuesDaoImpl implements IValuesDao {
	public List<Values> queryVal(String itemName) throws Exception {
		String sql="select * from item_test where itemName = ? ORDER BY  itemId  desc LIMIT 1";
		List<Values> listVal=C3p0Util.queryList(sql, Values.class, itemName); 
		System.out.println(listVal+"��ѯ�������һ��ֵ");
		return listVal;
	}

}
