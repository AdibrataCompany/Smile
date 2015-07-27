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

		<s:form action="assetmaster.action" theme="simple">
			<center>
				<h2>Asset Master</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<table width="100%">
					<tr>
						<td width="10%">Searching</td>
						<td><select name="searchcriteria">
								<option value="">Pilih Kriteria</option>
								<option value="assetLevel">Level 3</option>
						</select> <input type="text" name="searchvalue" placeholder="Masukan Nilai" />
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="search()">Search</button></td>
						<td align="right"><%@include file="/Pages/EntryMaster.jsp"%></td>
					</tr>
				</table>

				<br>
				<s:label name="message"></s:label>
				<br>
				<table width="100%" class="table table-bordered">
					<tr>
						<th style="text-align: center;">Merk</th>
						<th style="text-align: center;">Tipe</th>
						<th style="text-align: center;">Model</th>
						<th style="text-align: center;" width="5%">Pilih</th>
					</tr>
					<s:iterator value="lstAssetMaster">
						<tr id="row_${id}">
							<td>${assetBrand}</td>
							<td>${assetType}</td>
							<td>${assetModel}</td>
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
<script type="text/javascript">
	function search() {
		document.getElementById("mode").value = "search";
	}
</script>
</html>