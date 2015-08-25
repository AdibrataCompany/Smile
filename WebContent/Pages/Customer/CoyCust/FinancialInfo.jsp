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

		<s:form action="coycustfinancialinfo.action" theme="simple">
			<center>
				<h2>Company Customer - Add</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;" />
				<br>
				<s:label name="message" />
				<br>
				<s:textfield name="customerid" />
				<table width="100%" border="1">
					<tr>
						<th colspan="4">FINANCIAL DATA</th>
					</tr>
					<tr>
						<td width="20%">Current Ratio (%)</td>
						<td width="30%"><s:textfield name="currentratio" /></td>
						<td width="20%">Debit Average</td>
						<td width="30%"><s:textfield name="averagedebittransaction" /></td>
					</tr>
					<tr>
						<td width="20%">ROI (%)</td>
						<td width="30%"><s:textfield name="roi" /></td>
						<td width="20%">Credit Average</td>
						<td width="30%"><s:textfield name="averagecredittransaction" /></td>
					</tr>
					<tr>
						<td width="20%">DER (%)</td>
						<td width="30%"><s:textfield name="der" /></td>
						<td width="20%">Balance Average</td>
						<td width="30%"><s:textfield name="averagebalance" /></td>
					</tr>
					<tr>
						<td width="20%">Modal Dasar</td>
						<td width="30%"><s:textfield name="modaldasar" /></td>
						<td width="20%">Time Deposit</td>
						<td width="30%"><s:textfield name="deposito" /></td>
					</tr>
					<tr>
						<td width="20%">Modal Disetor</td>
						<td width="30%"><s:textfield name="modaldisetor" /></td>
						<td width="20%">Collateral Additional</td>
						<td width="30%"><s:textfield name="additionalcollateraltype" /></td>
					</tr>
					<tr>
						<td width="20%">Net Profit Margin</td>
						<td width="30%"><s:textfield name="netprofitmargin" /></td>
						<td width="20%">Collateral Additional Value</td>
						<td width="30%"><s:textfield
								name="additionalcollateralamount" /></td>
					</tr>
					<tr>
						<td width="20%">Bank Account Type</td>
						<td width="30%"><s:select name="bankaccounttype" headerKey=""
								headerValue="Select One" list="#{'Others':'Others'}" /></td>
						<td width="20%">Office Place Status</td>
						<td width="30%"><s:select name="companystatus" headerKey=""
								headerValue="Select One" list="#{'Others':'Others'}" /></td>
					</tr>
					<tr>
						<td width="20%">Existing Loan</td>
						<td width="30%"><s:textfield name="allowanceavailable" /></td>
						<td width="20%">Office Place Since Year</td>
						<td width="30%"><s:textfield name="companystatussinceyear" /></td>
					</tr>
					<tr>
						<td width="20%">Rent Finish Date</td>
						<td width="30%"><s:textfield name="rentfinishdate" /></td>
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