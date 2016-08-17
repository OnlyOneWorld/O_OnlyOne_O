<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="<%=request.getContextPath()%>/assets/images/favicon_1.ico">

<title>OnlyOne - 首页</title>

<link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/core.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/components.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/icons.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/pages.css" rel="stylesheet" type="text/css" />
      <link href="<%=request.getContextPath()%>/assets/css/responsive.css" rel="stylesheet" type="text/css" />

      <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
      <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->

      <script src="<%=request.getContextPath()%>/assets/js/modernizr.min.js"></script>

	</head>
	<body>

		<div class="account-pages"></div>
		<div class="clearfix"></div>
		<div class="wrapper-page">
			<div class=" card-box">
				<div class="panel-heading">
					<h3 class="text-center"> Reset Password </h3>
				</div>

				<div class="panel-body">
					<form method="post" action="#" role="form" class="text-center">
						<div class="alert alert-info alert-dismissable">
							<button type="button" class="close" data-dismiss="alert" aria-hidden="true">
								×
							</button>
							Enter your <b>Email</b> and instructions will be sent to you!
						</div>
						<div class="form-group m-b-0">
							<div class="input-group">
								<input type="email" class="form-control" placeholder="Enter Email" required="">
								<span class="input-group-btn">
									<button type="submit" class="btn btn-pink w-sm waves-effect waves-light">
										Reset
									</button> 
								</span>
							</div>
						</div>

					</form>
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