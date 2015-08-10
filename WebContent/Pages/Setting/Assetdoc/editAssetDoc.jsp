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
					<div align="left" class="form-group">
						<label>Code</label>
						<div align="left" class="form-inline">
							<s:textfield name="documentCode" style="width:95%"
								placeholder="Asset Document Code" class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Name </label>
						<div align="left" class="form-inline">
							<s:textfield name="documentName" style="width:95%"
								placeholder="Asset Document Name" class="form-control" />
						</div>
					</div>

					<div align="left" class="form-group">
						<label>Asset Type </label>
						<div align="left" class="form-inline">
							<s:textfield name="assettype" style="width:95%"
								placeholder="Asset Type" class="form-control" />
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
									onclick="saveedit()">Save</button>
							</td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
	<!-- 	</div> -->

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