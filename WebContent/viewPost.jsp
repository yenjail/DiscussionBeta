<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Post</title>
<style>
	#insertForm form{
		
    		padding-top: 10px;
		    padding-right: 10px;
		    padding-left: 50px;
	}
	label{
    		margin-top: 25px;
    		color: #660033;
    	}
    
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

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

tr:hover{background-color:#f5f5f5}

</style>

</head>
<body>
	User: &nbsp; &nbsp; <%=session.getAttribute("activeUser")%><br />
	<hr />
	<h2>Discussion Logs</h2>
	<div class="container" id="discTbl">
		<table>
			<tr>
			<th>Post Number</th>
			<th>Users</th>
			<th>Comments</th>
			</tr>
			<tr>
				<td>
					<c:forEach var="pstID" items="${pstID}">
						<c:out value="${pstID}" /> 
							 <br />
							<hr/>
						</c:forEach>
				</td>
				<td>
					<c:forEach var="usrnm" items="${usrnm}">
						<c:out value="${usrnm}" /> 
           					<br />
							<hr/>
					</c:forEach>
				</td>
				<td>
					<c:forEach var="coment" items="${coment}">
						<c:out value="${coment}" />
        					 <br/>
							<hr/>
					</c:forEach>
				</td>
			</tr>
			</table>
		</div>
			<br/>
			<hr/>
			<br/>

			<div class="container" id="insertForm">
			<form action="ViewPost" method="post">
				<label>User Name:&nbsp;&nbsp; </label> <input type="text" name="usnam" placeholder="You User Name.."> <br/><br/>
			
				<textarea name="coments" rows="10" cols="30" placeholder="Whats in your mind."></textarea>
				<!-- <label>Your Thoughts: </label> <input type="text" name="coments"> -->
				<br/>
				<input type="submit" value="Post" />
				<br/><hr/>
			</form>
			<form action="FetchRecords" method="post">
				<label>Go to Student post</label> <input type="submit" value="Go" />
			</form>
			</div>
			<br/>
			<hr/>
			<br/>
			
			<form action="SignOut" method="get">
			<input type="submit" value="SignOut" />
			</form>
</body>
</html>