<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>AjaxTest</title>
<!-- 导入js -->
<script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>
<!-- 这里编写CSS -->
<style type="text/css">
	
</style>

<!-- 这里编写JavaScript -->
<script type="text/javascript">
	
</script>
</head>
<body>
	<div>
		<form action="<%=request.getContextPath()%>/" method="post" class="ajaxDemo">
			<div>
				<label class="userNameClass" for="userName">用户名</label>
				<input class="userName" name="userName" placeholder="用户名">
			</div>
			<div>
				<input type="submit" value="提交">
			</div>
		</form>
	</div>
</body>
</html>