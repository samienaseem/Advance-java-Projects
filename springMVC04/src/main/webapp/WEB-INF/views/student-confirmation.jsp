<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	The student is confirmed::${student.firstName} ${student.lastName}
	<br><br>
	course::${student.course}
	<br><br>
	Operating systems: 
	<ul>
		<c:forEach var="temp" items="${student.operatingsystem}">
		<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>