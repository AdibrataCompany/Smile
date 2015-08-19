<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>DMS-Dealer Management System</title>

</head>

<body>
	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="coycustshareinfo.action" theme="simple">
			<center>
				<h2>Company Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<br>
				<s:label name="message" />
				<br>
				<s:textfield name="customerid" />
				<table width="100%" border="1">
					<tr>
						<th colspan="7">LEGAL DOCUMENT</th>
					</tr>
					<tr>
						<th>Type</th>
						<th>Document No.</th>
						<th>Date</th>
						<th>Expired Date</th>
						<th>Notes</th>
						<td><button type="submit" onclick="del()">DELETE</button></td>
					</tr>
					<s:iterator value="lstomsetinfo" status="stat">
						<tr>
							<td>${documenttype}</td>
							<td>${documentno}</td>
							<td>${documentdate}</td>
							<td>${documentexpireddate}</td>
							<td>${documentnotes}</td>
							<td><input type="radio" name="seqno"
								value="<s:property value="#stat.count"/>" checked /></td>
						</tr>
					</s:iterator>
					<tr>
						<td><input type="text" name="documenttype" /></td>
						<td><input type="text" name="documentno" /></td>
						<td><input type="text" name="documentdate" /></td>
						<td><input type="text" name="documentexpireddate" /></td>
						<td><input type="text" name="documentnotes" /></td>
						<td><button type="submit" onclick="add()">ADD</button></td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td><a href="customer.action"><button type="button">CANCEL</button></a></td>
						<td align="right"><button type="submit" onclick="save()">SAVE</button></td>
					</tr>
				</table>
			</center>
		</s:form>
	</div>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>