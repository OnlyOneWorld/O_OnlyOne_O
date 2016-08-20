<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
		<meta name="author" content="Coderthemes">

		<link rel="shortcut icon" href="<%=request.getContextPath()%>/assets/images/favicon_1.ico">

		<title>OnlyOne - 注册</title>
		
		<!--Form Wizard-->
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/assets/plugins/jquery.steps/demo/css/jquery.steps.css" />

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
		<!--
        	作者：offline
        	时间：2016-08-17
        	描述:在这个页面中重新编写wrapper-page显示布局
        -->
        <style type="text/css">
        	.wrapper-page-register{
        		width: 65%;
        	}
        	.input-length{
        		width: 40%;
        		height: 48px;
        	}
        </style>
        <script src="<%=request.getContextPath()%>/assets/js/modernizr.min.js"></script>

	</head>

	<body class="fixed-left">
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
		<div class="account-pages">
			
		</div>
		
		<div class="clearfix">
			
		</div>
        <!-- Wizard with Validation -->
        <div class="wrapper-page wrapper-page-register">
	        <div class="row">
				<div class="col-sm-12">
					<div class="card-box">
						<h1 class="m-t-0 header-title" style="text-align: center !important;"><b>风会指引你前行</b></h4>
						<p class="text-muted m-b-30 font-13">
							一切尽在掌握！
						</p>
						
						<form id="wizard-validation-form" action="#">
	                        <div>
	                            <h3>Step 1</h3>
	                            <section>
	                                <div class="form-group clearfix">
	                                    <label class="col-lg-2 control-label " for="userName2">User name </label>
	                                    <div class="col-lg-10">
	                                        <input class="form-control" id="userName2" name="userName" type="text" placeholder="用户名">
	                                    </div>
	                                </div>
	                                <div class="form-group clearfix">
	                                    <label class="col-lg-2 control-label " for="password2"> Password *</label>
	                                    <div class="col-lg-10">
	                                        <input id="password2" name="password" type="text" class="required form-control" placeholder="输入密码">
	                                    </div>
	                                </div>
	
	                                <div class="form-group clearfix">
	                                    <label class="col-lg-2 control-label " for="confirm2">Confirm Password *</label>
	                                    <div class="col-lg-10">
	                                        <input id="confirm2" name="confirm" type="text" class="required form-control" placeholder="确认密码">
	                                    </div>
	                                </div>
	                            </section>
	                            <h3>Step 2</h3>
	                            <section>
	
	                                <div class="form-group clearfix">
	                                    <label class="col-lg-2 control-label" for="name2"> First name *</label>
	                                    <div class="col-lg-10">
	                                        <input id="name2" name="name" type="text" class="required form-control">
	                                    </div>
	                                </div>
	                                <div class="form-group clearfix">
	                                    <label class="col-lg-2 control-label " for="surname2"> Last name *</label>
	                                    <div class="col-lg-10">
	                                        <input id="surname2" name="surname" type="text" class="required form-control">
	
	                                    </div>
	                                </div>
	
	                                <div class="form-group clearfix">
	                                    <label class="col-lg-2 control-label " for="email2">Email *</label>
	                                    <div class="col-lg-10">
	                                        <input id="email2" name="email" type="text" class="required email form-control">
	                                    </div>
	                                </div>
	
	                                <div class="form-group clearfix">
	                                    <label class="col-lg-2 control-label " for="address2">Address </label>
	                                    <div class="col-lg-10">
	                                        <input id="address2" name="address" type="text" class="form-control">
	                                    </div>
	                                </div>
	                            </section>
	                            <h3>Step 3</h3>
	                            <section>
	                                <div class="form-group clearfix">
	                                    <div class="col-lg-12">
	                                        <ul class="list-unstyled w-list">
	                                            <li><b>First Name :</b> Jonathan </li>
	                                            <li><b>Last Name :</b> Smith </li>
	                                            <li><b>Emial:</b> jonathan@smith.com</li>
	                                            <li><b>Address:</b> 123 Your City, Cityname. </li>
	                                        </ul>
	                                    </div>
	                                </div>
	                            </section>
	                            <h3>Step Final</h3>
	                            <section>
	                                <div class="form-group clearfix">
	                                    <div class="col-lg-12">
	                                        <input id="acceptTerms-2" name="acceptTerms2" type="checkbox" class="required">
	                                        <label for="acceptTerms-2">I agree with the Terms and Conditions.</label>
	                                    </div>
	                                </div>
	
	                            </section>
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
        </div> 
         <!-- End row -->
            </div> <!-- container -->
                               
                </div> <!-- content -->

                <footer class="footer">
                    2016 © OnlyOne.
                </footer>
            </div>
            <!-- ============================================================== -->
            <!-- End Right content here -->
            <!-- ============================================================== -->

        </div>
        <!-- END wrapper -->

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

        <!--Form Validation-->
        <script src="<%=request.getContextPath()%>/assets/plugins/bootstrapvalidator/dist/js/bootstrapValidator.js" type="text/javascript"></script>

        <!--Form Wizard-->
        <script src="<%=request.getContextPath()%>/assets/plugins/jquery.steps/build/jquery.steps.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/assets/plugins/jquery-validation/dist/jquery.validate.min.js"></script>

        <!--wizard initialization-->
        <script src="<%=request.getContextPath()%>/assets/pages/jquery.wizard-init.js" type="text/javascript"></script>

	
	</body>
</html>