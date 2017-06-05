<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.Date" %>
<c:set var="todayDate" value="<%= new Date()%>" />
Today date is: ${todayDate }<br/>
Date in format:(yyyy-MM-dd): <fmt:formatDate value="${todayDate }" pattern="yyyy-MM-dd"/>
<br/>
<p>Currency in USA: </p>
<fmt:setLocale value="en_US"/>
<fmt:formatNumber type="currency" value="1000.023"/>

</body>
</html>