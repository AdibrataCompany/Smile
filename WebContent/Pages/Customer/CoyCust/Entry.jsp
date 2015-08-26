<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://getbootstrap.com/examples/navbar-fixed-top/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SMILE - Smart Leasing And Consumer Finance</title>
</head>
<body>
	<%@include file="/Pages/Menu.jsp"%>
	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<!-- 	<div class="jumbotron"> -->
		<br> <br>
		<%@include file="/Pages/Header.jsp"%>

		<s:form action="coycust.action" theme="simple">
			<center>
				<h2>Company Customer - Add</h2>
				<s:hidden name="mode" id="mode" />
				<s:hidden name="id" />
				<s:label name="message" id="message" />
				<s:hidden name="customerid" />
				<s:hidden name="personalcustomertype" />
				<s:hidden name="name" />
				<s:hidden name="npwp" />
				
				
				<s:hidden name="customerid" />

				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">COMPANY DATA</th>
					</tr>
					<tr>
						<td width="20%">Name</td>
						<td width="30%"><s:label name="name" /></td>
					</tr>
					<tr>
						<td width="20%">NPWP</td>
						<td width="30%"><s:label name="npwp" /></td>
					</tr>
					<tr>
						<td width="20%">Company Type</td>
						<td width="30%"><s:select name="companytype" headerKey=""
								headerValue="Select One" list="#{'xxx':'xxx'}" /></td>
					</tr>
					<tr>

						<td width="20%">Industry Type</td>
						<td width="30%"><s:select name="industrytypeid" headerKey=""
								headerValue="Select One" list="#{'xxx':'xxx'}" /></td>
					</tr>
					<tr>
						<td width="20%">Number of Employees</td>
						<td width="30%"><s:textfield name="numberofemployees"
								class="form-control" /></td>
					</tr>
					<tr>
						<td width="20%">Year Of Established</td>
						<td width="30%" colspan=3><s:textfield name="yearofestablished"
								class="form-control" /></td>
						
					</tr>
					<tr>
						<td width="20%">Building Management Phone</td>
						<td width="30%"><div align="left" class="form-inline"><s:textfield name="pengelolagedungareaphone"
								class="form-control" style="width:60px" /> - <s:textfield
								name="pengelolagedungphone" class="form-control" style="width:100px" /></div></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">COMPANY ADDRESS</th>
					</tr>
					<tr>
						<td width="20%">Address</td>
						<td colspan="3"><s:textarea name="address"
								class="form-control" placeholder="Address" /></td>
					</tr>
					<tr>
						<td width="20%">RT/RW</td>
						<td width="30%"><div align="left" class="form-inline">
								<s:textfield name="rt" placeholder="RT" class="form-control"
									style="width:60px" />
								/
								<s:textfield name="rw" placeholder="RW" class="form-control"
									style="width:60px" />
							</div></td>

					</tr>
					<tr>
						<td>Kelurahan</td>
						<td><s:textfield name="kelurahan" placeholder="Kelurahan"
								style="width:100px" class="form-control" /></td>
					</tr>
					<tr>
						<td>Kecamatan</td>
						<td><s:textfield name="kecamatan" placeholder="Kecamatan"
								class="form-control" /></td>
					</tr>

					<tr>
						<td>City</td>
						<td><s:textfield name="city" placeholder="City"
								class="form-control" /></td>
					</tr>
					<tr>
						<td width="20%">Zip Code</td>
						<td width="30%"><s:textfield name="zipcode"
								class="form-control" placeholder="Zip Code" style="width:100px" /></td>
					</tr>
					<tr>
						<td>Phone 1</td>
						<td><div align="left" class="form-inline">
								<s:textfield name="areaphone1" placeholder="Area"
									style="width:60px" class="form-control" />
								-
								<s:textfield name="phoneno1" style="width:100px"
									placeholder="Phone 1" class="form-control" />
							</div></td>
					</tr>
					<tr>

						<td>Phone 2</td>
						<td><div align="left" class="form-inline">
								<s:textfield name="areaphone2" placeholder="Area"
									style="width:60px" class="form-control" />
								-
								<s:textfield name="phoneno2" placeholder="Phone 2"
									class="form-control" style="width:100px" />
							</div></td>
					</tr>
					<tr>

						<td>Fax</td>
						<td><div align="left" class="form-inline">
								<s:textfield name="areafax" placeholder="Area"
									style="width:60px" class="form-control" />
								-
								<s:textfield name="faxno" style="width:100x" placeholder="Fax" />
							</div></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">BANK ACCOUNT</th>
					</tr>
					<tr>
						<td width="20%">Bank Name</td>
						<td width="30%"><s:textfield name="bankcode" placeholder=""
								class="form-control" /></td>
						<td width="20%">Account No.</td>
						<td width="30%"><s:textfield name="accountno" placeholder=""
								class="form-control" /></td>
					</tr>
					<tr>
						<td width="20%">Bank Branch</td>
						<td width="30%"><s:textfield name="bankbranch" placeholder=""
								class="form-control" /></td>
						<td width="20%">Account Name</td>
						<td width="30%"><s:textfield name="accountname"
								class="form-control" placeholder="" /></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">LEGAL DOCUMENT OF ESTABLISHED DATA</th>
					</tr>
					<tr>
						<td width="20%">Legal Document No.</td>
						<td width="30%"><s:textfield name="nodocumentofestablished"
								class="form-control" placeholder="" /></td>
						<td width="20%">Last Changes of Legal Doc No.</td>
						<td width="30%"><s:textfield
								name="lastnodocumentofestablished" placeholder=""
								class="form-control" /></td>
					</tr>
					<tr>
						<td width="20%">Legal Document Date</td>
						<td width="30%"><s:textfield name="dateDocumentofestablished"
								class="form-control" placeholder="" /></td>
						<td width="20%">Last Changes of Legal Doc Date</td>
						<td width="30%"><s:textfield
								name="lastdatedocumentofestablished" placeholder=""
								class="form-control" /></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">NOTARY DATA</th>
					</tr>
					<tr>
						<td width="20%">Notary Name</td>
						<td width="30%"><s:textfield name="notaryname" placeholder=""
								class="form-control" /></td>
						<td width="20%">Last Changes of Notary Name</td>
						<td width="30%"><s:textfield name="lastnotaryname"
								class="form-control" placeholder="" /></td>
					</tr>
					<tr>
						<td width="20%">Notary Location</td>
						<td width="30%"><s:textfield name="notaryplace"
								class="form-control" placeholder="" /></td>
						<td width="20%">Last Changes of Notary Location</td>
						<td width="30%"><s:textfield name="lastnotaryplace"
								class="form-control" placeholder="" /></td>
					</tr>
				</table>
				<br>
				<table width="100%" border="0" class="table-hover table-responsive">
					<tr>
						<th colspan="4">OTHER DATA</th>
					</tr>
					<tr>
						<td width="20%">Reference</td>
						<td width="30%"><s:select name="reference" headerKey=""
								headerValue="Select One" list="#{'Other':'Other'}" /></td>
						<td width="20%">Did He/She Have Another Loan</td>
						<td width="30%"><s:radio name="isapplycarloanbefore"
								list="#{'1':'Yes','0':'No'}" /></td>
					</tr>
					<tr>
						<td>Active Customer?</td>
						<td><s:radio name="activecustomer"
								list="#{'Active':'Active','Hold':'Hold'}" /></td>
						<td>Other Finance Company Name</td>
						<td><s:textfield name="applycarloancompanyname"
								class="form-control" placeholder="Other Finance Company Name" /></td>
					</tr>
					<tr>
						<td>Notes</td>
						<td colspan="3"><s:textfield name="notes" placeholder="Notes"
								class="form-control" /></td>
					</tr>
				</table>
				<br>
				<table width="100%">
					<tr>
						<td><a href="customer.action"><button type="button">CANCEL</button></a></td>
						<td align="right"><button type="submit" onclick="save()">SAVE</button></td>
					</tr>
				</table>
			</center>
		</s:form>
		
	</div>
	<%@include file="/Pages/Footer.jsp"%>
</body>
<script type="text/javascript">
	function save() {
		document.getElementById("mode").value = "save";
	}
</script>
</html>