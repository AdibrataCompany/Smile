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
		<s:form action="bankaccount_save.action" theme="simple">
			<center>
				<div class="col-md-4"></div>
				<div class="col-md-4">

					<h2>Bank Account</h2>
					<s:hidden name="id" />
					<input type="text" name="mode" id="mode"
						style="visibility: hidden;"></input>
					<div align="left" class="form-group">
						<label>Bank Name</label>
						<div align="left" class="form-inline">
							<s:textfield name="bankname" style="width:95%"
								placeholder="Bank Name" class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Bank Account Code</label>
						<div align="left" class="form-inline">
							<s:textfield name="bankaccountcode" style="width:95%"
								placeholder="Bank Account Code" class="form-control" />
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Bank Account Name</label>
						<div align="left" class="form-inline">
							<s:textfield name="bankaccountname" style="width:95%"
								placeholder="Bank Account Name" class="form-control" />
						</div>
					</div>

					<div align="left" class="form-group">
						<label>Type</label>
						<div align="left" class="form-inline">
							<select name="type">
								<option value="">Type</option>
								<option value="BA">BANK</option>
								<option value="CA">CASH</option>
							</select>
						</div>
					</div>
					<div align="left" class="form-group">
						<label>Purpose</label>
						<div align="left" class="form-inline">
							<select name="purpose" class="form-control">
								<option value="">Purpose</option>
								<option value="EC">ESCROW</option>
								<option value="PC">PETTY CASH</option>
								<option value="FD">FUNDING</option>

							</select>
						</div>
					</div>
					<%@include file="/Pages/Include/Address.jsp"%>
					<br>
					<table width="100%">
						<tr>
							<td><a href="bankaccount.action"><button
										class="btn btn-sm btn-default" type="button">BACK</button></a></td>
							<td align="right"><s:if test="mode=='edit'">
									<button class="btn btn-sm btn-primary" type="submit"
										onclick="saveedit()">SAVE</button>
								</s:if> <s:else>
									<button class="btn btn-sm btn-primary" type="submit"
										onclick="saveadd()">SAVE</button>
								</s:else></td>
						</tr>
					</table>
				</div>
			</center>
		</s:form>
	</div>

</body>
<script type="text/javascript">
	function saveedit() {
		document.getElementById("mode").value = "saveedit";
	}
	function saveadd() {
		document.getElementById("mode").value = "saveadd";
	}
</script>
</html>