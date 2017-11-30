<%@page import="java.util.List"%>
<%@page import="com.demo.Allien"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title he
re</title>
</head>
<body>
  <%
  Allien alliens  =(Allien) session.getAttribute("allien");
    	out.println(alliens);
  %>
</body>
</html>