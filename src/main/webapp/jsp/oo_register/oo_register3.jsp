<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
		<meta name="author" content="Coderthemes">

		<link rel="shortcut icon" href="assets/images/favicon_1.ico">

		<title>Ubold - Responsive Admin Dashboard Template</title>

		<link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="<%=request.getContextPath()%>/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="<%=request.getContextPath()%>/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="<%=request.getContextPath()%>/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="<%=request.getContextPath()%>/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="<%=request.getContextPath()%>/assets/css/responsive.css" rel="stylesheet" type="text/css" />

        <script src="<%=request.getContextPath()%>/assets/js/modernizr.min.js"></script>
		<style type="text/css">
			.checkCode{
				width: 50%;
			}
		</style>
	</head>
	<body>
		<!-- 导航栏显示:放置用户不想登录时无法返回首页 -->
         <div class="topbar">
             <!-- LOGO -->
             <div class="topbar-left">
                 <div class="text-center">
                      <a href="<%=request.getContextPath()%>/oo_index.jsp" class="logo"><i class="icon-magnet icon-c-logo"></i><span><i class="md md-album"></i>nly</span><i class="icon-magnet icon-c-logo"></i><span><i class="md md-album"></i>ne</span></a>
                 </div>
             </div>
             <!-- Button mobile view to collapse sidebar menu -->
             <div class="navbar navbar-default" role="navigation">
                 <!--导航栏内容省略-->
             </div>
         </div>
         
		<div class="account-pages"></div>
		
		<div class="clearfix"></div>
		
		<div class="account-pages"></div>
		<div class="clearfix"></div>
		<div class="wrapper-page">
			<div class=" card-box">
				<div class="panel-heading">
					<h3 class="text-center">Welcom to Sign Up <strong class="text-custom">OnlyOne</strong> </h3>
				</div>

				<div class="panel-body">
					<form class="form-horizontal m-t-20" action="<%=request.getContextPath()%>/_registerAction!userRegisterAction.action" method="post">

						<div class="form-group ">
							<div class="col-xs-12">
								<input class="form-control" type="email" name="userEmail" required="" placeholder="邮箱">
							</div>
						</div>

						<div class="form-group ">
							<div class="col-xs-12">
								<input class="form-control" type="text" name="userPhone" required="" placeholder="手机">
							</div>
						</div>

						<div class="form-group">
							<div class="col-xs-12">
								<input class="form-control" type="password" name="userPassword" required="" placeholder="密码">
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-xs-12">
								<input class="form-control" type="password" name="reUserPassword" required="" placeholder="确认密码">
							</div>
						</div>
						<!-- 
						<div class="form-group">
							<div class="col-xs-12">
								<input class="form-control checkCode" type="text" name="checkCode" required="" placeholder="验证码">
							</div>
						</div>
						
						<div class="form-group">
							<div class="col-xs-12">
								<div class="checkbox checkbox-primary">
									<input id="checkbox-signup" type="checkbox" name="rememberMe" checked="checked">
									<label for="checkbox-signup">我同意 <a href="#">《OnlyOne用户注册协议》</a></label>
								</div>
							</div>
						</div>
						 -->
						<div class="form-group text-center m-t-40">
							<div class="col-xs-12">
								<button class="btn btn-pink btn-block text-uppercase waves-effect waves-light" type="submit">
									注册
								</button>
							</div>
						</div>
					</form> 
				</div>
			</div>

			<div class="row">
				<div class="col-sm-12 text-center">
					<p>
						已经有账户?<a href="<%=request.getContextPath()%>/jsp/oo_login/oo_login.jsp" class="text-primary m-l-5"><b>点击登陆</b></a>
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