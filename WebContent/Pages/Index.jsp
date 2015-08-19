<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DMS - Dealer Management System</title>
</head>
<link href="/Smile/Pages/style/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/Smile/Pages/style/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
<link href="/Smile/Pages/style/css/jquery.smartmenus.bootstrap.css"
	rel="stylesheet" type="text/css" />
<!-- Bootstrap core JavaScript
    ================================================== -->
<script type="text/javascript" language="javascript"
	src="/Smile/Pages/style/js/bootstrap.min.js"></script>
<!-- /container -->
<script type="text/javascript" language="javascript"
	src="/Smile/Pages/style/js/jquery.min.js"></script>
<script type="text/javascript" language="javascript"
	src="/Smile/Pages/style/js/jquery.smartmenus.min.js">
	
</script>
<body>
	<div class="container">

		<s:form action="login.action" theme="simple">

			<h1>SMILE - Smart Lesing And Consumer Finance Leasing</h1>
			<center>
				<h3>Please Sign In</h3>
				<table width="30%">
					<tr>
						<td>
							<div style="margin-bottom: 25px" class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-user"></i></span>
								<s:textfield id="username" class="form-control"
									placeholder="Email address" />
							</div>
						</td>
					</tr>
					<tr>
						<td><div style="margin-bottom: 25px" class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock"></i></span><input type="password"
									id="password" name="password" class="form-control"
									placeholder="Password" />
							</div></td>
					</tr>
					<tr>
						<td><input type="checkbox" value="remember-me" />Remember me</td>
					</tr>
					<tr>
						<td><button class="btn btn-lg btn-primary btn-block"
								type="submit" onclick="home()">Sign in</button></td>
					</tr>
				</table>

			</center>
		</s:form>

	</div>
	<!-- /container -->
</body>
</html>