<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="modal fade" id="myRegister" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <!-- 模态窗口的头部 -->
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">欢迎注册<span style="color:red">全世界网站</span></h4>
	      </div>
	      <!-- 模态窗口的body:是一个用户登陆表单 -->
	      <div class="modal-body">
	      	<!-- 用户登陆表单设计 -->
	      	<form class="form-horizontal">
	      	  <!-- 用户邮箱 -->
			  <div class="control-group">
				  <div class="controls">
				    <div class="input-prepend">
				      <span class="add-on" style="height:46px;width: 46px;"><i class="icon-envelope" style="margin-top:12px;"></i></span>
				      <input class="span4 form-control" name="userEmail" style="height:46px;" id="inputIcon" type="text"placeholder="Email">
				    </div>
				  </div>
			 </div>
			 <!-- 用户手机 -->
			 <div class="control-group">
			  <div class="controls">
			    <div class="input-prepend">
			      <span class="add-on" style="height:46px;width: 46px;"><i class="icon-list-alt" style="margin-top:12px;"></i></span>
			      <input class="span4" id="inputIcon" type="text" name="userPhone" id="userPhone" style="height:46px;" placeholder="手机号码">
			    </div>
			  </div>
			</div>
			<!-- 用户密码 -->
			 <div class="control-group">
			  <div class="controls">
			    <div class="input-prepend">
			      <span class="add-on" style="height:46px;width: 46px;"><i class="icon-lock" style="margin-top:12px;"></i></span>
			      <input class="span4" id="inputIcon" type="password" name="userPassword" id="userPassword" style="height:46px;" placeholder="密码">
			    </div>
			  </div>
			</div>
			 <!-- 再次输出用户密码 -->
			 <div class="control-group">
			  <div class="controls">
			    <div class="input-prepend">
			      <span class="add-on" style="height:46px;width: 46px;"><i class="icon-lock" style="margin-top:12px;"></i></span>
			      <input class="span4" id="inputIcon" type="password" name="reUserPassword" id="reUserPassword"name="userPassword" id="userPassword" style="height:46px;" placeholder="再次输入密码">
			    </div>
			  </div>
			</div>
		    <div class="control-group">
		      <div class="controls">
		        <button type="submit" class="btn-primary btn" style="width:332px;height:46px;">注册</button>
		      </div>
		    </div>
			</form>
	      </div>
	    </div>
	  </div>
	</div>