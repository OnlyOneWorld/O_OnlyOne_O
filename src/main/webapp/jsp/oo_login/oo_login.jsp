<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

	  <link rel="shortcut icon" href="<%=request.getContextPath()%>/assets/images/favicon_1.ico">

	  <title>OnlyOne - 登录</title>

	  <link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/core.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/components.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/icons.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/pages.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/responsive.css" rel="stylesheet" type="text/css" />
      
      <style type="text/css">
			#userNameBg{
				background-image:url(/assets/images/z_sign.png) !important;
				background-repeat: no-repeat;
			}
			.checkCode{
				width: 50%;
			}
	  </style>
      <script src="<%=request.getContextPath()%>/assets/js/modernizr.min.js"></script>
</head>
<body>
	<div id="wrapper">
         <!-- 导航栏显示:放置用户不想登录时无法返回首页 -->
         <div class="topbar">

             <!-- LOGO -->
             <div class="topbar-left">
                 <div class="text-center">
                     <a href="oo_main.html" class="logo"><i class="icon-magnet icon-c-logo"></i><span><i class="md md-album"></i>nly</span><i class="icon-magnet icon-c-logo"></i><span><i class="md md-album"></i>ne</span></a>
                 </div>
             </div>
             <!-- Button mobile view to collapse sidebar menu -->
             <div class="navbar navbar-default" role="navigation">
                 <!--导航栏内容省略-->
             </div>
         </div>
		<div class="account-pages">
			
		</div>
		
		<div class="clearfix">
			
		</div>
		
		<div class="wrapper-page">
			<div class="card-box">
				<div class="panel-heading">
					<h3 class="text-center">Welcome to sign In <strong class="text-custom">OnlyOne</strong></h3>
				</div>

				<div class="panel-body">
					<form class="form-horizontal m-t-20" action="oo_index.html">

						<div class="form-group ">
							<div class="col-xs-12">
								<!--<span class="glyphicon glyphicon-search" aria-hidden="false"></span>-->
								<input class="form-control" type="text" name="userEmail" required="" placeholder="邮箱/用户名/手机" id="userNameBg">
							</div>
						</div>

						<div class="form-group">
							<div class="col-xs-12">
								<input class="form-control" type="password" name="userPassword" required="" placeholder="密码">
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-xs-12">
								<input class="form-control checkCode" type="text" name="checkCode" required="" placeholder="验证码">
							</div>
						</div>

						<div class="form-group ">
							<div class="col-xs-12">
								<div class="checkbox checkbox-primary">
									<input id="checkbox-signup" type="checkbox">
									<label for="checkbox-signup"> 记住账户<i style="color: red;">30</i>天 </label>
								</div>

							</div>
						</div>

						<div class="form-group text-center m-t-40">
							<div class="col-xs-12">
								<button class="btn btn-success btn-block text-uppercase waves-effect waves-light" type="submit">
									登 录
								</button>
							</div>
						</div>

						<div class="form-group m-t-20 m-b-0">
							<div class="col-sm-12">
								<a href="oo-recoverpw.html" class="text-dark"><i class="fa fa-lock m-r-5"></i>忘记密码?</a>
							</div>
						</div>
						
						<div class="form-group m-t-20 m-b-0">
							<div class="col-sm-12 text-center">
								<h4><b>使用第三方账户登录</b></h4>
							</div>
						</div>
						
						<div class="form-group m-b-0 text-center">
							<div class="col-sm-12">
								<button type="button" class="btn btn-facebook waves-effect waves-light m-t-20">
		                           <i class="fa fa-facebook m-r-5"></i> Facebook
		                        </button>

		                        <button type="button" class="btn btn-twitter waves-effect waves-light m-t-20">
		                           <i class="fa fa-twitter m-r-5"></i> Twitter
		                        </button>

		                        <button type="button" class="btn btn-googleplus waves-effect waves-light m-t-20">
		                           <i class="fa fa-google-plus m-r-5"></i> Google+
		                        </button>
							</div>
						</div>
					</form>

				</div>
			</div>
			<div class="row">
				<div class="col-sm-12 text-center">
					<p>
						还没有账户? <a href="<%=request.getContextPath()%>/jsp/oo_register/oo_register.jsp" class="text-primary m-l-5"><b>点击注册</b></a>
					</p>
				</div>
			</div>

			</div>
	
			<script>
				var resizefunc = [];
			</script>
	
			<!-- jQuery  -->
	        <script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/bootstrap.min.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/detect.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/fastclick.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/jquery.slimscroll.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/jquery.blockUI.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/waves.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/wow.min.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/jquery.nicescroll.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/jquery.scrollTo.min.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/jquery.core.js"></script>
	        <script src="<%=request.getContextPath()%>/assets/js/jquery.app.js"></script>
	</body>
</html>