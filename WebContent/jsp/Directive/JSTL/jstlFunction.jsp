<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<c:set var="msg" value="Welcome to Java web! JSTL functions. "/>

<hr>contains<br/>
${fn:contains(msg,'Java') } <br/>
${fn:containsIgnoreCase(msg, 'jstl') } <br/>

<c:if test="${fn:containsIgnoreCase(msg, 'jstl') }">
	'jstl' is found in : '${msg}'
</c:if> <br/>
<hr>Length: ${fn:length(msg) }
<hr>${fn:toUpperCase(msg) }
<hr>${fn:toLowerCase(msg) }
</body>
</html>