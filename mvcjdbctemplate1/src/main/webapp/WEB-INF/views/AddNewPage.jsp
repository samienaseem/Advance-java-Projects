<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	  <h1>Add new Contact</h1>
	  <form:form action="savedata" method="post" modelAttribute="contact">
	  
	  <table>
	  
	  `	<tr>
	  		<td>Name: </td>
	  		<td><form:input path="name"/> </td>
	  
	  </tr>
	  
	  <tr>
	  		<td>Email: </td>
	  		<td><form:input path="email"/> </td>
	  
	  </tr>
	  
	  <tr>
	  		<td>Address: </td>
	  		<td><form:input path="address"/> </td>
	  
	  </tr>
	  
	  <tr>
	  		<td>Phone: </td>
	  		<td><form:input path="telephone"/> </td>
	  
	  </tr>
	  
	  <tr>
	  		
	  		
	  		<td colspan="2" align="center"><form:button>submit</form:button></td>
	  
	  </tr>
	  
	  
	  
	  </table>
	  
	  
	  
	  </form:form>
		
	</div>
</body>
</html>