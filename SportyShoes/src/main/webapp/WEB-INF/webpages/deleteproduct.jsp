<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../springdemo/path/css/Style.css" rel="stylesheet" type="text/css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@900&display=swap" rel="stylesheet"> 
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet"> 
   
<title>Delete Product Page</title>
<style>
#box1
{
	height:100vh;
	width:300px;
	font-family:"Montserrat",Sans-serif;
	font-weight:600px;
	font-size:24px;
	background-color:white;
	color:white;
	text-align:left;
	padding:0px;
	border-right:solid 1px gray;
	
}
a{
	text-decoration:none;
	color:black;
	padding:20px 40px;
	border-bottom:solid 1px gray;
}
#logout
{
border:none;
}
</style>
</head>
<body>
	
	<div id="box2" class="col-lg-8">
		<h1>Product list</h1>
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Product Desc</th>
					<th>Price</th>
					<th>Stock</th>
					<th>Shipping Details</th>
					<th>Product Photo</th>
					<th>Delete</th>				</tr>
			</thead>
			<tbody>
			   <%
			   Class.forName("org.h2.Driver");

			    Connection con=DriverManager.getConnection("jdbc:h2:file:C:/data/testdb","sa","");
				
			    Statement st=con.createStatement();
			    ResultSet rs=st.executeQuery("select * from product");
    while(rs.next())
    {
    %>
    			<form action="deleteproduct?msg=<%=rs.getString("product_id") %>" method="post">
				<tr>
					<td><%=rs.getString("product_id") %></td>
					<td><%=rs.getString("product_name") %></td>
					<td><%=rs.getString("product_desc") %></td>
					<td><%=rs.getString("price") %></td>
					<td><%=rs.getString("stock") %></td>
					<td><%=rs.getString("shippingdetails") %></td>
					<td><%=rs.getString("productphoto") %></td>
					<td><input type="submit" class="btn btn-danger" value="Delete"></td>
				</tr>
				</form>
				<%
				
		
    } %>
			</tbody>
		</table>
	</div>
	
	
</body>
</html>