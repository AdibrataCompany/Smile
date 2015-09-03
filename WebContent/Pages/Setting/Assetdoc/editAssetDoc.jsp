<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMIILE - Smart Lesing And Consumer Finance Leasing</title>
</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="assetdoc_save.action" theme="css_xhtml"
			validate="true" method="post">
			<center>
				<h2>Asset Document Master</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />
				<s:hidden name="assettypeid" id="assettypeid" />
				<s:hidden name="assettypecode" id="assettypecode" />
				<s:hidden name="assettypedescription" id="assettypedescription" />
				<br>
				<table width="100%"
					class="table table-bordered table-hover table-striped">
					<tr>
						<td width="20%">Asset Type Code</td>
						<td><s:label name="assettypecode"></s:label></td>

					</tr>
					<tr>
						<td width="20%">Asset Type Description</td>
						<td><s:label name="assettypedescription"></s:label></td>

					</tr>
					<tr>
						<td colspan="2">
							<div align="left" class="form-group">
								<label>Code</label>
								<div align="left" class="form-inline">
									<s:textfield name="documentcode" style="width:95%"
										placeholder="Asset Document Code" class="form-control" />
								</div>
							</div>
							<div align="left" class="form-group">
								<label>Name </label>
								<div align="left" class="form-inline">
									<s:textfield name="documentname" style="width:95%"
										placeholder="Asset Document Name" class="form-control" />
								</div>
							</div>
							<div align="left" class="form-group">
								<label>Is Active </label>
								<div align="left" class="form-inline">
									<s:checkbox name="isactive" value="isactive" />
								</div>
							</div>
							</div> <br> <%@include file="/Pages/Include/SubmitButton.jsp"%>
						</td>
					</tr>
				</table>
			</center>
		</s:form>
		<%@include file="/Pages/Footer.jsp"%>

	</div>

	<!-- 	</div> -->

</body>

</html>