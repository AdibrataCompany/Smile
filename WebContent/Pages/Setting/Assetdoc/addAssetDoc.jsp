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
		<s:form action="assetdoc.action" theme="simple" validate="true">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<h2>Asset Document Master</h2>
					<s:hidden name="mode" id="mode" value="" />
					<s:hidden name="id" />
					<s:label name="message" id="message" />
					<table class="table table-striped">
						<tr>
							<td>Code</td>
							<td><s:textfield name="documentCode" style="width:95%"
									placeholder="Document Code" class="form-control" /></td>
						</tr>
						<tr>
							<td>Name</td>
							<td><s:textfield name="documentName" style="width:95%"
									placeholder="Document Name" class="form-control" /></td>
						</tr>
						<tr>
							<td>Asset Type</td>
							<td><s:textfield name="assetType" style="width:95%"
									placeholder="Asset Type" class="form-control" /></td>
						</tr>
					</table>
					<br>
					<table width="100%">
						<tr>
							<td><button class="btn btn-sm btn-primary" type="submit"
									onclick="end()">Back</button></td>
							<td colspan="2" align="right">
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="saveadd()">Save</button>
							</td>
						</tr>
					</table>

				</div>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function saveadd() {
		document.getElementById("mode").value = "saveadd";
	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>