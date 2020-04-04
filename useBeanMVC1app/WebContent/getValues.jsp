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
Roll number is: <jsp:getProperty name="student1" property="rollNo"/><br>
Student Name is : <jsp:getProperty property="name" name="student1"/><br>
Attendance of student is :<jsp:getProperty property="attendance" name="student1"/><br>

</body>
</html>