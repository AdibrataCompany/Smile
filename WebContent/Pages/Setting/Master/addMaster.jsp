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
		<s:form action="master.action" theme="simple">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Master</h2>
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>

					<div align="left" class="form-group">
						<label>Master Type</label>
						<div align="left" class="form-inline">
						<s:property name="mastertype" class="form-control" />
						</div>
					</div>
					
					<div align="left" class="form-group">
						<label>Master Code</label>
						<div align="left" class="form-inline">
							<s:textfield name="masterCode" style="width:95%"
								placeholder="Master Code" class="form-control" />
						</div>
					</div>
					
					<div align="left" class="form-group">
						<label>Master Value</label>
						<div align="left" class="form-inline">
							<s:textfield name="masterValue" style="width:95%"
								placeholder="Master Value" class="form-control" />
						</div>
					</div>
					
					<br>
					<table width="100%">
						<tr>
							<td>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="end()">Back</button>
							</td>
							<td align="right">
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="saveadd()">Save</button>
							</td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>

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