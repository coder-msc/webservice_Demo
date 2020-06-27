package com.androidServlet.dao.impl;

import java.util.List;

import com.androidServer.pojo.Mange;
import com.androidServer.pojo.Power;
import com.androidServer.pojo.Users;
import com.androidServlet.Login.dao.IUserDao;
import com.androidServlet.utils.C3p0Util;

public class UserDaoImpl implements IUserDao {

	public Users doLogin(String userName, String userPassword) throws Exception {
		String sql="select * from item_users where userName = ? and userPassword = ?";
		Users row=C3p0Util.queryOne(sql, Users.class, userName,userPassword);
		return row;
	}

	public List<Users> queryAllUser(Users user) throws Exception {
		String sql="select * from item_users u ,item_user_power p, item_user_mange m  where remark !=-1"
				+ " and u.power=p.powerId and u.superMange=m.mangeId order by userId asc";
		List<Users> users=C3p0Util.queryList(sql, Users.class);
		return users;
	}

	public List<Power> queryPower(Power power) throws Exception {
		String sql="select * from item_user_power ";
				
		List<Power> users=C3p0Util.queryList(sql, Power.class);
		return users;
	}

	public List<Mange> queryMange(Mange mange) throws Exception {
		String sql="select * from item_user_mange " ;
		List<Mange> users=C3p0Util.queryList(sql, Mange.class);
		return users;
	}

	public Integer addUserC(Users user) throws Exception {
		String sql="insert into  item_users(userAName,userName,userPassword,power,superMange,remark) values(?,?,?,?,?,1) " ;
		int a=C3p0Util.update(sql, user.getUserAName(),user.getUserName(),user.getUserPassword(),user.getPower(),user.getSuperMange());
		return a;
		
		
	}

	public Integer delUser(Users user) throws Exception {
		String sql="update item_users set remark = -1 where userId= ? " ;
		int a=C3p0Util.update(sql, user.getUserId());
		return a;
	}

	public Integer changeUserC(Users user) throws Exception {
		String sql=" update item_users set  userAName = ?,userName = ? ,userPassword = ? ,power = ? , superMange = ?  where userId = ? " ;
		int a=C3p0Util.update(sql,user.getUserAName(),user.getUserName(),user.getUserPassword(),user.getPower(),user.getSuperMange(), user.getUserId());
		return a;
	}

	public Users queryOneUser(Users user) throws Exception {
		String sql="select * from item_users u ,item_user_power p, item_user_mange m  where remark !=-1"
				+ " and u.power=p.powerId and u.superMange=m.mangeId and u.userId= ?";				
		Users users=C3p0Util.queryOne(sql, Users.class,user.getUserId());
		return users;
	}

	public  List<Users> mangeUserList(Users user) throws Exception {
		String sql="select * from item_users where userName = ? and userPassword =  ? and remark != -1 ";//and remark != -1
		List<Users>  users1=C3p0Util.queryList(sql ,Users.class,user.getUserName(),user.getUserPassword() );
		System.out.println("IMPL中的查询用户的信息"+users1 +user.getUserName()+user.getUserPassword());
		return users1;
	}

	public List<Users> queryHistoryUser(Users user) throws Exception {
		String sql="select * from item_users u ,item_user_power p, item_user_mange m  where remark =-1"
				+ " and u.power=p.powerId and u.superMange=m.mangeId order by userId desc";
		List<Users> users=C3p0Util.queryList(sql, Users.class);
		return users;
	}

	public Integer recoverUserDel(Users user) throws Exception {
		String sql="update item_users set remark = 1 where userId= ? " ;
		int a=C3p0Util.update(sql, user.getUserId());
		return a;
	}

	public Integer delForeverUser(Users user) throws Exception {
		String sql="delete from item_users  where userId= ? " ;
		int a=C3p0Util.update(sql, user.getUserId());
		return a;
	}

	public Users queryMangeLogin(String userName, String userPassword) throws Exception {
		String sql="select * from item_users where userName = ? and userPassword =  ? and remark != -1 ";//and remark != -1
		Users  users1=C3p0Util.queryOne(sql, Users.class,userName, userPassword);
		//System.out.println("测试L中的查询用户的信息"+users1 +user.getUserName()+user.getUserPassword());
		return users1;
	}

	public Users queryTestMangeLogin(Users user) throws Exception {
		String sql="select * from item_users where userName = ? and userPassword = ? ";
		Users userst =C3p0Util.queryOne(sql, Users.class, user.getUserName(),user.getUserPassword());
		return userst;
	}

}
