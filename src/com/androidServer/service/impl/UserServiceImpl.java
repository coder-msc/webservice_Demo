package com.androidServer.service.impl;

import java.util.List;

import com.androidServer.pojo.Mange;
import com.androidServer.pojo.Power;
import com.androidServer.pojo.Users;
import com.androidServer.service.IUserService;
import com.androidServlet.Login.dao.IUserDao;
import com.androidServlet.dao.impl.UserDaoImpl;

public class UserServiceImpl implements IUserService {
private IUserDao userdao=new UserDaoImpl();
	public Users Login(String userName, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		return userdao.doLogin(userName, userPassword);
	}
	public List<Users> queryAllUser(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.queryAllUser( user) ;
	}
	public List<Power> queryPower(Power power) throws Exception {
		// TODO Auto-generated method stub
		return userdao.queryPower(  power) ;
	}
	public List<Mange> queryMange(Mange mange) throws Exception {
		// TODO Auto-generated method stub
		return userdao.queryMange(  mange);
	}
	public Integer addUserC(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.addUserC(  user);
	}
	public Integer delUser(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.delUser(  user);
	}
	public Integer changeUserC(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.changeUserC(  user);
	}
	public  Users  queryOneUser(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.queryOneUser(  user);
	}
	public  List<Users>  mangeUserList(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.mangeUserList(user);
	}
	public List<Users> queryHistoryUser(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.queryHistoryUser(  user);
	}
	public Integer recoverUserDel(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.recoverUserDel( user);
	}
	public Integer delForeverUser(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.delForeverUser(  user);
	}
	public Users queryMangeLogin(String userName, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		return userdao.queryMangeLogin(  userName,   userPassword);
	}
	public Users queryTestMangeLogin(Users user) throws Exception {
		// TODO Auto-generated method stub
		return userdao.queryTestMangeLogin(  user);
	}

}
