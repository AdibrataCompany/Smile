<%@page import="org.apache.struts2.components.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SMILE - Smart Lesing And Consumer Finance Lesing</title>
</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<%@include file="/Pages/Header.jsp"%>
		<s:form action="inscoyreg.action" theme="simple">
			<h2>Insurance Company Master</h2>
			<s:hidden name="mode" id="mode" value="" />
			<s:label name="massage" id="massage" />
			<div class="table-responsive">
				<table width="100%">
					<tr>
						<td width="100%">Search</td>
						<td><div align="left" class="form-inline">
								<select name="searchcriteria">
									<option value="0">Search Criteria</option>
									<option value="name">Name</option>
									<option value="address">Address</option>
									<option value="rt">RT</option>
									<option value="rw">RW</option>
									<option value="kelurahan">Kelurahan</option>
									<option value="kecamatan">Kecamatan</option>
									<option value="city">City</option>
									<option value="zipcode">Zipcode</option>
									<option value="areaphone1">Area Phone 1</option>
									<option value="phoneno1">Phone 1</option>
									<option value="areaphone2">Area Phone 2</option>
									<option value="phoneno2">Phone 2</option>
									<option value="areafax">Area Fax</option>
									<option value="faxno">No Fax</option>
									<option value="handphone">Handphone</option>
								</select>
								<s:textfield name="searchvalue" style="width:200px"
									placeholder="Search Value" class="form-control" />
								<button class="btn btn-sm btn-primary" type="submit"
									onclick="search()">Search</button>
							</div></td>

						<td align="right" <%@include file="/Pages/EntryMaster.jsp" %>></td>
					</tr>
				</table>
			</div>
			<br>
			<s:label name="message"></s:label>
			<br>
			<div class="table-responsive">
				<table class="table table-bordered">
					<tr>
						<th style="text-align: center;">Nama</th>
						<th style="text-align: center;">Alamat</th>
						<th style="text-align: center;">RT</th>
						<th style="text-align: center;">RW</th>
						<th style="text-align: center;">Kelurahan</th>
						<th style="text-align: center;">Kecamatan</th>
						<th style="text-align: center;">City</th>
						<th style="text-align: center;">Zipcode</th>
						<th style="text-align: center;">Area Phone 1</th>
						<th style="text-align: center;">Phone 1</th>
						<th style="text-align: center;">Area Phone 2</th>
						<th style="text-align: center;">Phone 2</th>
						<th style="text-align: center;">Area Fax</th>
						<th style="text-align: center;">No Fax</th>
						<th style="text-align: center;">Handphone</th>
					</tr>
					<s:iterator value="">
						<tr id="row_${id}">
							<td>${name}</td>
							<td>${address}</td>
							<td>${rt}</td>
							<td>${rw}</td>
							<td>${kelurahan}</td>
							<td>${kecamatan}</td>
							<td>${city}</td>
							<td>${zipcode}</td>
							<td>${areaphone1}</td>
							<td>${phoneno1}</td>
							<td>${areaphone2}</td>
							<td>${phoneno2}</td>
							<td>${areafax}</td>
							<td>${faxno}</td>
							<td>${handphone}</td>
							<td colspan="2" style="text-align: center;"><input
								type="radio" name="id" value="${id}" /></td>
						</tr>
					</s:iterator>
				</table>
			</div>
			<%@include file="/Pages/Paging.jsp"%>

		</s:form>
		<%@include file="/Pages/Footer.jsp"%>
	</div>

</body>
<script type="text/javascript">
	function Search() {
		document.getElementById("mode").value = "search";
	}
</script>
</html>