<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>
</head>

<body>
	<div class="container">

		<s:form action="signin.action" theme="css_xhtml" validate="true"
			method="post">

			<h1>SMILE - Smart Lesing And Consumer Finance Leasing</h1>
			<s:hidden name="mode" id="mode" />
			<s:label name="message"/>
			<center>
				<div class="col-md-8"><img alt="" src=""></div>
				<div class="col-md-4">
					<table width="100%">
						<tr>
							<td>
								<div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span>
									<s:textfield name="username" id="username" class="form-control"
										placeholder="Username" />
								</div>
							</td>
						</tr>
						<tr>
							<td><div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-lock"></i></span>
									<s:password name="password" id="password" class="form-control"
										placeholder="Password" />
								</div></td>
						</tr>
						<tr>
							<td><button class="btn btn-lg btn-primary btn-block"
									type="submit" name="submit">Sign In</button></td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>
	
	<!-- /container -->
</body>
<script type="text/javascript">
	function login() {
		document.getElementById("mode").value = "input";
	}
</script>
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
</html>