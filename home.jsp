<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		this is home page</br> ${data} <br /> ${data2} <br/>
	</h1>
	
	
		<a href="registerpage.do">register</a>
	
	
	
	
	<!-- 	<form action="register.do" method="GET">
			Name: <input type="text" name="name" /> 
			Mobile : <input type="text"	name="mobile" />
			Mail :<input type="text" name="mail" />
			<input type="submit" value="register"/>
		</form> -->
</body>
</html>