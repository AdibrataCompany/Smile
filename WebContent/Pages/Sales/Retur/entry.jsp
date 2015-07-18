<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DMS-Dealer Management System</title>
</head>
<script type="text/javascript">
	function tambah(){
		document.getElementById("mode").value="tambah";
	}
	function del(){
		document.getElementById("mode").value="del";
	}
	function simpan(){
		document.getElementById("mode").value="simpan";
	}
	function kembali(){
		document.getElementById("mode").value="kembali";
	}
</script>
<body>
	<s:form action="sales_retur.action" theme="simple">
		<center>
			<h1>Retur Sales Entry</h1>
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<table>
				<tr>
					<td>
						Sales Order Transaksi
					</td>
					<td>
						<s:textfield name=""/>
					</td>
				</tr>
				<tr>
					<td>
						Sales Date
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Delivery Date
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Type
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Brand
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Model
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Colour
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Manufacturing Month
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Manufacturing Year
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Chasis No.
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Engine No.
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td align="right" colspan="2">
						<button class="btn btn-sm btn-primary" type="submit" onclick="tambah()">Add</button>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<br>
						<table border="1">
							<tr>
								<th>Sales No.</th>
								<th>Sales Date</th>
								<th>Delivery Date</th>
								<th>Asset Code</th>
								<th>Asset Description</th>
								<th>Colour</th>
								<th>Chasis No.</th>
								<th>Engine No.</th>
								<th>Manufacturing<br>Month</th>
								<th>Manufacturing<br>Year</th>
								<th>Aging<br>(month)</th>
								<th><button class="btn btn-sm btn-primary" type="submit" onclick="del()">del</button></th>
							</tr>
						<s:iterator>
							<tr>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td align="center">
									<input type="radio" checked/>
								</td>
							</tr>
						</s:iterator>
						</table>
						<br>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button class="btn btn-sm btn-primary" type="submit" onclick="simpan()">Save</button>
						<button class="btn btn-sm btn-primary" type="submit" onclick="kembali()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>