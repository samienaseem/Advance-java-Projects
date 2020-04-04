<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact manager</title>
    </head>
    <body>
       <div align="center">
       
       <h1>contact list</h1>
       
       <h4><a href="AddNew">Add New Contact</a></h4>
       
       <table border="2" cellpadding="7">
       
       	<tr>
       		<th>ID</th>
       		<th>Name</th>
       		<th>Email</th>
       		<th>Address</th>
       		<th>Phone</th>
       	</tr>
       	
       	<c:forEach items="${List}" varStatus="status" var="temp">
       	
       		<tr>
       			<td>${status.index+1}</td>
       			<td>${temp.name}</td>
       			<td>${temp.email}</td>
       			<td>${temp.address}</td>
       			<td>${temp.telephone}</td>
       		</tr>
       	
       	</c:forEach>
       	
       	
       
       </table>
       
       </div>
        
    </body>
</html>
