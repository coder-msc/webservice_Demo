package com.mapper;



import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.androidServer.pojo.Users;

public class mybatisTest {
@Test
	public void test11(){
	try {
		InputStream in1=Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in1);
		SqlSession sqsession=factory.openSession();
		maperInterface maperInface =sqsession.getMapper(maperInterface.class);
		Users users=maperInface.selectByIdUser("777");
		sqsession.commit();
		sqsession.close();
		System.out.println(users);
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
}
