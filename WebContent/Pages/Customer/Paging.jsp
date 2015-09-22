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

		<s:form action="customer.action" theme="simple">
			<center>
				<h2>CUSTOMER</h2>
				<s:hidden name="mode" id="mode" />
				<s:label name="message" id="message" />
				<table width="100%">
					<tr>
						<td><s:select name="searchcriteria" headerKey=""
								headerValue="Select Criteria"
								list="#{'name':'Name','fulladdress':'Address' }" /> <s:textfield
								name="searchvalue" placeholder="Keyword" />
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="search()">Cari</button></td>
						<td align="right"><a href="perscust.action">
								<button class="btn btn-sm btn-success" type="button">
									<span class="glyphicon glyphicon-plus-sign"></span><br>Personal
								</button>
						</a> <a href="coycust.action"><button
									class="btn btn-sm btn-success" type="button">
									<span class="glyphicon glyphicon-plus-sign"></span><br>Company
								</button></a>
							<button class="btn btn-sm btn-warning" type="submit"
								onclick="edit()">
								<span class="glyphicon glyphicon-edit"></span><br>Edit
							</button></td>
					</tr>
				</table>
				<br>
				<div class="table-responsive">
					<table class="table table-bordered">
						<tr>
							<th style="text-align: center;">Name</th>
							<th style="text-align: center;">Address</th>
							<th style="text-align: center;">Personal / Company</th>
							<th style="text-align: center;" width="5%">Pilih</th>
						</tr>
						<s:iterator value="lstcustomer">
							<tr id="row_${id}">
								<td>${name}</td>
								<td>${fulladdress}</td>
								<td>${type}</td>
								<td style="text-align: center;"><input type="radio"
									value="${id}" name="id" /></td>
							</tr>
						</s:iterator>
					</table>
				</div>
				<%@include file="/Pages/Paging.jsp"%>
			</center>
			<%@include file="/Pages/Footer.jsp"%>
		</s:form>
	</div>

</body>
<script type="text/javascript">
	function search() {
		document.getElementById("mode").value = "search";
	}

	function edit() {
		document.getElementById("mode").value = "edit";
	}
</script>
</html>