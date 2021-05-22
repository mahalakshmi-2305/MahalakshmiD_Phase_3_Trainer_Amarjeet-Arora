<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
body {
	background-image: url("img/men_shoes/mm1.jpg");
}

#navbar {
	color: white;
}

#options {
	margin-left: 200px;
	color: white;
}

#sporty {
	color: white;
	font-size: 35px;
	display: inline-block;
}

#admin {
	color: red;
	float: right;
	padding: 15px;
	margin-top: 0px;
	font-size: 20px;
	margin-right: 70px;
}

.col-md1 {
	height: 10px;
	width: 300px;
	color: white;
	text-align: center;
	padding: 40px;
	flex: auto;
}

#header {
	height: 25px;
	border-color: white;
	border: 2px;
}

button {
	height: 35px;
	width: 200px;
	font-family: "Montserrat", Sans-serif;
	font-weight: 600px;
	font-size: 20px;
	box-shadow: 0px 10px 5px;
}

#b1 {
	margin-top: 100px;
}

.col-md2 {
	height: 640px;
	width: 2px;
	background-color: white;
	float: right;
}

a {
	font-size: 25px;
	text-decoration: none;
	color: white;
	line-height: 50px;
	display: block;
}

a:hover {
	
	background-color: silver;
}
</style>
</head>
<body>
	<form method="get"></form>
	<header id="header">
		<a id="admin" href="/adminlogin">logout</a>
		<h1 id="sporty">Sporty Shoes</h1>
		<marquee id="sporty"
			style="text-indent: 500px; margin-left: 400px; width: 500px; color: yellow;"
			scrollamount="10px">Welcome to Admin</marquee>
	</header>
	<div class="col-md1">
		<div class="col-md2"></div>
		<br> <br> <a id="b1" href="/productslist">Products List</a><br>
		<br> <a href="/addproduct">Add Product</a><br>
		<br> <a href="/updateproduct">Update Product</a><br>
		<br> <a href="/deleteproduct">Delete Product</a><br>
		<br>

	</div>

</body>
</html>