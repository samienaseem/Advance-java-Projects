<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="processform" modelAttribute="student">
	First Name:<form:input path="firstName"/>
	<br><br>
	Last Name:<form:input path="lastName"/>
	<br><br>
	Available Courses:
	<form:select path="course">
		<%-- <form:option value="c"></form:option>
		<form:option value="cpp"></form:option>
		<form:option value="java"></form:option>
		<form:option value="web Development"></form:option> --%>
		
		<form:options items="${student.courses }"/>
	
	</form:select>
	<br><br>
	
	<%-- linux<form:checkbox path="operatingsystem" value="linux"/>
	Android<form:checkbox path="operatingsystem" value="Android"/>
	Windows<form:checkbox path="operatingsystem" value="Window"/>
	Dos<form:checkbox path="operatingsystem" value="Dos"/>
 --%>
 
 	Operating Systems::
 	<form:checkboxes items="${student.operatingsys}" path=""/>	
	<form:button>Submit</form:button>
	

</form:form>

</body>
</html>