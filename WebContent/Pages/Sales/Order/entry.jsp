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
	<s:form action="sales_order.action" theme="simple">
		<center>
			<h1>Sales Entry</h1>
			<input type="text" name="mode" id="mode" style="visibility: hidden;"></input>
			<table>
				<tr>
					<td>
						Customer Name
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Customer Address
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Customer City
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Phone 1
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Phone 2
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Fax
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<br>
						<table>
							<tr>
								<td>
									Asset Code
								</td>
								<td>
									<select>
										<option value=""></option>
									</select>
								</td>
								<td>
									Chasis No.
								</td>
								<td>
									<input name=""/>
								</td>
							</tr>
							<tr>
								<td>
									Brand
								</td>
								<td>
									<s:property value=""/>
								</td>
								<td>
									Engine No.
								</td>
								<td>
									<input name=""/>
								</td>
							</tr>
							<tr>
								<td>
									Type
								</td>
								<td>
									<s:property value=""/>
								</td>
							</tr>
							<tr>
								<td>
									Colour
								</td>
								<td>
									<input name=""/>
								</td>
								<td>
									Sales Price
								</td>
								<td>
									<s:property value=""/>
								</td>
							</tr><tr>
								<td>
									Manufacturing Month
								</td>
								<td>
									<input name=""/>
								</td>
								<td>
									Tax
								</td>
								<td>
									<s:property value=""/>
								</td>
							</tr>
							<tr>
								<td>
									Manufacturing Year
								</td>
								<td>
									<input name=""/>
								</td>
								<td>
									Total Purchase
								</td>
								<td>
									<s:property value=""/>
								</td>
							</tr>
							<tr>
								<td colspan="5" align="right">
									<button class="btn btn-sm btn-primary" type="submit" onclick="tambah()">Add</button>
								</td>
							</tr>
							<tr>
								<td colspan="4">
									<br>
									<table border="1">
										<tr>
											<th>Asset Code</th>
											<th>Asset<br>Description</th>
											<th>Colour</th>
											<th>Chasis No.</th>
											<th>Engine No.</th>
											<th>Manufacturing<br>Month</th>
											<th>Manufacturing<br>Year</th>
											<th>Aging<br>(month)</th>
											<th>Sales<br>Price</th>
											<th>Tax</th>
											<th>Total<br>Sales</th>
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
						</table>
					</td>
				</tr>
				<tr>
					<td>
						Total Unit
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Total Purchase
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Total Tax
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td>
						Grand Total
					</td>
					<td>
						<s:property/>
					</td>
				</tr>
				<tr>
					<td colspan="4" align="right">
						<button class="btn btn-sm btn-primary" type="submit" onclick="simpan()">Save</button>
						<button class="btn btn-sm btn-primary" type="submit" onclick="kembali()">Back</button>
					</td>
				</tr>
			</table>
		</center>
	</s:form>
</body>
</html>