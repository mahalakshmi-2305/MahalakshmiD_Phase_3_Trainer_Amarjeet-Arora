
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
	flex: none;
	margin-left: 50px;
}

input[type="reset"]{
	height: 30px;
	width: 50px;
	background-color: skyblue;
	flex: none;
	margin-left: 50px;
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

#back{
float: right; 
font-size: 20px; 
color: white; 
background-color: black;
height:0px;
width: 65px;
padding: 0px 5px 50px 10px;
text-decoration: none;
}


</style>
</head>
<body>
<h1 align="center" class="heading">Register to SportyShoes.com</h1>
<div class="adminlogin">
<form  method="post">
<table id="table1">

<tr><td><label for="name" >User Name &nbsp;</label></td><td><input type="text" name="name" maxlength="100" required/></td> </tr>
<tr><td><label for="email" >Email &nbsp;</label></td><td><input type="text"  name="email"  required/></td> </tr>
<tr><td><label for="password" >Password  &nbsp;</label></td><td><input type="password" name="password" required="required"/></td> </tr>
<tr><td><label for="adress" >Address  &nbsp;</label></td><td><input type="text" name="adress"  /></td> </tr>
<tr><td><label for="pincode" >PinCode  &nbsp;</label></td><td><input type="text" name="pincode" /></td> </tr>
<tr><td><label for="state" >State  &nbsp;</label></td><td><input type="text" name="state" /></td> </tr>
<tr><td><label for="country" >Country  &nbsp;</label></td><td><input type="text" name="country" /></td> </tr>

<tr><td><a id="back" href="index">HOME</a></td><td><input  type="submit" Value="Register" /><input type="reset" value="Clear"></td>

 </tr>


</table>
</form>
</div>


</body>
</html>