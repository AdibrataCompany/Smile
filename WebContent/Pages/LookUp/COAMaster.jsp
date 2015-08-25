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
		<center>
			<h2>COA Master</h2>
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<table class="table table-bordered">
				<tr>
					<th style="text-align: center;">Kode</th>
					<th style="text-align: center;">Nama</th>
					<th style="text-align: center;">Keterangan</th>
					<th style="text-align: center;" width="5%">Pilih</th>
				</tr>
				<s:iterator value="lstBankAccount">
					<tr id="row_${id}">
						<td>${coacode}</td>
						<td>${coaName}</td>
						<td>${coaDescription}</td>
						<td style="text-align: center;"><input type="radio" name="id"
							value="${id}" checked /></td>
					</tr>
				</s:iterator>
			</table>
			<br>
			<table width="100%">
				<tr>
					<td><button type="submit" onclick="back()"
							class="btn btn-sm btn-primary">Kembali</button></td>
					<td align="right"><button type="submit" onclick="savelookup()"
							class="btn btn-sm btn-primary">Simpan</button></td>
				</tr>
			</table>
		</center>
	</div>
</body>
<script type="text/javascript">
	function back() {
		window.close();
	}
	function savelookup() {
		//eval
		window.close();
		document.getElementById("mode").value = "savedel";
	}
</script>
</html>