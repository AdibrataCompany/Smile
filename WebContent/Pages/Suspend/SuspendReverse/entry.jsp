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
		<s:form action="suspendreverse.action" theme="simple">
			<center>
				
				<div class="col-md-4">
					<h2>Suspend Reverse</h2>
					<s:hidden name="id" />
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<s:label name="message" />
					<div align="left" class="form-group">
						<label>Bank Account</label>
						<div align="left" class="form-inline">
							<s:label name="bankAccountname" style="width:95%"/>
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Value Date</label>
							<s:label name="valuedate" style="width:95%"/>
					</div>
					<div align="left" class="form-group">
						<label>Amount Receive</label>
						<div align="left" class="form-inline">
							<s:label name="amount" style="width:95%"/>
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Currency Rate</label>
						<div align="left" class="form-inline">
							<s:label name="currencyrate" style="width:95%"/>
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Notes</label>
						<div align="left" class="form-inline">
							<s:textfield name="notes" style="width:95%" placeholder="Notes"
								class="form-control" />
						</div>
					</div>
					<br>
					<table width="100%">
						<tr>
							<td>
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="end()">Back</button>
							</td>
							<td align="right">
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="save()">Save</button>
							</td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
	function end() {
		document.getElementById("mode").value = "end";
	}
</script>
</html>