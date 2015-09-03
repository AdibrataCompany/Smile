<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Lesing And Consumer Finance Leasing</title>

</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="assetmaster_save.action" theme="simple">
			<center>

				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Asset Master</h2>
					<s:hidden name="mode" id="mode" />
					<s:hidden name="assettypeid" id="assettypeid" />
					<s:hidden name="assettypedescription" id="assettypedescription" />
					<s:hidden name="assettypecode" id="assettypecode" />
					<s:label name="message" />
					<div align="left" class="form-group">
						<label>Brand</label>
						<div align="left" class="form-inline">
							<s:textfield name="brand" style="width:95%"
								placeholder="Brand" class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Type</label>
						<div align="left" class="form-inline">
							<s:textfield name="type" style="width:95%"
								placeholder="Type" class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Model</label>
						<div align="left" class="form-inline">
							<s:textfield name="model" style="width:95%"
								placeholder="Model" class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">

						<div align="left" class="form-inline">
							<label>Active</label>
							<s:checkbox name="isactive" style="align:left"
								placeholder="Active" class="form-control" />
						</div>
					</div>
					<br>
					<%@include file="/Pages/Include/SubmitButton.jsp"%>
				</div>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>

</html>