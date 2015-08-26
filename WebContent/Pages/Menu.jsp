<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



</head>

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- <a class="navbar-brand">DMS</a> -->
		</div>

		<div id="navbar" class="navbar-collapse collapse">
			<s:form theme="simple">
				<ul class="nav navbar-nav">${menu}</ul>
			
			</s:form>
		</div>


		<!--/.nav-collapse -->
	</div>
	</nav>
</body>

</html>