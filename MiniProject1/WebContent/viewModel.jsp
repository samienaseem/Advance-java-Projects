<%@page import="booksDetail.BooksDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
	th,td{
		padding: 10px;

	}
</style>
<body>
<%@page import="java.util.ArrayList"  %>
<% ArrayList ab=(ArrayList)request.getAttribute("Arraylist");
	  booksDetail.BooksDetails a=(BooksDetails)ab.get(0); 
	 out.write(a.getName()+""); 
	%>
<h1>Your requested book details are</h1>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>Author Name</th>
			<th>Price</th>
		</tr>

		<tr>
			<td><%=a.getName() %></td>
			<td><%=a.getAuthorName() %></td>
			<td><%=a.getPrice() %></td>
		</tr>

	</table>
	
	<a href="http://localhost:4949/MiniProject1">Back to homepage</a>



</body>
</html>