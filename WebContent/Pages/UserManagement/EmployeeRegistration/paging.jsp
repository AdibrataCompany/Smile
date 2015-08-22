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

		<s:form action="employee.action" theme="simple">
			<center>
				<h2>Employee Master</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<table width="100%">
					<tr>
						<td width="10%">Pencarian</td>
						<td><select name="searchcriteria">
								<option value="0">Search Criteria</option>
								<option value="nik">Nik</option>
								<option value="name">Name</option>
								<option value="position">Position</option>
						</select> <input name="searchvalue" placeholder="Search Value" />
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="search()">Search</button></td>

						<td align="right"><%@include file="/Pages/EntryMaster.jsp"%></td>
					</tr>

				</table>
				<br>
				<s:label name="message"></s:label>
				<br>
				<table class="table table-bordered">
					<tr>
						
						<th style="text-align: center;">Name</th>
						<th style="text-align: center;">Position</th>
						<th style="text-align: center;" width="5%">Select</th>

					</tr>
					<s:iterator value="lstemployee">
						<tr id="row_${id}">
							<td>${name}</td>
							<td>${position}</td>
							<td colspan="2" style="text-align: center;"><input
								type="radio" name="id" value="${id}" checked /></td>
						</tr>
					</s:iterator>
				</table>
				<%@include file="/Pages/Paging.jsp"%>

			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function search() {
		document.getElementById("mode").value = "search";
	}
</script>
</html>