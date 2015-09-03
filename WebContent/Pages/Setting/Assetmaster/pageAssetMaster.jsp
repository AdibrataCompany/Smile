<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Lesing And Consumer Finance Leasing</title>

</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="assetmaster.action" theme="simple">
			<center>
				<h2>Asset Master</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="assettypeid" id="assettypeid" />
				<s:hidden name="assettypedescription" id="assettypedescription" />
				<s:hidden name="assettypecode" id="assettypecode" />
				<s:label name="message" />

				<table width="100%">
					<tr>
						<td width="20%">Asset Type Code</td>
						<td colspan="3"><s:label name="assettypecode"></s:label></td>

					</tr>
					<tr>
						<td width="20%">Asset Type Description</td>
						<td colspan="3"><s:label name="assettypedescription"></s:label></td>
					</tr>
				</table>
				<div class="col-lg-6">
					<div class="input-group">
						<span class="input-group-addon"> <s:select
								name="searchcriteria" class="btn btn-xs" headerKey=""
								headerValue="Search Criteria"
								list="#{'brand':'Brand','type':'Type','mode':'Model','assetcode':'Code'}" />


						</span> <input type="text" class="form-control" placeholder="Pencarian"
							name="searchvalue"> <span
							class="input-group-btn">
							<button class="btn btn-default" type="submit" onclick="search()">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
					<!-- /input-group -->
				</div>
				<div class="col-lg-6" align="right">
					<%@include file="/Pages/EntryMaster.jsp"%>
				</div>

				<br>
				<s:label name="message"></s:label>
				<br>
				<table width="100%" class="table table-bordered">
					<tr>
						<th style="text-align: center;">Code</th>
						<th style="text-align: center;">Brand</th>
						<th style="text-align: center;">Type</th>
						<th style="text-align: center;">Model</th>
						<th style="text-align: center;" width="5%">Pilih</th>
					</tr>
					<s:iterator value="lstassetmaster">
						<tr id="row_${id}">
							<td>${assetCode}</td>
							<td>${brand}</td>
							<td>${type}</td>
							<td>${model}</td>
							<td><input type="radio" name="id" value="${id}" checked /></td>
						</tr>
					</s:iterator>
				</table>
				<%@include file="/Pages/Paging.jsp"%>
			</center>
		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
</html>