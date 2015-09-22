<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Leasing And Consumer Finance System</title>

<link rel="stylesheet" href="/Smile/Pages/style/css/datepicker.css">
</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="suspendreverse.action" theme="simple">
			<center>
				<h2>Suspend Reverse</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<s:label name="message"></s:label>

				<table width="100%"
					class="table-bordered table-striped table-condensed">
					<tr>
						<td width="20%">Bank Account</td>
						<td><s:select list="lstBankAccount" name="bankAccountid"
								value="bankaccountname" label="Select Bank Account" headerKey=""
								headerValue="Select Bank Account" /></td>
					</tr>
				</table>

				<table width="100%"
					class="table-bordered table-striped table-condensed table-responsive">
					<tr>
						<td width="20%">Value Date</td>
						<td>

							<div align="left" class="input-append date">

								<s:textfield name="valuedate" placeholder="Value Date"
									style="width:150px" class="form-control" />
								<span class="add-on"><i class="icon-th"><img
										src="Pages/style/calendar.png" /></i></span>
							</div>

						</td>
					</tr>
					<tr>
						<td width="20%"
							class="table-bordered table-striped table-condensed table-responsive">Posting
							Date</td>
						<td width="80%">

							<div align="left" class="input-append date ">

								<s:textfield name="postingdate" placeholder="Posting Date"
									style="width:150px" class="form-control" />
								<span class="add-on"><i class="icon-th"><img
										src="Pages/style/calendar.png" /></i></span>

							</div>
						</td>
					</tr>
				</table>
				<table width="100%"
					class="table-bordered table-striped table-condensed">
					<tr>
						<td width="20%">Amount</td>
						<td><s:textfield name="amountstart" style="width:200px"
								placeholder="Amount >" class="form-control" /> and <s:textfield
								name="amountend" style="width:200px" placeholder="Amount <="
								class="form-control" /></td>
					</tr>
					<tr>
						<td width="10%">Search</td>
						<td><div align="left" class="form-inline">
								<select name="searchcriteria">
									<option value="0">Search Critera</option>
									<option value="A.suspendCode">Suspend Code</option>
									<option value="C.code">Currency</option>

								</select>
								<s:textfield name="searchvalue" style="width:200px"
									placeholder="Search value" class="form-control" />
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="search()">Search</button>
							</div></td>
				</table>
				<table width="100%">
					<tr>
						<td align="right"><button class="btn btn-sm btn-success"
								type="submit" onclick="entry()">
								<span class="glyphicon glyphicon-plus-sign"></span><br>Reverse
							</button></td>
					</tr>

				</table>

				<br> <br>

				<table
					class="table table-bordered table-hover table-responsive table-bordered">
					<tr>
						<th style="text-align: center;">Id</th>
						<th style="text-align: center;">Code</th>
						<th style="text-align: center;">Bank Account</th>
						<th style="text-align: center;">Value Date</th>
						<th style="text-align: center;">Posting Date</th>
						<th style="text-align: center;">Amount</th>
						<th style="text-align: center;">Currency</th>
						<th style="text-align: center;">Rate</th>
						<th style="text-align: center;" width="5%">Pilih</th>
					</tr>
					<s:iterator value="lstSuspendReceive">
						<tr id="row_${id}">
							<td>${Id}</td>
							<td>${SuspendCode}</td>
							<td>${BankAccountName}</td>
							<td>${valuedate}</td>
							<td>${postingdate}</td>
							<td style="text-align: right;"><s:property
									value="getText('{0,number,#,##0.00}',{Amount})" /></td>
							<td>${CurrencyCode}</td>
							<td>${CurrencyRate}</td>
							<td colspan="2" style="text-align: center;"><input
								type="radio" name="id" value="${id}" /></td>
						</tr>
					</s:iterator>
				</table>
				<%@include file="/Pages/Paging.jsp"%>

			</center>
		</s:form>
		<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function search() {
		document.getElementById("mode").value = "search";
	}
	function entry() {
		document.getElementById("mode").value = "entry";
	}
</script>
<script type="text/javascript">
	// When the document is ready
	$(document).ready(function() {
		$('.date').datepicker({
			format : "dd/mm/yyyy"
		});
	});
</script>
</html>