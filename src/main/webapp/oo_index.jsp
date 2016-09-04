<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 导入主页的样式表index.css -->
 <link href="<%=request.getContextPath()%>/css/index/Index.css" rel="stylesheet" type="text/css" />
<title>OnlyOne - 首页</title>
</head>
<body>
	<!-- 包含一个通用主页 -->
	<jsp:include page="/jsp/oo_main/oo_main.jsp"></jsp:include>
	
	<!-- 以下内容分模块学习框架的内容和后台编写测试 -->
	<div class="main">
		<div class="part1">
			<ul class="register">
				<li><h3>用户注册表单:</h3></li>
			</ul>
			<ol class="example1">
				<li>
					<div class="example1_one">
						<a href="<%=request.getContextPath()%>/jsp/oo_register/oo_register3.jsp">用户注册表单一:没有第三方登陆</a>
					</div>
				</li>
				
				<li>
					<div class="example1_one">
						<a href="<%=request.getContextPath()%>/jsp/oo_register/oo_register.jsp">用户注册表单二:有第三方登陆</a>
					</div>
				</li>
				
				<li>
					<div class="example1_one">
						<a href="<%=request.getContextPath()%>/jsp/oo_register/oo_register2.jsp">用户注册表单三:按照注册流程注册</a>
					</div>
				</li>
				<!-- test -->
				<li>
					<div class="example1_one">
						<a href="<%=request.getContextPath()%>/jsp/ajax/ajaxTest.jsp">用户注册表单三:按照注册流程注册</a>
					</div>
				</li>
			</ol>
		</div>
		
		<div class="part2">
			<ul class="register">
				<li><h3>Ajax测试:</h3></li>
			</ul>
			<ol class="example1">
				<li>
					<div class="example1_one">
						<a href="<%=request.getContextPath()%>/jsp/ajax/LoginCheck/LoginCheck.jsp">测试ajax异步请求数据库</a>
					</div>
				</li>
			</ol>
		</div>
		
		<div class="part3">
			<ol class="example1">
				<li>
					<div class="example1_one">
						<a href="#">第三部分</a>
					</div>
				</li>
			</ol>
		</div>
		
		<div class="part4">
			<ol class="example1">
				<li>
					<div class="example1_one">
						<a href="#">第四部分</a>
					</div>
				</li>
			</ol>
		</div>
		
		<div class="part5">
			<ol class="example1">
				<li>
					<div class="example1_one">
						<a href="#">第五部分</a>
					</div>
				</li>
			</ol>
		</div>
		
		<div class="part6">
			<ol class="example1">
				<li>
					<div class="example1_one">
						<a href="#">第六部分</a>
					</div>
				</li>
			</ol>
		</div>
	</div>
</body>
</html>