<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

input[type=submit]:hover {
    background-color: #45a049;
}
</style>

</head>
<body>
	<h2>Student Form</h2>
	
	<form action="student" method="post">
	<fieldset>
	<legend>Student Form</legend>
	ID: <input type="text" name="id"/> <br/>
	Name: <input type="text" name="name" /> <br/>
	Address: <input type="text" name="address" /> <br/>
	Gender: <input type="radio" name="gender" value="Male"> Male
	&nbsp; &nbsp;
	<input type="radio" name="gender" value="Female"/>Female <br/>
	Country:
	<select name="country">
		<option value="">--Select Country</option>
		<option value="Nepal">Nepal</option>
		<option value="USA">USA</option>
		<option value="China">China</option>
		<option value="UK">UK</option>
		<option value="Japan">Japan</option>
	</select>
	<br/><br/>
	<input type="submit" value="Submit">
	
	</fieldset>
	</form>

</body>
</html>