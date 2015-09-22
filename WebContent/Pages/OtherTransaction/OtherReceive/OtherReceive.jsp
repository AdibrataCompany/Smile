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
		<s:form action="otherreceive.action" theme="simple">
			<center>
				<h1>Other Receive Transactions</h1>
				<s:hidden name="id" />
				<s:hidden name="bankaccountid" id="bankaccountid" />
				<s:hidden name="bankaccountname" />
				<s:hidden name="currencyid" />
				<s:hidden name="currencycode" />
				<s:hidden name="mode" id="mode" />
				<s:label name="message" id="message" />
				<table width="100%">
					<tr>
						<td width="20%">Receive From</td>
						<td width="30%"><s:textfield name="rcvfrom"
								placeholder="Receive From" /></td>
						<td width="20%">Bank Account</td>
						<td width="30%"><s:label name="bankaccountname" /> - <s:label
								name="currencycode" /></td>
					</tr>
					<tr>
						<td>Reference No</td>
						<td colspan="3"><s:textfield name="reffno"
								placeholder="Refference Number" /></td>
					</tr>
					<tr>
						<td>Value Date</td>
						<td><div class="input-append date">
								<s:textfield name="valuedate" placeholder="Value Date" style="width:150px;"
									class="form-control" />
								<span class="add-on"><i class="icon-th"><img
										src="Pages/style/calendar.png" /></i></span>
							</div></td>
						<td>Receive Amount</td>
						<td><s:textfield name="rcvamount"
								placeholder="Receive Amount" /></td>
					</tr>
					<tr>
						<td valign="top">Notes</td>
						<td colspan="3"><s:textarea name="notes" placeholder="Notes" /></td>
					</tr>
				</table>
				<br> <br>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><button type="submit" class="btn btn-sm btn-primary"
								onclick="deldetail()">Remove</button></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="1" cellpadding="3" cellspacing="1"
					class="tablegrid">
					<tr>
						<th width="5%" style="text-align: center;">Pilih</th>
						<th style="text-align: center;">COA Name</th>
						<th style="text-align: center;">COA Code</th>
						<th style="text-align: center;">Description</th>
						<th style="text-align: center;">Amount</th>
					</tr>
					<tr>
						<td align="center"><button type="submit"
								class="btn btn-sm btn-primary" onclick="adddetail()">Add</button>
						</td>
						<td align="center"><input name="coaname" type="text"
							placeholder="Coa Name">
							<button onclick="lookup()">
								<span class="glyphicon glyphicon-search"></span>
							</button> <s:hidden name="coacode" /></td>
						<td></td>

						<td align="center"><s:textfield cols="30" name="description"
								placeholder="Description" /></td>
						<td align="center"><s:textfield name="amount" type="text"
								placeholder="Amount" /></td>
					</tr>
					<s:iterator value="lstOtherRcvDtl" status="stat">
						<tr>

							<td style="text-align: center;"><input type="radio"
								name="seqno" id="seqno"
								value="<s:property value="#stat.count"/>" checked /></td>
							<td>${coaName}</td>
							<td>${coaCode}</td>
							<td>${description}</td>
							<td style="text-align: right;">${amount}</td>
						</tr>
					</s:iterator>
					<tr>
						<th colspan="4" style="text-align: right;">Total :</th>
						<td align="right">${totalamount}</td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td>
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="end()">Back</button>
						</td>
						<td align="right"><button type="submit" onclick="savetrans()"
								class="btn btn-sm btn-primary">Save</button></td>
					</tr>
				</table>
			</center>
			<%@include file="/Pages/Footer.jsp"%>
		</s:form>
	</div>
	<!-- /container -->
</body>

</html>