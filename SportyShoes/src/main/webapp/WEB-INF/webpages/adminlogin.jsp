
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminLogin page</title>
<style type="text/css">
body{
background-image: url("img/men_shoes/mm1.jpg");

}

input[type="text"]{
	height: 25px;
	width: 200px;

}

input[type="password"]{
	height: 25px;
	width: 200px;

}

input[type="submit"]{
	height: 30px;
	width: 100px;
	background-color: skyblue;
}

.adminlogin{
margin-left: 600px;
color: white;
}
#table1{
line-height: 50px;

}

#home{
font-size: 20px;
color: white;
float: right;
}

.heading{
color: white;

}


</style>
</head>
<body>
<h1 align="center" class="heading">Welcome to AdminLogin Page</h1>
<div class="adminlogin">
<form method="post">
<table id="table1">
<tr> <td>User Name:</td><td><input type="text" name="name" /></td> </tr>

<tr><td> password:</td><td><input type="password" name="pass" /></td> </tr>
<tr ><td><a id="home" href="/index">Home</a></td> <td align="center"><input type="submit" value="AdminLogin" ></td></tr>
</table>
</form>
</div>


</body>
</html>