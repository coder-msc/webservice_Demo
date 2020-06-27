package com.androidServer.service;

import java.util.List;

import com.androidServer.pojo.Values;

public interface IValuesService {

	List<Values> queryVale(String itemName)throws Exception;

}
