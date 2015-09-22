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


		<s:form action="suspendreceive.action" theme="simple">
			<center>
				<h2>Suspend Receive - Bank Account</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<div class="table-responsive">
					<table width="100%">
						<tr>
							<td width="10%">Search</td>
							<td><select name="searchcriteria">
									<option value="">Criteria</option>
									<option value="bankName">Bank Name</option>
									<option value="bankAccountCode">Bank Account Code</option>
									<option value="bankAccountName">Bank Account Name</option>
							</select> <input type="text" name="searchvalue" placeholder="Search Value" />
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="search()">Search</button></td>
							<td align="right"><button class="btn btn-sm btn-success"
									type="submit" onclick="select()">
									<span class="glyphicon glyphicon-plus-sign"></span><br>Receive
								</button></td>
						</tr>
					</table>
				</div>
				<br>
				<s:label name="message"></s:label>
				<br>
				<div class="table-responsive">
					<table class="table table-bordered">
						<tr>
							<th style="text-align: center;">Bank Name</th>
							<th style="text-align: center;">Bank Account Code</th>
							<th style="text-align: center;">Bank Account Name</th>
							<th style="text-align: center;" width="5%">Select</th>
						</tr>
						<s:iterator value="lstBankAccount">
							<tr id="row_${id}">
								<td>${bankName}</td>
								<td>${bankAccountCode}</td>
								<td>${bankAccountName}</td>
								<td style="text-align: center;"><input type="radio"
									name="id" value="${id}" /></td>
							</tr>
						</s:iterator>
					</table>
				</div>
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
	function select() {
		document.getElementById("mode").value = "select";
	}
</script>
</html>