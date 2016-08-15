<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
	<!-- 引入jQuery -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jQuery/jquery-2.1.4.js"></script>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="<%= request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
	<style type="text/css">
       	.rgForm{
       		margin-top: 10%;
       		margin-left: 25%;
       	}
       	.login_way{
       		margin-left:38%;
       		
       	}
    </style>
    <script type="text/javascript">
        	$(document).ready(function(){
        		//获取表单数据
        		var userEmail = $("#userEmail").val();
        		var userPhone = $("#userPhone").val();
        		var userPassword = $("#userPassword").val();
        		var reUserPassword = $("#reUserPassword").val();
        		
        		if(userEmail == "" || userPhone == "" || userPassword == "" || reUserPassword == "")
        		{
        			$("#doRegister").attr("disabled",true);
        		}
        		else
        		{
        			$("#doRegister").attr("disabled",false);
        		}
        		
        	});
        </script>
</head>
<body>
	<div class="rgForm">
		<form class="form-horizontal" action="<%=request.getContextPath()%>/registerAction!userRegisterAction.action" method="psot">
			<div class="control-group success">
				<div class="controls">
					<div class="input-append">
						<span class="add-on" style="height: 46px;width: 46px;"><i class="icon-envelope" style="margin-top:12px ;"></i></span>
						<input class="span4 form-control" name="userEmail" style="height:46px;" type="text"placeholder="Email">
					</div>
				</div>
			</div>
			<div class="control-group success">
				<div class="controls">
					<div class="input-append">
						<span class="add-on" style="height:46px;width: 46px;"><i class="icon-list-alt" style="margin-top:12px;"></i></span>
		      			<input class="span4" type="text" name="userPhone" id="userPhone" style="height:46px;" placeholder="手机号码">	
					</div>
				</div>
			</div>
			<div class="control-group success">
				<div class="controls">
					<div class="input-append">
						<span class="add-on" style="height:46px;width: 46px;"><i class="icon-lock" style="margin-top:12px;"></i></span>
	     				<input class="span4" type="password" name="userPassword" id="userPassword" style="height:46px;" placeholder="密码">	
					</div>
				</div>
			</div>
			<div class="control-group success">
				<div class="controls">
					<div class="input-append">
						<span class="add-on" style="height:46px;width: 46px;"><i class="icon-lock" style="margin-top:12px;"></i></span>
		      			<input class="span4" type="password" name="reUserPassword" id="reUserPassword"name="reUserPassword" style="height:46px;" placeholder="再次输入密码">
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button class="btn-success btn" id="doRegister" style="width:356px;height:56px;">注册</button>
				</div>
			</div>
		</form>
	</div>
	<!--使用第三方账号登陆-->
	<div class="login_way">
		<div class="login_away">
			<a class="weixin" href="#">微信</a>
			<a class="weibo"  href="#">微博</a>
			<a class="renren" href="#">人人</a>
			<a class="douban" href="#">豆瓣</a>
		</div>
	</div>
	</body>
</html>