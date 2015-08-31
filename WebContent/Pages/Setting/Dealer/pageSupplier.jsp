<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Lesing And Consumer Finance</title>

</head>
<body>

	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="dealer.action" theme="simple">
			<center>
				<h2>Supplier</h2>
				<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
				<table width="100%">
					<tr>
						<td width="10%">Pencarian</td>
						<td><select name="searchcriteria">
								<option value="0">Pilih</option>
								<option value="name">Name</option>
								<option value="address">Alamat</option>
								<option value="rt">RT</option>
								<option value="rw">RW</option>
								<option value="kelurahan">Kelurahan</option>
								<option value="city">Kota</option>
								<option value="zipcode">Kode Pos</option>
								<option value="type">Tipe</option>
								<option value="phoneNo1">No. Telepon</option>
								<option value="phoneNo2">No. Telepon2</option>
								<option value="faxNo">No. Fax</option>
								<option value="handphone">Handphone</option>
						</select> <input name="searchvalue" placeholder="Masukan Nilai" />
							<button class="btn btn-sm btn-primary" type="submit"
								onclick="search()">Cari</button></td>

						<td align="right"><%@include file="/Pages/EntryMaster.jsp"%></td>

					</tr>
				</table>
				<br>
				<s:label name="message"></s:label>
				<br>
				<table class="table table-bordered">
					<tr>
						<th style="text-align: center;">Nama</th>
						<th style="text-align: center;">Alamat</th>
						<th style="text-align: center;">RT</th>
						<th style="text-align: center;">RW</th>
						<th style="text-align: center;">Kelurahan</th>
						<th style="text-align: center;">City</th>
						<th style="text-align: center;">Zip Code</th>
						<th style="text-align: center;">Type.</th>
						<th style="text-align: center;">Phone1 Area</th>
						<th style="text-align: center;">Phone1 No.</th>
						<th style="text-align: center;">Phone2 Area</th>
						<th style="text-align: center;">Phone2 No.</th>
						<th style="text-align: center;">Fax Area</th>
						<th style="text-align: center;">Fax No.</th>
						<th style="text-align: center;">Handphone</th>
						<th style="text-align: center;" width="5%">Pilih</th>
					</tr>
					<s:iterator value="lstdealer">
						<tr id="row_${id}">
							<td>${name}</td>
							<td>${address}</td>
							<td>${rt}</td>
							<td>${rw}</td>
							<td>${kelurahan}</td>
							<td>${city}</td>
							<td>${zipcode}</td>
							<td>${type}</td>
							<td>${areaphone1}</td>
							<td>${phoneno1}</td>
							<td>${areaphone2}</td>
							<td>${phoneno2}</td>
							<td>${areafax}</td>
							<td>${faxno}</td>
							<td>${handphone}</td>
							<td><input type="radio" id="${id}" checked /></td>
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