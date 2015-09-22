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

		<s:form action="perscustfamilyinfo.action" theme="simple">
			<center>
				<h2>Personal Customer - Family Info</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />
				<s:hidden name="customerid" />
				<table width="100%" border="1">
					<tr>
						<th colspan="5">FAMILY DATA</th>
					</tr>
					<tr>
						<th>Name</th>
						<th>ID Number</th>
						<th>Birth Date</th>
						<th>Relationship</th>
						<th><button type="submit" onclick="delfamily()">DELETE</button></th>
					</tr>
					<s:iterator value="lstfamily" status="stat">
						<tr>
							<td>${name}</td>
							<td>${idnumber}</td>
							<td>${birthdate}</td>
							<td>${familyrelationcode}</td>
							<td><input type="radio" name="seqno"
								value="<s:property value="#stat.count"/>" checked />
						</tr>
					</s:iterator>
					<tr>
						<td><input type="text" name="name" /></td>
						<td><input type="text" name="idnumber" /></td>
						<td><input type="text" name="birthdate" /></td>
						<td><select name="familyrelationcode">
								<option value="">Select One</option>
						</select></td>
						<td><button type="submit" onclick="addfamily()">ADD</button></td>
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
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>