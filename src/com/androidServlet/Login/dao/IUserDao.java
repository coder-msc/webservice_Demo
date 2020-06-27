package com.androidServlet.Login.dao;

import java.util.List;

import com.androidServer.pojo.Mange;
import com.androidServer.pojo.Power;
import com.androidServer.pojo.Users;

public interface IUserDao {

	Users doLogin(String userName, String userPassword)throws Exception;

	List<Users> queryAllUser(Users user)throws Exception;

	List<Power> queryPower(Power power)throws Exception;

	List<Mange> queryMange(Mange mange)throws Exception;

	Integer addUserC(Users user)throws Exception;

	Integer delUser(Users user)throws Exception;

	Integer changeUserC(Users user)throws Exception;

	Users queryOneUser(Users user)throws Exception;

	List<Users>  mangeUserList(Users user)throws Exception;

	List<Users> queryHistoryUser(Users user)throws Exception;

	Integer recoverUserDel(Users user)throws Exception;

	Integer delForeverUser(Users user)throws Exception;

	Users queryMangeLogin(String userName, String userPassword)throws Exception;

	Users queryTestMangeLogin(Users user)throws Exception;
}
