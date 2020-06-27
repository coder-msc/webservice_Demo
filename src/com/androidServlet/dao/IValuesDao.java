package com.androidServlet.dao;

import java.util.List;

import com.androidServer.pojo.Values;

public interface IValuesDao {

	List<Values> queryVal(String itemName)throws Exception;

}
