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

		<s:form action="assetdoc.action" theme="simple">
			<center>
				<h2>Asset Document Master</h2>
				<s:hidden name="mode" id="mode" value="" />
				<s:label name="message" id="message" />
				<s:hidden name="assettypeid" id="assettypeid" />
				<s:hidden name="assettypecode" id="assettypecode" />
				<s:hidden name="assettypedescription" id="assettypeid" />
				<br>
				<div class="table-responsive">
					<table width="100%" class="table table-bordered table-hover table-striped">
						<tr>
							<td width="20%">Asset Type Code</td>
							<td colspan="3"><s:label name="assettypecode"></s:label></td>

						</tr>
						<tr>
							<td width="20%">Asset Type Description</td>
							<td colspan="3"><s:label name="assettypedescription"></s:label></td>

						</tr>
						<tr>
							<td width="10%"><s:select name="searchcriteria"
									class="btn btn-xs" headerKey="" headerValue="Search Criteria"
									list="#{'documentcode':'Code','assettype':'AsseType'}" /></td>
							<td width="20%">
								<div class="input-group">
									<s:textfield name="searchvalue" placeholder="Search value"
										class="form-control" />
									<span class="input-group-btn">
										<button class="btn btn-xs btn-primary" type="submit"
											onclick="search()">Search</button>
									</span>
								</div>
							</td>

							<td align="right"><%@include file="/Pages/EntryMaster.jsp"%></td>
						</tr>

					</table>
				</div>
				<br>
				<div class="table-responsive">
					<table class="table table-bordered table-hover" >
						<tr>
							<th style="text-align: center;">Code</th>
							<th style="text-align: center;">Name</th>

							<th style="text-align: center;" width="5%">Pilih</th>

						</tr>
						<s:iterator value="lstassetdocmasters">
							<tr id="row_${id}">
								<td>${documentCode}</td>
								<td>${documentName}</td>

								<td colspan="2" style="text-align: center;"><input
									type="radio" name="id" value="${id}" /></td>
							</tr>
						</s:iterator>
					</table>
				</div>

				<%@include file="/Pages/Paging.jsp"%>
				<table width="100%">
					<tr>
						<td align="left">
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="end()">Back</button>
						</td>
					</tr>
				</table>
			</center>
		</s:form>
		<%@include file="/Pages/Footer.jsp"%>
	</div>

</body>

</html>