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
		<s:form action="assetmaster.action" theme="simple">
			<center>

				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Asset Master</h2>
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<s:hidden name="id" />

<div align="left" class="form-group">
					<label>Brand</label>
					<div align="left" class="form-inline">
						<s:textfield name="assetBrand" style="width:95%"
							placeholder="Asset Brand" class="form-control" />
					</div>
				</div>
				<div align="left" class="form-group">
					<label>Type</label>
					<div align="left" class="form-inline">
						<s:textfield name="assetType" style="width:95%"
							placeholder="Asset Type" class="form-control" />
					</div>
				</div>
				<div align="left" class="form-group">
					<label>Model</label>
					<div align="left" class="form-inline">
						<s:textfield name="assetModel" style="width:95%"
							placeholder="Asset Model" class="form-control" />
					</div>
				</div>
				<div align="left" class="form-group">
				
					<div align="left" class="form-inline">
					<label>Active</label>
						<s:checkbox name="isActive" style="align:left"
							placeholder="Active" class="form-control" />
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