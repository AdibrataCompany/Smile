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
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<table width="100%">
					<tr>
						<td width="20%">Asset Type Code</td>
						<td colspan="3"><s:label name="assettypecode"></s:label></td>

					</tr>
					<tr>
						<td width="20%">Asset Type Description</td>
						<td colspan="3"><s:label name="assettypedescription"></s:label></td>
					</tr>
					<tr>
						<td width="10%">Searching</td>
						<td><s:select name="searchcriteria" class="btn btn-xs"
								headerKey="" headerValue="Search Criteria"
								list="#{'assetbrand':'Brand','assettype':'Type','assetmodel':'Model','assetcode':'Code'}" />
							<input type="text" name="searchvalue" placeholder="Search value" />
							<div class="input-group">
								<s:textfield name="searchvalue" placeholder="Search value"
									class="form-control" />
								<span class="input-group-btn">
									<button class="btn btn-xs btn-primary" type="submit"
										onclick="search()">Search</button>
								</span>
							</div></td>
						<td align="right"><%@include file="/Pages/EntryMaster.jsp"%></td>
					</tr>
				</table>

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
					<s:iterator value="lstAssetMaster">
						<tr id="row_${id}">
							<td>${assetcode}</td>
							<td>${assetbrand}</td>
							<td>${assettype}</td>
							<td>${assetmodel}</td>
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