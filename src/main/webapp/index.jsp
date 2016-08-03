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
				<div class="register"><a href="<%=request.getContextPath()%>/jsp/register/register.jsp" id="registerPage">注册</a></div>
			</div>
			<div class="main-footer">
				
			</div>			
		</div>
		
		<!-- 莫泰弹出框登陆表单 -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <!-- 模态窗口的头部 -->
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        <h4 class="modal-title" id="myModalLabel">欢迎登陆<span style="color:red">全世界网站</span></h4>
		      </div>
		      <!-- 模态窗口的body:是一个用户登陆表单 -->
		      <div class="modal-body">
		      	<!-- 用户登陆表单设计 -->
		      	<form class="form-horizontal">
				  <div class="control-group">
					  <div class="controls">
					    <div class="input-prepend">
					      <span class="add-on" style="height:46px;width: 46px;"><i class="icon-user" style="margin-top:12px;"></i></span>
					      <input class="span4 form-control" style="height:46px;" id="inputIcon" type="text"placeholder="用户名">
					    </div>
					  </div>
					</div>
				  <div class="control-group">
				  <div class="controls">
				    <div class="input-prepend">
				      <span class="add-on" style="height:46px;width: 46px;"><i class="icon-lock" style="margin-top:12px;"></i></span>
				      <input class="span4" id="inputIcon" type="password" style="height:46px;" placeholder="密码">
				    </div>
				  </div>
				</div>
				
				<!-- 验证码 -->
				<div class="control-group">
				  <div class="controls">
				    <div class="input-prepend">
				      <span class="add-on" style="height:46px;width: 46px;"><i class="icon-th" style="margin-top:12px;"></i></span>
				      <input class="span4 form-control" style="width:120px;height:46px;" id="inputIcon" type="text" placeholder="验证码">
				    </div>
				  </div>
				</div>
				  <div class="control-group">
				    <div class="controls">
				      <button type="submit" class="btn-primary btn" style="width:332px;height:46px;">Login in</button>
				    </div>
				  </div>
				</form>
		      </div>
		    </div>
		  </div>
		</div>
	</body>
</html>
