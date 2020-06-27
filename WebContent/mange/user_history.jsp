<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	//获取绝对路径路径 
	String path = request.getContextPath();

			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
	%>   
<%@ taglib prefix="d" uri="http://displaytag.sf.net" %>	   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>管理</title>
<link href="resource1/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="resource1/js/bootstrap.min.js"></script>

</head>
<body>
<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>管理</li>
			<li>员工列表</li>
		</ul>
	</div>
	<form action="system/queryUsers" id="f1" class="form-inline" method="post">
	
		<div class="row" style="padding: 15px;">
			<d:table class="table table-hover table-condensed" name="AllUserList" pagesize="15" requestURI="../list">
				<%-- <d:column property="ck" title="<input type='checkbox'  id='all'  />"></d:column> --%>
				<d:column property="userId" title="Id"></d:column>
				<d:column property="userAName" title="姓名"></d:column>
				<d:column property="userName" title="登陆账号"></d:column>
				
				<d:column property="userPassword" title="登陆密码"></d:column>
				<d:column property="powerName" title="员工职位"></d:column>
				<d:column property="mangeName" title="人事管理权"></d:column>
				
				<d:column value="彻底删除" href="delForever" paramId="userId" paramProperty="userId"></d:column>
				<d:column  title="操作"></d:column>
				<d:column value="恢复" href="recoverUser" paramId="userId" paramProperty="userId"></d:column>
				
				
				
				
			</d:table>
		</div>
	</form>
	<!-- <input name='nam' value="删除历史" class="btn btn-success" type="button" onclick="location.href='addUser'"/>
	<input name='nam2' value="添加员工" class="btn btn-primary" type="button" onclick="location.href='addUser'"/> -->
		
</body>
</html>