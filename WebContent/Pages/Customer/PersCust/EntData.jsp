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

		<s:form action="perscustentdata.action" theme="simple">
			<center>
				<h2>Personal Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<br>
				<s:label name="message" />
				<br>
				<s:textfield name="customerid" />
				<table width="100%" border="1">
					<tr>
						<th colspan="4">ENTERPRENEUR DATA</th>
					</tr>
					<tr>
						<td width="20%">Monthly Fixed Income</td>
						<td width="30%"><s:textfield name="monthlyfixedincome" /></td>
						<td width="20%">Monthly Variable Income</td>
						<td width="30%"><s:textfield name="monthlyvariableincome" /></td>
					</tr>
					<tr>
						<td>Other Business - Name</td>
						<td><s:textfield name="businessname" /></td>
						<td>Other Business - Industry Type</td>
						<td><s:select name="businesstype" header headerKey=""
								headerValue="Select One" list="#{'Others':'Other'}"></s:select></td>
					</tr>
					<tr>
						<td>Other Business - Type</td>
						<td><s:textfield name="businessindustrytypeid" /></td>
						<td>Other Business - Since Year</td>
						<td><s:textfield name="businesssinceyear" /></td>
					</tr>
					<tr>
						<td>Other Business - Job Title</td>
						<td><s:textfield name="businessjobtitle" /></td>
					</tr>
					<tr>
						<td>Monthly Omset</td>
						<td colspan="3">
							<table border="1" width="100%">
								<tr>
									<th width="30%">Year</th>
									<th width="20%">Month</th>
									<th width="30%">Omset</th>
									<td width="10%"><button type="submit" onclick="del()">DELETE</button></td>
								</tr>
								<s:iterator value="lstccinfo" status="stat">
									<tr>
										<td>${year}</td>
										<td>${month}</td>
										<td>${amount}</td>
										<td><input type="radio" name="seqno"
											value="<s:property value="#stat.count"/>" checked /></td>
									</tr>
								</s:iterator>
								<tr>
									<td><input type="text" name="year" /></td>
									<td><select name="month">
											<option value="1">January</option>
											<option value="2">February</option>
											<option value="3">March</option>
											<option value="4">April</option>
											<option value="5">May</option>
											<option value="6">June</option>
											<option value="7">July</option>
											<option value="8">August</option>
											<option value="9">September</option>
											<option value="10">October</option>
											<option value="11">November</option>
											<option value="12">December</option>
									</select></td>
									<td><input type="text" name="amount" /></td>
									<td><button type="submit" onclick="add()">ADD</button></td>
								</tr>
							</table>
						</td>
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
	function del() {
		document.getElementById("mode").value = "del";
	}
	function add() {
		document.getElementById("mode").value = "add";
	}
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>