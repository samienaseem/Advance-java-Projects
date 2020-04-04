<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="useBeanMVC1app.studentBean" %>

<jsp:useBean id="student1" class="useBeanMVC1app.studentBean" scope="session"></jsp:useBean>
<jsp:setProperty property="rollNo" name="student1" value="1234"/>
 <jsp:setProperty property="name" name="student1" value="samieNaseem"/>
<jsp:setProperty property="attendance" name="student1" value="80.1"/>


</body>
</html>