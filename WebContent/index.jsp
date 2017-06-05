<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Discussion</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    <style>
    	input[type=text], select {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=password], select {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 20%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}
.button {
   width: 20%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}


    	#loginPart form {
    	
    		background-image: url("img/backImage.jpg");
    		padding-top: 50px;
		    padding-right: 50px;
		    padding-bottom: 50px;
		    padding-left: 300px;
    	}
    	label{
    		margin-top: 25px;
    		color: #ffffff;
    	}
    	h1:hover{
    		color: red;
  			position: relative;
    	}
    	
    	label:hover {
  			color: red;
  			position: relative;
}
    	input{
    		margin-top: 25px;
    	}
    	
    	body {
    	background-image: url("img/backImage.jpg");
    	background-color:#66ccff;
    	}
    	a{
    		color: #660033;
    	}
    	a:hover{
    	color: red;
  		position: relative;
    	}
    	
    </style>
</head>
<body>
	<div class="container" id="loginPart">
	<h1 style="color:#ffffff">Welcome to Discussion Hub</h1>
	<h2 style="color:#ffffff">Log In</h2>
	<form action="Login" method="post">
		<label id="userName">USER NAME: </label>
		<input type="text" name="username" placeholder="Your User Name..." required />
		<br/>
		<label>PASSWORD: &nbsp;</label>
		<input type="password" name="password"  placeholder="Your Password..." required />
		<br/>
		<input type="submit" value="LOG IN" /> 
	</form>
	<a  class="button" href="signup.jsp">SIGN UP</a>
	</div>
	
	
	
</body>
</html>