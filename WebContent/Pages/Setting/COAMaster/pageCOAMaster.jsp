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


		<s:form action="coamaster.action" theme="simple">
			<center>
				<h2>COA Master</h2>
				<s:hidden name="mode" id="mode" value="" />
				<s:label name="message" id="message" />
				<div class="table-responsive">
					<table width="100%">
						<tr>
							<td><select name="searchcriteria">
									<option value="">Search Criteria</option>
									<option value="coaName">Name</option>
									<option value="coaDescription">Description</option>
									<option value="coacode">Coa Code</option>
							</select>
							<s:textfield name="searchvalue" placeholder="Search"
									class="form-control" />
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="search()">Cari</button></td>
							<td align="right"><%@include file="/Pages/EntryMaster.jsp"%>
							</td>
						</tr>
					</table>
				</div>
				<br>
				<s:label name="message"></s:label>
				<br>
				<table class="table table-bordered">
					<tr>
						<th style="text-align: center;">Nama</th>
						<th style="text-align: center;">Keterangan</th>
						<th style="text-align: center;">Kode</th>
						<th style="text-align: center;" width="5%">Pilih</th>
					</tr>
					<s:iterator value="lstBankAccount">
						<tr id="row_${id}">
							<td>${coaName}</td>
							<td>${coaDescription}</td>
							<td>${coacode}</td>
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
</script>
</html>