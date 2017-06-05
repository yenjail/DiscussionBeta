<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>

<style>
	 #signupPart form {
    	
    		background-image: url("img/backImage.jpg");
    		padding-top: 50px;
		    padding-right: 50px;
		    padding-bottom: 50px;
		    padding-left: 300px;
    	}
    	label{
    		margin-top: 25px;
    		color: #ffffff;
    		font-size:200%;
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
    	  input[type=text], select {
		    width: 30%;
		    padding: 12px 20px;
		    margin: 8px 0;
		    display: inline-block;
		    border: 1px solid #ccc;
		    border-radius: 4px;
		    box-sizing: border-box;
}

input[type=submit] {
    width: 10%;
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
input[type=password], select {
    width: 30%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
    	
    	
    	
</style>
<body>
<h1 style="color:#ffffff">Welcome to Discussion Hub</h1>

<div class="container" id="signupPart">
		<h2 style="color:#ffffff">Sign Up</h2>
		
		<form action="Signup" method="post">
			<label>Full Name: </label>
			<input type="text" name="fullnameSi" placeholder="Your Full Name...." required>
			<br/>
			<label>Email: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
			<input type="text" name="emailSi" placeholder="Your Email Address...." required />
			<br/>
			<label>User Name: </label>
			<input type="text" name="usernameSi" placeholder="Your User Name (unqiue)...." required >
			<br/>
			<label> Password: &nbsp;&nbsp;</label>
			<input type="password" name="passwordSi" placeholder="Your Password...." required/>
			<br/>
			<label> Re-Password: </label>
			<input type="password" name="re-passwordSi" placeholder="Re-type Password...." required/>
			<br/>
			<input type="submit" value="Sign Up" />
		</form>
		<form action="loginB" method="get">
			<input type="submit" value="Log In">
		</form>
		
		
		
	</div>
</body>
</html>