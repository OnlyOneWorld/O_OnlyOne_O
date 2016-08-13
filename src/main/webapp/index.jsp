<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta charset="utf-8" />

		<!-- 引入jQuery -->
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/jQuery/jquery-2.1.4.js"></script>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/index/Index.css" />
        
        <!-- 引入用户登陆表单的CSS -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/login/login.css"/>
		<!-- 加载bootstrap的css和js文件 -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/index/Index.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap-theme.css" />
		<script type="text/javascript" src="<%= request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
		
		<title>全球网首页</title>
	</head>
	<body>
		<div class="main">
			<div class="main-top">
				<div class="logo">全世界首页</div>
				<div class="login"><a href="pages/loginPage/loginPage.html" id="loginPage" data-toggle="modal" data-target="#myModal">登陆</a></div>
				<div class="register"><a href="pages/loginPage/loginPage.html" data-toggle="modal" id="registerPage" data-target="#myRegister">注册</a></div>
			</div>
			<div class="main-footer">
				
			</div>			
		</div>
		<!-- 将登陆页面包含进来 -->
		<jsp:include page="jsp/login/login_modal.jsp"></jsp:include>

		<!-- 将注册页面包含进来 -->
		<jsp:include page="jsp/register/register_modal.jsp"></jsp:include>
	</body>
</html>
