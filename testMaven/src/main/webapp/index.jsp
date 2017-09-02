<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>

<form action="index.jsp">
	<input type="text" name="name" />
	<input type="password" name="password" />
	<input type="submit" value="Submit" />
</form>

<a href="index2.jsp">Index2.jsp</a>

<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	
	if(name!=null){
		out.println("Username is " + name);
	}else{
		out.println("Username is NULL");
	}
%>

</body>
</html>
