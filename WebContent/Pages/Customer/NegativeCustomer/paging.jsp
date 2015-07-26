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
<script type="text/javascript">
	function search() {
		document.getElementById("mode").value = "search";
	}
	function edit() {
		document.getElementById("mode").value = "edit";
	}
	function del() {
		document.getElementById("mode").value = "savedel";
	}
	function add() {
		document.getElementById("mode").value = "add";
	}
</script>
<body>
	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="assetdoc.action" theme="simple">
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<center>
				<table width="95%">
					<tr>
						<td width="25%">Search By</td>
						<td><select name="searchcriteria">
								<option value="0">Parameter</option>
								<option value="documentCode">Document Code</option>
								<option value="documentName">Document Name</option>
								<option value="assetType">Asset Type</option>
						</select></td>
					</tr>
					<tr>
						<td>Search Criteria</td>
						<td><input name="searchvalue" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="search()">Search</button>
						</td>
					</tr>
				</table>
				<br>
				<table width="95%" border="1">
					<tr>
						<th>Document<br>Code
						</th>
						<th>Document<br>Name
						</th>
						<th>Asset<br>Type
						</th>
						<th><button class="btn btn-sm btn-primary" type="submit"
								onclick="edit()">Ubah</button></th>
						<th><button class="btn btn-sm btn-primary" type="submit"
								onclick="del()">Hapus</button></th>
					</tr>
					<s:iterator value="lstAssetDocMasters">
						<tr id="row_<s:property value="id"/>">
							<td>${documentCode}</td>
							<td>${documentName}</td>
							<td>${assetType}</td>
							<td><input type="radio" id="<s:property value="id"/>"
								checked /></td>
							<td><input type="radio" id="<s:property value="id"/>"
								checked /></td>
						</tr>
					</s:iterator>
				</table>
				<left>
				<table width="95%" align="left"></table>
				<tr>
					<td width="30%">
						<button class="btn btn-sm btn-primary" type="submit"
							onclick="first()">|<</button>
						<button class="btn btn-sm btn-primary" type="submit"
							onclick="prev()"><</button>
						<button class="btn btn-sm btn-primary" type="submit"
							onclick="next()">></button>
						<button class="btn btn-sm btn-primary" type="submit"
							onclick="last()">>|</button>
					</td>
					<td colspan="2"><input name="pageNumber" value="1"/>
						<button class="btn btn-sm btn-primary" type="submit"
							onclick="first()">Go</button></td>
				</tr>
				</table>
				<table width="95%">
					<tr>
						<td colspan="2" align="right">
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="add()">Add</button>
						</td>
					</tr>
				</table>
				</left>
			</center>
		</s:form>
	</div>
</body>

</html>