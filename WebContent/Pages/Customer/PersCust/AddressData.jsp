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

	<table width="100%" border="0" class="table-hover table-responsive">
		<tr>
			<th colspan="2">LEGAL ADDRESS</th>

		</tr>
		<tr>
			<td width="20%">Address</td>
			<td width="30%"><s:textarea style="width:95%"  placeholder="Legal Address" 
					class="form-control" name="legaladdress" id="legaladdress" /></td>
		</tr>
		<tr>
			<td>RT / RW</td>
			<td>
				<div align="left" class="form-inline">
					<s:textfield style="width:60px" class="form-control" name="legalrt"
						id="legalrt" placeholder="RT" />
					/
					<s:textfield style="width:60px" class="form-control" name="legalrw"
						id="legalrw" placeholder="RW" />
				</div>
			</td>
		</tr>
		<tr>
			<td>Kelurahan</td>
			<td><s:textfield style="width:100px" class="form-control"
					name="legalkelurahan" id="legalkelurahan" placeholder="Kelurahan"/></td>
		</tr>
		<tr>
			<td>Kecamatan</td>
			<td><s:textfield style="width:100px" class="form-control"
					name="legalkecamatan" id="legalkecamatan" placeholder="Kecamatan" /></td>
		</tr>
		<tr>
			<td>City</td>
			<td><s:textfield style="width:100px" class="form-control"
					name="legalcity" id="legalcity" placeholder="City" /></td>
		</tr>
		<tr>
			<td>Zip Code</td>
			<td><s:textfield style="width:100px" class="form-control"
					name="legalzipcode" id="legalzipcode" placeholder="Zip Code" /></td>
		</tr>
		<!-- - Residence Area ---- -->
		<tr>

			<th colspan="2">RESIDENCE ADDRESS
				<button type="button" onclick="copy()">=Legal Address</button>
			</th>
		</tr>
		<tr>
			<td width="20%">Address</td>
			<td width="30%"><s:textarea style="width:95%" 
					class="form-control" name="address" id="address" placeholder="Residence Address" /></td>
		</tr>
		<tr>
			<td>RT / RW</td>
			<td><div align="left" class="form-inline"><s:textfield style="width:60px" class="form-control"
					name="rt" id="rt" placeholder="RT"  /> / <s:textfield style="width:60px"
					class="form-control" name="rw" id="rw" placeholder="RW" /></div></td>
		</tr>
		<tr>
			<td>Kelurahan</td>
			<td><s:textfield style="width:100px" class="form-control" placeholder="Kelurahan" 
					name="kelurahan" id="kelurahan" /></td>
		</tr>
		<tr>
			<td>Kecamatan</td>
			<td><s:textfield style="width:100px" class="form-control" placeholder="Kecamatan" 
					name="kecamatan" id="kecamatan" /></td>
		</tr>
		<tr>
			<td>City</td>
			<td><s:textfield style="width:100px" class="form-control" placeholder="City" 
					name="city" id="city" /></td>
		</tr>
		<tr>
			<td>Zip Code</td>
			<td><s:textfield style="width:100px" class="form-control" placeholder="Zip Code" 
					name="zipcode" id="zipcode" /></td>
		</tr>
		<tr>
			<td>Phone 1</td>
			<td><div align="left" class="form-inline"><s:textfield style="width:60px" class="form-control"
					name="areaphone1" /> - <s:textfield style="width:100px"
					class="form-control" name="phoneno1" /></div></td>
			<td>Phone 2</td>
			<td><div align="left" class="form-inline"><s:textfield style="width:60px" class="form-control"
					name="areaphone2" /> - <s:textfield style="width:100px"
					class="form-control" name="phoneno2" /></div></td>
		</tr>

		<tr>
			<td>Fax</td>
			<td><div align="left" class="form-inline"><s:textfield style="width:60px" class="form-control"
					name="areafax" /> - <s:textfield style="width:100px"
					class="form-control" name="faxno" /></div></td>
		</tr>
	</table>
	<br>


</body>
<script type="text/javascript">
	function copy() {
		document.getElementById("address").value = document
				.getElementById("legaladdress").value;
		document.getElementById("rt").value = document
				.getElementById("legalrt").value;
		document.getElementById("rw").value = document
				.getElementById("legalrw").value;
		document.getElementById("kelurahan").value = document
				.getElementById("legalkelurahan").value;
		document.getElementById("kecamatan").value = document
				.getElementById("legalkecamatan").value;
		document.getElementById("city").value = document
				.getElementById("legalcity").value;
		document.getElementById("zipcode").value = document
				.getElementById("legalzipcode").value;
	}
</script>
</html>