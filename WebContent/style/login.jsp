<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<link href="login/style/css/style.css" rel='stylesheet' type='text/css' />
	<script type="application/x-javascript">
		addEventListener("load", function() {
			setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1);
		}
	</script>

</head>
<body>
				 <!-----start-main---->
				<div class="login-form">
				<center>
						<h1>Dealer Management System</h1>
				</center>
				<form>
					<li>
						<input type="text" class="text" value="User Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Name';}" ><a href="#" class=" icon user"></a>
					</li>
					<li>
						<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}"><a href="#" class=" icon lock"></a>
					</li>

					 <div class ="forgot">
						<input type="submit" onclick="myFunction()" value="Login" > <a href="#" class=" icon arrow"></a>                                                                                                                                                                                                                                 </h4>
					</div>
				</form>
			</div>

			<div class="copy-right">
			<center>
				<p>@2015 - Technology supported by PT. Adibrata Optima Solusi</p>

			</center>

			</div>
</body>
</html>