<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>DMS-Dealer Management System</title>

<link href="../../style/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="../../style/css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css" />
<link href="../../style/css/jquery.smartmenus.bootstrap.css"
	rel="stylesheet" type="text/css" />
<!-- Bootstrap core JavaScript
    ================================================== -->
<script type="text/javascript" language="javascript"
	src="../../style/js/bootstrap.min.js"></script>
<!-- /container -->
<script type="text/javascript" language="javascript"
	src="../../style/js/jquery.min.js"></script>
<script type="text/javascript" language="javascript"
	src="../../style/js/bootstrap.min.js"></script>
<script type="text/javascript" language="javascript"
	src="../../style/js/jquery.min.js"></script>
<script type="text/javascript" language="javascript"
	src="../../style/js/jquery.smartmenus.min.js"></script>
<script type="text/javascript" language="javascript"
	src="../../style/js/jquery.smartmenus.bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script type="text/javascript">
	function cari() {
		document.getElementById("mode").value = "cari";
	}
	function edit() {
		document.getElementById("mode").value = "edit";
	}
	function del() {
		document.getElementById("mode").value = "del";
	}
	function add() {
		document.getElementById("mode").value = "add";
	}
</script>
</head>

<body>
	<%@include file="../../Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="../../Header.jsp"%>
		<s:form action="assetdoc.action" theme="simple">
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<center>
				<table>
					<tr>
						<td>Search By</td>
						<td><select>
								<option value="">Parameter</option>
								<option value="documentCode">Document Code</option>
								<option value="documentName">Document Name</option>
								<option value="assetType">Asset Type</option>
						</select></td>
					</tr>
					<tr>
						<td>Search Criteria</td>
						<td><input name="criteria" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<button class="btn btn-sm btn-primary" type="submit" onclick="search()">Search</button>
						</td>
					</tr>
					<tr>
						<td colspan="2"><br>
							<table border="1">
								<tr>
									<th>Document<br>Code
									</th>
									<th>Document<br>Name
									</th>
									<th>Asset<br>Type
									</th>
									<th><button class="btn btn-sm btn-primary" type="submit" onclick="edit()">Ubah</button></th>
									<th><button class="btn btn-sm btn-primary" type="submit" onclick="del()">Hapus</button></th>
								</tr>
								<s:iterator value="">
									<tr id="row_<s:property value="id"/>">
										<td><s:property value="documentCode" /></td>
										<td><s:property value="documentName" /></td>
										<td><s:property value="assetType" /></td>
										<td><input type="radio" id="<s:property value="id"/>"
											checked /></td>
										<td><input type="radio" id="<s:property value="id"/>"
											checked /></td>
									</tr>
								</s:iterator>
							</table></td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<button class="btn btn-sm btn-primary" type="submit" onclick="add()">Add</button>
						</td>
					</tr>
				</table>
			</center>
		</s:form>
</body>
<script type="text/javascript">
	function search() {
		document.getElementById("mode").value = "search";
	}
	function edit() {
		document.getElementById("mode").value = "edit";
	}
	function del() {
		document.getElementById("mode").value = "del";
	}
	function add() {
		document.getElementById("mode").value = "add";
	}
</script>
</html>