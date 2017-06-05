<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!	public int getMinValue(int[]nums){
	int min =nums[0];
	for(int num:nums){
		if(min > num){
			min=num;
		}
		
	}
	return min ; 
}
%>
<%!	int [] marks= new int []{21,43,53,12,42};%>
	<%= ("Minimum from {21,43,53,12,42} is : "+getMinValue(marks)) %>
</body>
</html>