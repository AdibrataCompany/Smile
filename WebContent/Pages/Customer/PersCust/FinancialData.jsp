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

		<s:form action="perscustfinancialdata.action" theme="simple">
			<center>
				<h2>Personal Customer - Financial Data</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />
				<s:hidden name="customerid" />
				<table width="100%" border="1">
					<tr>
						<th colspan="4">FINANCIAL DATA</th>
					</tr>
					<tr>
						<td>Spouse's Income</td>
						<td><s:textfield name="spouseincome" />
						<td>Time Deposit</td>
						<td><s:textfield name="deposito" /></td>
					</tr>
					<tr>
						<td>Spouse's Average Balance</td>
						<td><s:select name="avgbalanceaccount" header headerKey=""
								headerValue="Select One" list="#{'Other':'Other'}"></s:select></td>
						<td>Monthly Living Cost</td>
						<td><s:textfield name="livingcostamount" /></td>
					</tr>
					<tr>
						<td>Bank Account Type</td>
						<td><s:textfield name="bankaccounttype" /></td>
						<td>Other Loan Installment</td>
						<td><s:textfield name="otherloaninstallment" /></td>
					</tr>
					<tr>
						<td>Debit Average</td>
						<td><s:textfield name="averagedebittransaction" /></td>
						<td>Collateral Additional</td>
						<td><s:textfield name="additionalcollateraltype" /></td>
					</tr>
					<tr>
						<td>Credit Average</td>
						<td><s:textfield name="averagecredittransaction" /></td>
						<td>Additional Collateral Value</td>
						<td><s:textfield name="additionalcollateralamount" /></td>
					</tr>
					<tr>
						<td>Balance Average</td>
						<td><s:textfield name="averagebalance" /></td>
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