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
<title>Insert title here</title>
</head>
<body>
<hr>1. out <br/>
<c:out value="Hello"></c:out>

<hr>2. set <br/>
<c:set var="sallary" value="1000"/>
The sallary is: <c:out value=" ${sallary }"></c:out>

<hr>3. remove <br/>
<c:remove var="salary"/>
The sallary after remove is : <c:out value="${sallary }"></c:out>

<hr>4/ catch <br/>
<c:catch var="e">
	<%int x=5/0; %>
</c:catch>
Exception: ${e}


<hr>5. if <br/>
<c:set var="sallary" value="10000"/>
<c:if test="${sallary > 5000 }">
<p> My salary is: ${sallary}</p>
</c:if>

<hr>6. choose, when, otherwise <br/>
<c:set var="sallary" value="15000"/>
<c:choose>
	<c:when test="${sallary <=5000 }">
	Salary is very low to survive : ${sallary}
	</c:when>
	<c:when test="${sallary ge 10000 }">
	Salary is very good : ${sallary}
	</c:when>
	<c:otherwise>
	Good salary: ${sallary}
	</c:otherwise>

</c:choose>

<hr>7. For Each loop <br/>
<%request.setAttribute("countries", new String[]{"Nepal","China","Japan","USA"}); %>
<c:forEach var="country" items="${countries}">
	${country} <br/> 
</c:forEach>

<hr>8. c url <br/>
<c:url value="/jsp/index.jsp"/>
<a href="<c:url value="/jsp/index.jsp"/>">Index.jsp</a>
<br/>
<a href="${pageContext.request.contextPath}/jsp/index.jsp/">Index2.jsp</a>

<hr>9. redirect <br/>
<c:redirect url="http://google.com.np"/>




</body>
</html>