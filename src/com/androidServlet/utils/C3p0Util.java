package com.androidServlet.utils;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;


// Apache-DButils.jar
//C3p0Util = C3P0���ӳ� + Dbutils��ɾ�Ĳ�  

public class C3p0Util {
	//˽�л���̬����
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource("dataSources");//����ģʽ
	private static QueryRunner qr=new QueryRunner(dataSource);
	//˽�л����캯��
	private C3p0Util(){
		
	}
	//�ṩһ���ⲿ��̬�ķ��ʷ���
	public static ComboPooledDataSource getInstance(){	
		return dataSource;
	}
	
	//��ȡ���ӵķ���
	public static Connection getConn() throws SQLException{
		System.out.println(dataSource);
		return dataSource.getConnection();
	}
	
	/**
	 * ͨ�õĲ�ѯ�������ݵķ���
	 * @param sql
	 * @param t
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static <T>List<T> queryList(String sql,Class<T> t,Object...params)
			throws SQLException{
		List<T> list=qr.query(sql, new BeanListHandler<T>(t), params);
		
		return list;
	}
	/**
	 * ��ѯһ������ķ���
	 * @param sql
	 * @param t
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static <T>T queryOne(String sql,Class<T> t,Object...params) 
			throws SQLException{
		T entity=qr.query(sql, new BeanHandler<T>(t), params);
		return entity;
	}
	/**
	 * ��ѯһ����ֵ�͵����ݵķ���
	 * @param sql
	 * @param t
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static <T>T queryNumber(String sql,Class<T> t,Object...params) 
			throws SQLException{
		T entity=qr.query(sql, new ScalarHandler<T>(), params);
		return entity;
	}
	/**
	 * ͨ�õ�ִ�и������ݵķ������������ӡ��޸ġ�ɾ��
	 * @param sql
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static int update(String sql,Object...params)
			throws SQLException{
		System.out.println("��ȡ����Dbutil��ĸ��·���");
		int rows=qr.update(sql, params);
		return rows;
	}
}
