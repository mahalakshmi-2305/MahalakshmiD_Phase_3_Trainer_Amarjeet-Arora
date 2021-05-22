<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<style type="text/css">
#logo {
	font-family: cursive;
	font-stretch: ultra-condensed;
	margin-left: 150px;
	font-style: oblique;
	color: white;
	font-size: 25px;
	flex: auto;
	float: left;
}

form {
	display: inline-block;
}

input[type="search"] {
	height: 45px;
	width: 400px;
}

#login {
	background-color: white;
	color: blue;
	height: 43px;
	width: 100px;
	font-size: 15px;
	font-style: inherit;
	font-family: serif;
}

#navbar-1 {
	height: 50px;
	background-color: skyblue;
	padding: 10px;
}

#navbar-2 {
	flex: auto;
	height: 50px;
	color: red;
	font-size: 30px;
	background-color: olive;
}

#navbar-4 {
	font-size: 25px;
}

#navbar-3 {
	flex: auto;
	height: 2000px;
	width: 1483px;
}
</style>
</head>
<body>
	<div id="navbar-1">
		<form action="/search" method="get">
			<label id="logo" for="search"> SportyShoes.com </label>
			&nbsp;&nbsp;&nbsp; <input type="search" id="search" name="Search"
				placeholder="Search SportyShoes for Men and Women">


		</form>
		&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
		<form action="/adminlogin">
			<button id="login">Admin Login</button>
		</form>
		&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
		<form action="/userlogin">
			<button id="login">User Login</button>
		</form>
	</div>
	<div id="navbar-2">
		<marquee scrollamount="25px">Protect yourself and others
			from COVID-19</marquee>
	</div>
	<div id="navbar-3">
		<div id="navbar-4">Shop SportyShoes</div>
		<div></div>



	</div>
</body>
</html>