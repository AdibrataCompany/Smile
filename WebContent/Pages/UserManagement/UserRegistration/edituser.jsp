<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Leasing And Consumer Finance System</title>


</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="userreg.action" theme="simple" validate="true">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>User Register- Edit</h2>
					<s:hidden name="mode" id="mode" value="" />
					<s:hidden name="id" />
					<s:label name="message" id="message" />

					<div align="left" class="form-group">
						<label>User Name</label>
						<div align="left" class="form-inline">
							<s:textfield name="username" style="width:95%"
								placeholder="Asset Document Code" class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Password</label>
						<div align="left" class="form-inline">
							<s:password name="password" style="width:95%"
								placeholder="Password " class="form-control" />
						</div>
					</div>

					<div align="left" class="form-group">
						<label>Employee Name</label>
						<div align="left" class="form-inline">
							<s:select list="lstemployee" name="employeeid"
								value="employeename" label="Select Employee" headerKey=""
								headerValue="Select Employee" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Is Active</label>
						<div align="left" class="form-inline">
							<s:checkbox name="isactive" value="isactive" label="Is Active" />
						</div>
					</div>
					<br>
					<table width="100%">
						<tr>
							<td><button class="btn btn-sm btn-primary" type="submit"
									onclick="end()">Back</button></td>
							<td colspan="2" align="right">
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="saveedit()">Save</button>
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
	function saveedit() {

		document.getElementById("mode").value = "saveedit";

	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>