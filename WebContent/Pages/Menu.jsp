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
			<!-- 	<ul class="nav navbar-nav">
					<li class="dropdown"><a href="null" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false"> Home</a>
						<ul class="dropdown-menu">
							<li><a href="/Smile/home.action">Home</a></li>
						</ul></li>
					<li class="dropdown"><a href="null" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Setting</a>
						<ul class="dropdown-menu">
							<li><a href="/Smile/setting/assetdoc.action">Asset
									Document</a></li>
							<li><a href="/Smile/setting/assetmaster.action">Asset
									Master</a></li>
							<li><a href="/Smile/setting/bankaccount.action">Bank
									Account</a></li>
							<li><a href="/Smile/setting/supplier.action">Supplier</a></li>
							<li><a href="/Smile/setting/journalscheme.action">Journal
									Scheme</a></li>
							<li><a href="/Smile/setting/master.action">Master</a></li>
							<li><a href="/Smile/setting/office.action">Office</a></li>
							<li><a href="/Smile/setting/zipcode.action">Zip Code</a></li>
							<li><a href="/Smile/setting/employee.action">Employee</a></li>
							<li><a href="/Smile/setting/role.action">Role</a></li>
							<li><a href="/Smile/setting/userreg.action">User</a></li>
						</ul></li> -->
			</s:form>
		</div>


		<!--/.nav-collapse -->
	</div>
	</nav>
</body>

</html>