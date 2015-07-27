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

		<s:form action="journalscheme.action" theme="simple">
			<center>
				<h2>Journal Scheme</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<br>
				<div class="col-lg-6">
					<div class="input-group">
						<span class="input-group-addon"> <select
							name="searchcriteria">
								<option value="">Pilih Parameter</option>
								<option value="coaSchmCode">COA Scheme Code</option>
								<option value="coaSchmDesc">COA Scheme Description</option>
								<option value="isActive">Active</option>
						</select>
						</span> <input type="text" class="form-control" placeholder="Pencarian"
							name="searchvalue"> <span class="input-group-btn">
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
				<table class="table table-bordered">
					<tr>
						<th style="text-align: center;">COA Scheme Code</th>
						<th style="text-align: center;">COA Scheme Description</th>
						<th style="text-align: center;">Active</th>
						<th style="text-align: center;" width="5%"><button
								class="btn btn-xs btn-default" type="submit" onclick="detail()">Detail</button></th>
					</tr>
					<s:iterator value="lstcoaSchmHdr">
						<tr id="row_${id}">
							<td>${coaSchmCode}</td>
							<td>${coaSchmDesc}</td>
							<td>${isActive}</td>
							<td style="text-align: center;"><input type="radio"
								name="id" value="${id}" checked /></td>
						</tr>
					</s:iterator>
				</table>
				<%@include file="/Pages/Paging.jsp"%>
			</center>

		</s:form>
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function search() {
		document.getElementById("mode").value = "search";
	}
	function detail() {
		document.getElementById("mode").value = "detail";
	}
</script>
</html>