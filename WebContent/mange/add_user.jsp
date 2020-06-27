<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%
	//获取绝对路径路径 
	String path = request.getContextPath();

	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>用户管理-添加员工</title>
<link href="resource1/css/bootstrap.min.css" rel="stylesheet" />
<!-- <link href="resource/css/main.css" rel="stylesheet" /> -->
<script type="text/javascript" src="resource1/js/jquery.min.js"></script>
<script type="text/javascript" src="resource1/js/bootstrap.min.js"></script>

<script type="text/javascript" src="resource1/validation/jquery.validate.js"></script>



</head>
<body>
	<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>管理</li>
			<li>添加员工</li>
		</ul>
	</div>
	<div class="alert alert-warning alert-dismissible fade in" role="alert"
		style="display:${tip==null?'none':'block' };margin-bottom: 0px;">
		<h4 align="center" style="color: red">${tip }</h4>
	</div>
	 <!-- enctype="multipart/form-data"	 -->
	<form action="addUser" id="f1" method="post"
		class="form-horizontal">
		<!--<input type="hidden" name="userId" id="userId" value="$    "/> 添加的人 -->
		
		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">基本信息</h5>
		<!-- 开始1 -->
		<div class="row">
		<div class="col-xs-7">
				<div class="form-group ">
					<label class="col-xs-3 control-label">姓名</label>
					<div class="col-xs-9 ">
						<input type="text" class="form-control" required name="userAName"
							value=" "  />
					</div>
				</div>
			</div>
			<div class="col-xs-7">
				<div class="form-group ">
					<label class="col-xs-3 control-label">登陆账号</label>
					<div class="col-xs-9 ">
						<input type="text" class="form-control" required name="userName"
							value=" "  />
					</div>
				</div>
			</div>
			<div class="col-xs-7">
				<div class="form-group ">
					<label class="col-xs-3 control-label">登陆密码</label>
					<div class="col-xs-9 ">
						<input type="text" class="form-control" required name="userPassword"
							value="" />
					</div>
				</div>
			</div>
			<div class="col-xs-7">
				
					<div class="form-group ">
					<label class="col-xs-3 control-label">员工职位</label>
					<div class="col-xs-5 ">
						<select class="form-control" required name="power" id="power">
							<option value="">选择</option>
							<c:forEach items="${PowerList }" var="p">
								<option value="${p.powerId }">${p.powerName }</option>
							</c:forEach>
						</select>
						</div>
				</div>
					
					<div class="form-group ">
					<label class="col-xs-3 control-label">人事管理权</label>
					<div class="col-xs-5 ">
						<select class="form-control" required name="superMange" id="superMange">
							<option value="">选择</option>
							<c:forEach items="${MangeList }" var="m">
								<option value="${m.mangeId }">${m.mangeName }</option>
							</c:forEach>
						</select>
						</div>
				</div>
					
					
					
					
					
					
					
					
					
					
					
					
				</div>
			</div>
			
		</div>
		
				<div class="row">
			<div class="col-xs-3 col-xs-offset-4">
				<!-- <input type="button" id="but" class="btn btn-primary" value="保存但不提交" />  -->
				<input type="submit" class="btn btn-success" value="提交" />
			</div>

		</div>

	</form>
	


</body>
</html>