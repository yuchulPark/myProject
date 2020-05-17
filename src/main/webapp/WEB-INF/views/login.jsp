<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="layoutTag" tagdir="/WEB-INF/tags"%>

<layoutTag:layout>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style type="text/css">
	.panel-info > .panel-heading{
		color:white;
		border-color: black;
		background-color: black;
	}
	.panel-info{
		border-color: black;
	}
	.btn-success, #btn-join{
		background-color: black;
	}
</style>
<script type="text/javascript">
	$(function(){
		$("#btn-login").click(function(){
			location.href = "/main.do"
		})
	})
</script>
</head>
<body>
	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">
					<div style="display: none" id="login-alert" class="alert alert-danger col-sm-12"></div>

					<form id="loginform" class="form-horizontal" role="form" method="post">
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon">
								<i class="glyphicon glyphicon-user"></i>
							</span> 
							<input id="login-username" type="text" class="form-control" name="username" placeholder="id를 입력해주세요.">
						</div>

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon">
								<i class="glyphicon glyphicon-lock"></i>
							</span> 
							<input id="login-password"type="password" class="form-control" name="password" placeholder="password를 입력해주세요.">
						</div>

						<div class="input-group">
							<div class="checkbox">
								<label> 
									<input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
								</label>
							</div>
						</div>

						<div style="margin-top: 10px" class="form-group">
							<!-- Button -->
							<div class="col-sm-12 controls">
								<!-- <a id="btn-login" href="/main.do" class="btn btn-success">Login </a> -->
								<button id="btn-login" class="btn btn-success">login</button> 
								<a id="btn-Join" href="/insertMemberJoin.do" class="btn btn-primary">Sign Up</a>
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-12 control">
								<div style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">Forgot id or password? 
									<a href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()" style="color:black;"> Click to find </a>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

</layoutTag:layout>