<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style>
	input[type=submit] {
    width: 7%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
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
	Welcome <%= session.getAttribute("activeUser") %>
	
	<hr/>
	
	<a href="studentform.jsp">Go to form.</a>
	<hr/>
	<a href="google.jsp">Google</a>
	<hr/>
	<form action="FetchRecords" method="post">
		<label>Join the discussion!!</label>
		<input type="submit" value="Go" />
	</form>
	
	
	<form action="SignOut" method="get">
		<input type="submit" value="SignOut" />
	</form>
	
</body>
</html>