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

		<s:form action="userreg.action" theme="simple">
			<center>
				<h2>User Master</h2>
				<s:hidden name="mode" id="mode" />
				<s:label name="message" id="message" />
				
				<div class="col-lg-6">
					<div class="input-group">
						<span class="input-group-addon"> <s:select
									name="searchcriteria" class="btn btn-xs" headerKey=""
									headerValue="Search Criteria"
									list="#{'B.Nik':'Nik','B.Name':'Name'}" />
						</span> <input type="text" class="form-control" placeholder="Search Value"
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
				<table class="table table-bordered">
					<tr>

						<th style="text-align: center;">Name</th>
						<th style="text-align: center;">Position</th>
						<th style="text-align: center;" width="5%">Select</th>

					</tr>
					<s:iterator value="lstUser">
						<tr id="row_${Id}">
							<td>${EmployeeName}</td>
							<td>${UserName}${Id}</td>
							
							<td colspan="2" style="text-align: center;"><input
								type="radio" name="id" value="${Id}" checked /></td>
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