<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SMILE - Smart Lesing And Consumer Finance Leasing</title>


</head>
<body>

	<!-----start-main---->
	<div class="login-form">
		<center>
			<h1>SMILE - Smart Lesing And Consumer Finance Leasing</h1>
		</center>
		<s:label name="message"/>
		<s:form action="login.action">
			<s:textfield name="nama" style="width:95%" value=""
					placeholder="User Name" />
			<s:password name="password" style="width:95%"
				 />
		
				<button class="btn btn-warning" type="submit" onclick="login()">Login</button>
		</s:form>
	</div>

	<%@include file="/Pages/Footer.jsp"%>

</body>
<link href="style/css/style.css" rel='stylesheet' type='text/css' />
<script type="application/x-javascript">
	
function login() {
	alert ("henry");
	document.getElementById("mode").value = "login";
}
	
/* 		addEventListener("load", function() {
			setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1);
		}
 */
	
	

</script>

</html>