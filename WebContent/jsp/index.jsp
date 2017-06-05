<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Time: <%out.println(new java.util.Date()); %>
	<br/> 
	Time: <%=new java.util.Date() %> 
	<br/>
	<hr/>
	
	
	<form action="welcome.jsp">
		<label id="userName">USER NAME: </label>
		<input type="text" name="username" required />
		<br/>
		<label>PASSWORD: &nbsp;</label>
		<input type="password" name="password" required />
		<br/>
		<input type="submit" value="Submit" /> 
	</form>


</body>
</html>