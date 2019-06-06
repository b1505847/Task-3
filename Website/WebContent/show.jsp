<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	My name is : <%= request.getAttribute("name") %> 
	<br>
	<img alt="picture" src="images/img.jpg">
</body>
</html>